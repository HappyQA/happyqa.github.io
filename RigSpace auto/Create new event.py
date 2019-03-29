import unittest
from selenium import webdriver


class ReportCreate(unittest.TestCase):
    def setUp(self):
        # Choose browser if needed (IE,Chrome)
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(10)

    def test_create_report(self):
        driver = self.driver
        driver.add_cookie({'name': 'SESSION', 'value': '1644cd91-8fce-4d46-a664-60d879cbbc8c', 'path': '/auth/', 'domain': 'standalone.rig.space', 'secure': False, 'httpOnly': True})
        driver.get("http://standalone.rig.space/reporting/")
        assert "RigSpace Reporting" in driver.title
        driver.find_element_by_id("main-content").click()
        driver.find_element_by_css_selector("class=mat-icon-button").click()
        driver.find_element_by_css_selector("class=mat-button-wrapper").click()
        driver.find_element_by_id("mat-input-0").send_keys("Тест")
        driver.find_element_by_css_selector("class=mat-select-trigger").click()
        driver.find_element_by_id("mat-select-2").click()
        driver.find_element_by_css_selector("class=mat-button-wrapper").click()

    def tearDown(self):
        self.driver.stop_client()

    if __name__ == "__main__":
        unittest.main()