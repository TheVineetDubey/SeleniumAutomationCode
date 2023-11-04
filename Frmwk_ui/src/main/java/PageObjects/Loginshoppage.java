package PageObjects;

import Abstractcomponent.Reusablemethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginshoppage extends Reusablemethod {

    WebDriver driver;

    public Loginshoppage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath ="//input[@id='email']")
    WebElement emailEdit;

    @FindBy(xpath ="//input[@id='password']" )
    WebElement passwordEdit;

    @FindBy(xpath ="//button[@id='submitLoginBtn']" )
    WebElement submitButton;

    public void doLogin(String emailId,String Password){
        enterTextinTextField(emailEdit,emailId,5);
        enterTextinTextField(passwordEdit,Password,5);
        clickOnElement(submitButton,5);

    }
}

