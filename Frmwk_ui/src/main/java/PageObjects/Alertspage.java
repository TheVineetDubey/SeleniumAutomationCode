package PageObjects;

import Abstractcomponent.Reusablemethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.image.PackedColorModel;

public class Alertspage extends Reusablemethod {
    WebDriver driver;

    public Alertspage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#alerts")
    WebElement alertsele;

    @FindBy(css = "#alert-btn")
    WebElement alertbtn;

    public void clickOnalertOption() {
        clickOnElement(alertsele,10);
        clickOnElement(alertbtn, 18);
        acceptalert(10);

        }

    }



