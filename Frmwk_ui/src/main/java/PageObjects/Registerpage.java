package PageObjects;

import Abstractcomponent.Reusablemethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage extends Reusablemethod {
    WebDriver driver;

    public Registerpage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='forms']")
    WebElement formEle;

    @FindBy(xpath = "//a[@id='register']")
    WebElement RegBtn;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement nameedit;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastnameedit;

    @FindBy(xpath = "//input[@type='tel']")
    WebElement phoneedit;

    @FindBy(xpath = "//select[@id='countries_dropdown_menu']")
    WebElement countrysel;

    @FindBy(xpath = "//input[@id='emailAddress']")
    WebElement emailEdit;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordEdit;

    @FindBy(xpath = "//input[@id='exampleCheck1']")
    WebElement check;

    @FindBy(xpath = "//button[@id='registerBtn']")
    WebElement Rgbtn1;

    @FindBy(xpath = "//div[@id='message']")
    WebElement message2;

    public String getconfirmation1() {
        return getTextFromTextField(message2, 5);
    }


    public void clickOnForm() {
            clickOnElement(formEle,2);
            clickOnElement(RegBtn,2);
        }
    public void enterdetails1 (String name1, String lastname1, String phone1, String con1, String emailId,String Password) {

        enterTextinTextField(nameedit, name1, 5);
        enterTextinTextField(lastnameedit, lastname1, 5);
        enterTextinTextField(phoneedit, phone1, 5);
        enterTextinTextField(countrysel, con1, 5);
        enterTextinTextField(emailEdit, emailId, 5);
        enterTextinTextField(passwordEdit, Password, 5);
        clickOnElement(check, 4);
        clickOnElement(Rgbtn1, 2);
    }






    }



