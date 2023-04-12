package com.practice.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // Creating private constructor
    private Driver() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driver;
    }

    // method for closing down the driver instance, to make sure driver is null after using quit() method
    public static void closeDriver() {
        if (driver != null) {
            driver.quit(); // killing the instance
            driver = null; // setting up driver to null
        }

    }
}
