package PageObjects;

import Abstractcomponent.Reusablemethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recoverpassword extends Reusablemethod {
    WebDriver driver;

    public Recoverpassword(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='forms']")
    WebElement formEle;

    @FindBy(xpath = "//a[@id='recover-password']")
    WebElement RecBtn;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailEdit;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement sbmt1;

    @FindBy(xpath = "//div[@id='message']")
    WebElement message3;



    public void clickOnForm() {
            clickOnElement(formEle,2);
            clickOnElement(RecBtn,2);
        }
    public void enterrecemail ( String emailId) {


        enterTextinTextField(emailEdit, emailId, 5);
        clickOnElement(sbmt1, 4);
    }

    public String getconfirmation2() {

        return getTextFromTextField(message3, 5);
    }





    }



