#! /usr/bin/env python
# -*- coding: utf-8 -*-
import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
# Choose browser if needed (IE,Chrome)
class WrongLogin(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(100)
    # Open rig_space on standalone and clear the cookies
    # Enter username, Enter password, Click on button "Submit"
    def test_wrong_login_rigspace(self):
        driver = self.driver
        driver.delete_all_cookies()
        driver.get("http://standalone.rig.space/admin/")
        assert "Rigspace Login" in driver.title
        driver.find_element_by_name("username").send_keys("asd123")
        driver.find_element_by_name("password").send_keys("asd123")
        driver.find_element_by_css_selector("button[type]").send_keys(Keys.RETURN)
        driver.implicitly_wait(100)
        element = driver.find_element_by_xpath('//*[@id="mat-error-2"]')
        self.assertEquals(element.text, "Неверный логин или пароль.")
    def tearDown(self):
            self.driver.quit()

# # class CkeckError(unittest.TestCase):
# #     def test_check_error_message(self):
# #         self.driver = webdriver.Firefox()
# #         driver = self.driver
# #         driver.delete_all_cookies()
# #         driver.get("http://standalone.rig.space/admin/")
# #         assert "Rigspace Login" in driver.title
# #         driver.find_element_by_name("username").send_keys("asd123")
# #         driver.find_element_by_name("password").send_keys("asd123")
# #         driver.find_element_by_css_selector("button[type]").send_keys(Keys.RETURN)
# #         driver.find_element_by_xpath('//*[@id="mat-error-2"]')
# #         self.assertEquals('Неверный логин или пароль.')
#     def tearDown(self):
#         self.driver.quit()
    if __name__ == "__main__":
        unittest.main()