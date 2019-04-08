import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
#Create new event in reporting E2E
class CreateEvent(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(100)
    def test_create_event(self):
        driver = self.driver
        driver.delete_all_cookies()
        driver.get("http://standalone.rig.space/reporting/")
        assert "Rigspace Login" in driver.title
        driver.find_element_by_name("username").send_keys("admin")
        driver.find_element_by_name("password").send_keys("1")
        driver.find_element_by_css_selector("button[type]").send_keys(Keys.RETURN)
        driver.implicitly_wait(100)
        driver.find_element_by_id("main-content").click()
        driver.find_element_by_tag_name("mat-line").click()
        #driver.find_element_by_css_selector('mat-button-wrapper').click()
        #driver.find_element_by_css_selector('Test')
        #driver.find_element_by_css_selector('mat-form-field-infix').click()
        #driver.find_element_by_id("mat-select-4").click()
        #driver.find_element_by_css_selector("button[submit]").click()
    def tearDown(self):
            self.driver.stop_client()
    if __name__ == "__main__":
            unittest.main()
