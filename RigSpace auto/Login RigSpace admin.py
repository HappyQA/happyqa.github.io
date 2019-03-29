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
        driver.delete_all_cookies()
        driver.get("http://standalone.rig.space/admin/")
        assert "Rigspace Login" in driver.title
        # Enter username
        driver.find_element_by_name("username").send_keys("admin")
        # Enter password
        driver.find_element_by_name("password").send_keys("1")
        # Click on button "Submit"
        driver.find_element_by_css_selector("button[type]").send_keys(Keys.RETURN)
        print(driver.get_cookies())

    def tearDown(self):
        self.driver.close()

    if __name__ == "__main__":
        unittest.main()