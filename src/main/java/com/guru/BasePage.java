package com.guru;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BasePage {

    public static WebDriver driver;
    static Actions act;
    static Robot robot ;
    static JavascriptExecutor js ;
    WebDriverWait wait;


    //Constructor
    public BasePage(WebDriver driver) throws AWTException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        act = new Actions(driver);
        robot = new Robot();
        js= (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver,30);
    }

    //Dismiss Alert
    public void AlertDismiss() {
        driver.switchTo().alert().dismiss();
    }

    //Accept Alert
    public void AlertAccept() {
        driver.switchTo().alert().accept();
    }

    //Get String from Alert
    public void AlertGetText() {
        driver.switchTo().alert().getText();
    }

    //send keys to Alert
    public void AlertSendKeys(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public static String getPageURL() {
        return driver.getCurrentUrl();
    }

    public static void handleMultipleWindows(int x) {
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(x));
    }

    public void HoverOnElement(WebElement x) {
        act.moveToElement(x).perform();
    }

    public void DragAndDrop(WebElement From, WebElement To) {
        act.dragAndDrop(From, To).build().perform();
    }
    public static void openNewTabWithKeyBoard() throws AWTException {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);
    }
    public static void SwitchToFrame(WebElement X){
        driver.switchTo().frame(X);
    }

    public void PrintTitlesOfWindows(){
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        for(int i = 0 ; i<tabs.size() ; i++) {
            handleMultipleWindows(i);
            System.out.println(driver.getTitle());
        }
    }

    public void ScrollDownToSpecificElement(WebElement X){
        js.executeScript("arguments[0].scrollIntoView();", X);
    }

    public void ScrollDownToBottomOfPage(){
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    public void ScrollHorizontallyToSpecificElement(WebElement X){
        js.executeScript("arguments[0].scrollIntoView();", X);
    }

    public static String getTitleWithJavaScript(){
        return js.executeScript("return document.title;").toString();
    }

    public static void writeToFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String readFileBytes(String filename) {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filename));
            return new String(bytes);
        } catch (IOException e) {
            return "";
        }
    }
}
