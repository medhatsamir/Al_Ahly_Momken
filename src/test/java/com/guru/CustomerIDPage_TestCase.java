package com.guru;

import org.testng.annotations.Test;

import java.awt.*;

public class CustomerIDPage_TestCase extends BaseTest{
    @Test
    public void Test() throws AWTException {
        HomePage homePage= new HomePage(BaseTest.driver);
        homePage.ClickOnSideMenu();
        AddCustomerPage addCustomerPage = homePage.ClickOnAddCustomerBTN();
        addCustomerPage.ClickOnDoneBtn();
        addCustomerPage.FillData("Test","Test","Test@test.com","Test","123456");
        CustomerIDPage customerIDPage = addCustomerPage.ClickOnSubmitBtn();
        customerIDPage.SaveCustomerID(customerIDPage.getCustomerID().getText());
    }
}
