package TestCases;

import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.time.Duration;

public class Testform {

    WebDriver driver;
    Homepage hm;
    Loginshoppage loginPg;
    Shoppingcart ShoppingPg;
    Shippingdetails ShippingPg;
    Alertspage AlertsPg;
    SoftAssert sa;
    Registerpage RegisterPg;
    Recoverpassword RecpassPg;


    @BeforeMethod
    public void preSetup() {
        driver = new ChromeDriver();
        hm = new Homepage(driver);
        loginPg = new Loginshoppage(driver);
        ShoppingPg = new Shoppingcart(driver);
        ShippingPg = new Shippingdetails(driver);
        AlertsPg = new Alertspage(driver);
        sa = new SoftAssert();
        RegisterPg = new Registerpage(driver);;
        RecpassPg= new Recoverpassword(driver);
        driver.get("https://qa-practice.netlify.app/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @Test
    @Parameters({"email", "password", "phone", "street", "city", "country"})
    public void shopping(String email, String password, String phone, String street, String city, String country) {
        hm.clickOnForm();
        hm.clickOnLoginOption();
        loginPg.doLogin(email, password);
        String sectionHeader = ShoppingPg.getSectionHeader();
        //Assert.assertEquals("SHOPPING CART", sectionHeader);
        sa.assertEquals(sectionHeader, "SHOPPING CART");
        sa.assertAll();
        ShoppingPg.clickOnPhone();
        ShippingPg.enterdetails(phone, street, city, country);
        String message1 = ShippingPg.getmessage();
        System.out.println(message1);
    }

    @Test
    public void testalerts() {

        AlertsPg.clickOnalertOption();
    }


    @Test
    @Parameters({"name","lastname","phone","country","email", "password",})
    public void register(String name, String lastname, String phone, String country, String email,String password){
        RegisterPg.clickOnForm();
        RegisterPg.enterdetails1(name,lastname,phone,country,email,password);
        String message2 = RegisterPg.getconfirmation1();
        sa.assertEquals(message2, "The account has been successfully created!");
        sa.assertAll();
        System.out.println(message2);
    }
    @Test
    @Parameters({"email"})
    public void recoverpass(String email){
        RecpassPg.clickOnForm();
        RecpassPg.enterrecemail(email);
        String message3=RecpassPg.getconfirmation2();
        sa.assertEquals(message3,"An email with the new password has been sent to admin@admin.com. Please verify your inbox!");
        sa.assertAll();
        System.out.println(message3);

    }


    @AfterMethod
    public void close() {

        driver.close();
    }
}
