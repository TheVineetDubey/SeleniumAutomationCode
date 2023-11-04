package PageObjects;

import Abstractcomponent.Reusablemethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Reusablemethod {
    WebDriver driver;

    public Homepage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='forms']")
    WebElement formEle;

    @FindBy(xpath = "//a[@id='login']")
    WebElement loginBtn;

    public void clickOnForm() {
        waitForElementToBeAppear(formEle, 16);
        formEle.click();
    }
        public void clickOnLoginOption() {
            waitForElementToBeAppear(loginBtn, 18);
            loginBtn.click();

        }

    }



