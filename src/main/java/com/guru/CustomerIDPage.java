package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class CustomerIDPage extends BasePage{
    public CustomerIDPage(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Elements

    private By CustomerID = By.xpath("//table[@class='alt access']/tbody/tr[1]/td[2]/h3");

    // Getter for all Elements

    public WebElement getCustomerID() {return wait.until(ExpectedConditions.elementToBeClickable(CustomerID));}

    // Common Functions
    public void SaveCustomerID(String CustomerID){
        CustomerIDPage.writeToFile("Output.txt", CustomerID);

    }
}
