package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class AddCustomerPage extends BasePage{
    public AddCustomerPage(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Elements

    private By DoneRadioBtn = By.xpath("//label[@for='done']");
    private By FirstName = By.id("fname");
    private By LastName = By.id("lname");
    private By Email = By.id("email");
    private By Address = By.name("addr");
    private By MobileNum = By.id("telephoneno");
    private By SubmitBtn = By.name("submit");

    // Getter for all Elements

    public WebElement getDoneRadioBtn() {return wait.until(ExpectedConditions.elementToBeClickable(DoneRadioBtn));}
    public WebElement getFirstName() {return wait.until(ExpectedConditions.elementToBeClickable(FirstName));}
    public WebElement getLastName() {return wait.until(ExpectedConditions.elementToBeClickable(LastName));}
    public WebElement getEmail() {return wait.until(ExpectedConditions.elementToBeClickable(Email));}
    public WebElement getAddress() {return wait.until(ExpectedConditions.elementToBeClickable(Address));}
    public WebElement getMobileNum() {return wait.until(ExpectedConditions.elementToBeClickable(MobileNum));}
    public WebElement getSubmitBtn() {return wait.until(ExpectedConditions.elementToBeClickable(SubmitBtn));}

    // Click on Elements

    public void ClickOnDoneBtn(){getDoneRadioBtn().click();}
    public void ClickOnFirstName(){getFirstName().click();}
    public void ClickOnLastName(){getLastName().click();}
    public void ClickOnEmail(){getEmail().click();}
    public void ClickOnAddress(){getAddress().click();}
    public void ClickOnMobileNum(){getMobileNum().click();}
    public CustomerIDPage ClickOnSubmitBtn() throws AWTException {
        getSubmitBtn().click();
        return new CustomerIDPage(driver);
    }

    // Send Keys for Elements
    public void SendValueToFirstName(String Value){getFirstName().sendKeys(Value);}
    public void SendValueToLastName(String Value){getLastName().sendKeys(Value);}
    public void SendValueToEmail(String Value){getEmail().sendKeys(Value);}
    public void SendValueToAddress(String Value){getAddress().sendKeys(Value);}
    public void SendValueToMobileNum(String Value){getMobileNum().sendKeys(Value);}


    // Common Functions
    public void FillData(String ... Values) {
        SendValueToFirstName(Values[0]);
        SendValueToLastName(Values[1]);
        SendValueToEmail(Values[2]);
        SendValueToAddress(Values[3]);
        SendValueToMobileNum(Values[4]);
    }


}
