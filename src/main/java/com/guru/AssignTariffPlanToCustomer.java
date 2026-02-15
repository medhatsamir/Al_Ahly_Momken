package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class AssignTariffPlanToCustomer extends BasePage{
    public AssignTariffPlanToCustomer(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Elements

    private By SubmitBtn = By.name("submit");
    private By TariffOptionPlanBtn = By.xpath("//tbody/tr/td[1]");


    // Getter for all Elements

    public WebElement getSubmitBtn() {return wait.until(ExpectedConditions.elementToBeClickable(SubmitBtn));}
    public WebElement getTariffOptionPlanBtn() {return wait.until(ExpectedConditions.elementToBeClickable(TariffOptionPlanBtn));}


    // Click on Elements

    public TariffPlanAssignedPage ClickOnSubmitBtn() throws AWTException {
        getSubmitBtn().click();
        return new TariffPlanAssignedPage(driver);
    }
    public void ClickOnTariffOptionPlanBtn(){getTariffOptionPlanBtn().click();}

}
