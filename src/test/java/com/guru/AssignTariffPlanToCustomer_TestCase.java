package com.guru;

import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class AssignTariffPlanToCustomer_TestCase extends BaseTest{

    @Test
    public void TestCase2() throws AWTException {
        HomePage homePage= new HomePage(BaseTest.driver);
        homePage.ClickOnSideMenu();
        AddTariffPlanToCustomerPage addTariffPlanToCustomerPage = homePage.ClickOnAddTariffPlanToCustomer();
        addTariffPlanToCustomerPage.SendValueToCustomerId(addTariffPlanToCustomerPage.GetCustomerIDFromFile());
        AssignTariffPlanToCustomer assignTariffPlanToCustomer = addTariffPlanToCustomerPage.ClickOnSubmitBtn();
        assignTariffPlanToCustomer.ClickOnTariffOptionPlanBtn();
        TariffPlanAssignedPage tariffPlanAssignedPage = assignTariffPlanToCustomer.ClickOnSubmitBtn();
        Assert.assertTrue(tariffPlanAssignedPage.getHomeBtn().isDisplayed());
    }
}
