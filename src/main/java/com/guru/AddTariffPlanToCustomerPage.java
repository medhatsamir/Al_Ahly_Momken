package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class AddTariffPlanToCustomerPage extends BasePage{
    public AddTariffPlanToCustomerPage(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Elements

    private By CustomerId = By.id("customer_id");

    private By SubmitBtn = By.name("submit");


    // Getter for all Elements

    public WebElement getCustomerId() {return wait.until(ExpectedConditions.elementToBeClickable(CustomerId));}
    public WebElement getSubmitBtn() {return wait.until(ExpectedConditions.elementToBeClickable(SubmitBtn));}

    // Click on Elements

    public void ClickOnCustomerId(){getCustomerId().click();}
    public AssignTariffPlanToCustomer ClickOnSubmitBtn() throws AWTException {
        getSubmitBtn().click();
        return new AssignTariffPlanToCustomer(driver);
    }

    // Send Keys for Elements
    public void SendValueToCustomerId(String Value){getCustomerId().sendKeys(Value);}

    // Common Functions
    public String GetCustomerIDFromFile(){
        String CustomerID = readFileBytes("Output.txt");
        return CustomerID;
    }
}
