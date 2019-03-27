import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

class LoginRIGSpace(unittest.TestCase):
    def setUp(self):
        # Choose browser if needed (IE,Chrome)
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(10)
    def test_login_rigspace(self):
        driver = self.driver
        # Open rig_space on standalone and clear the cookies
        driver.get("http://standalone.rig.space/admin/manage/users")
        driver.delete_all_cookies()
        assert "Rigspace Login" in driver.title
        # Enter username
        usr = driver.find_element_by_name("username")
        usr.send_keys("admin")
        usr.send_keys(Keys.TAB)
        # Enter password
        pas = driver.find_element_by_name("password")
        pas.send_keys("1")
        pas.send_keys(Keys.TAB)
        # Click on button "Submit"
        pas.send_keys(Keys.RETURN)
    def tearDown(self):
        self.driver.close()

    if __name__ == "__main__":
        unittest.main()