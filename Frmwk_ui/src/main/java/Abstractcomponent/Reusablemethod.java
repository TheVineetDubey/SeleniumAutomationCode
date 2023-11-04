package Abstractcomponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Reusablemethod {
    WebDriver driver;

    public Reusablemethod(WebDriver driver) {
        this.driver = driver;
    }


    public void waitForElementToBeAppear(WebElement ele, int timeout) {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        w.until(ExpectedConditions.visibilityOf(ele));
    }


    public void enterTextinTextField(WebElement ele, String text, int timeout) {
        this.waitForElementToBeAppear(ele, timeout);
        ele.sendKeys(text);
    }

    public String getTextFromTextField(WebElement ele, int timeout) {
        this.waitForElementToBeAppear(ele, timeout);
        return ele.getText();
    }

    public void clickOnElement(WebElement ele, int timeout) {
        this.waitForElementToBeAppear(ele, timeout);
        ele.click();
    }

    public void selecttheoptionfromdropdown(WebElement ele, String option, int timeout) {
        this.waitForElementToBeAppear(ele, timeout);
        Select sel = new Select(ele);
        sel.selectByVisibleText(option);
    }

    public void acceptalert(int timeout) {
        WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        w1.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void cancelalert(int timeout) {
        WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        w1.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
    }

    public void scroll(){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,2000)", "");

        }

    }
