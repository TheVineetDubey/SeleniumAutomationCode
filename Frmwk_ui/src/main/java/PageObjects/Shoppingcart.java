package PageObjects;

import Abstractcomponent.Reusablemethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcart extends Reusablemethod {

    WebDriver driver;

    public Shoppingcart(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h2[@class='section-header']")
    WebElement header;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    WebElement iphone;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    WebElement nokia;

    @FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
    WebElement checkout;

    public String getSectionHeader() {
        return getTextFromTextField(header, 15);

    }

    public void clickOnPhone() {
        waitForElementToBeAppear(iphone, 16);
        iphone.click();
        clickOnElement(nokia,5);
        clickOnElement(checkout,2);
    }
}



////div[@class='shop-item']//span[@class='shop-item-title'][normalize-space()='Apple iPhone 13, 128GB, Blue']//div[@class='shop-item-details']//button[@type='button']

