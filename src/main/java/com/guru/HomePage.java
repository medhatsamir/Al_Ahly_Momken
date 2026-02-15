package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Elements

    private By SideMenu = By.xpath("//*[@id=\"header\"]/nav/a[1]");
    private By AddCustomerBtn = By.xpath("//li/a[@href='addcustomer.php']");
    private By AddTariffPlanToCustomer= By.xpath("//li/a[@href='assigntariffplantocustomer.php']");


    // Getter for all Elements

    public WebElement getSideMenu() {return wait.until(ExpectedConditions.elementToBeClickable(SideMenu));}
    public WebElement getAddCustomerBtn() {return wait.until(ExpectedConditions.elementToBeClickable(AddCustomerBtn));}
    public WebElement getAddTariffPlanToCustomer() {return wait.until(ExpectedConditions.elementToBeClickable(AddTariffPlanToCustomer));}


    // Click on Elements

    public void ClickOnSideMenu() {getSideMenu().click();}
    public AddCustomerPage ClickOnAddCustomerBTN() throws AWTException {
        getAddCustomerBtn().click();
        return new AddCustomerPage(driver);
    }

    public AddTariffPlanToCustomerPage ClickOnAddTariffPlanToCustomer() throws AWTException {
        getAddTariffPlanToCustomer().click();
        return new AddTariffPlanToCustomerPage(driver);
    }


}
