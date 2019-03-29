import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
# Choose browser if needed (IE,Chrome)
class LoginRIGSpace(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(10)
    # Open rig_space on standalone and clear the cookies
    # Enter username, Enter password, Click on button "Submit"
    def test_login_rigspace(self):
        driver = self.driver
        driver.delete_all_cookies()
        driver.get("http://standalone.rig.space/admin/")
        assert "Rigspace Login" in driver.title
        driver.find_element_by_name("username").send_keys("admin")
        driver.find_element_by_name("password").send_keys("1")
        driver.find_element_by_css_selector("button[type]").send_keys(Keys.RETURN)
    def tearDown(self):
        self.driver.close()
    if __name__ == "__main__":
        unittest.main()