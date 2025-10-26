# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/login-form")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the username field and give credentials
    username = driver.find_element(By.XPATH, "//input[@id='username']").send_keys("admin")
    # Find the password field and give password
    password = driver.find_element(By.XPATH, "//input[@id='password']").send_keys("password")

    # Find the login button
    login = driver.find_element(By.XPATH, "//button[text()='Submit']").click()

    # Print the login message
    message = driver.find_element(By.XPATH, "//h1[contains(@class, 'text-center')]")
    print("Login message: ", message.text)