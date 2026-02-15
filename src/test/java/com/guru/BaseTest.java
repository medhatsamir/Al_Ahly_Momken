package com.guru;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    public BaseTest() {
    }
    public static WebDriver driver;
    public void browserSetUp(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @BeforeMethod
    public void setUp() {
        browserSetUp("https://demo.guru99.com/telecom/");
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
