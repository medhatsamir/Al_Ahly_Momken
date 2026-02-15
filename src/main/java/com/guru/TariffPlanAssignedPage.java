package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class TariffPlanAssignedPage extends BasePage{
    public TariffPlanAssignedPage(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Elements

    private By HomeBtn = By.xpath("//li/a[@href='index.html']");

    // Getter for all Elements

    public WebElement getHomeBtn() {return wait.until(ExpectedConditions.elementToBeClickable(HomeBtn));}

    // Common Function

}
