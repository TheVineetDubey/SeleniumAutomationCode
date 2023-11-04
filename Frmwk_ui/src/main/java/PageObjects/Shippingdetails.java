package PageObjects;

import Abstractcomponent.Reusablemethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippingdetails extends Reusablemethod {

    WebDriver driver;

    public Shippingdetails(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@type='tel']")
    WebElement phoneedit;

    @FindBy(xpath = "//input[@name='street']")
    WebElement streetedit;

    @FindBy(xpath = "//input[@name='city']")
    WebElement cityedit;

    @FindBy(xpath = "//select[@name='country']")
    WebElement countrysel;

    @FindBy(xpath = "//button[@id='submitOrderBtn']")
    WebElement sumbit1;

    @FindBy(xpath = "//div[@id='message']")
    WebElement message1;


    public void enterdetails(String phone1, String street1, String city1, String con1) {
        enterTextinTextField(phoneedit, phone1, 5);
        enterTextinTextField(streetedit, street1, 5);
        enterTextinTextField(cityedit, city1, 5);
        enterTextinTextField(countrysel, con1, 5);
        clickOnElement(sumbit1, 5);
    }

        public String getmessage () {
            return getTextFromTextField(message1, 15);

        }

           }