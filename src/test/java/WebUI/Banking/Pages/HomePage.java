package WebUI.Banking.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    @FindBy(name = "uid")
    private WebElement txtUserId;
    @FindBy(name = "password")
    private WebElement txtPassword;
    @FindBy(name = "btnLogin")
    private WebElement btnLogin;
    @FindBy(name = "btnReset")
    private WebElement btnReset;
    @FindBy(id = "message23")
    private WebElement lblErrorMsgForUserId;
    @FindBy(id = "message18")
    private WebElement getLblErrorMsgForPassword;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inputTextOnTextBox(String text, String field){
        if (field.equalsIgnoreCase("userId")){
            txtUserId.sendKeys(text);
        }
        else if (field.equalsIgnoreCase("password")){
            txtPassword.sendKeys(text);
        }
        else {
            Assert.assertTrue(false, "This field is not correct or it is not supported");
        }
    }

    public void clickToButton(){

    }

    public void getTitleOfManagerHomePage(){

    }

    public void navigateToHomePage(){
        driver.get("http://www.demo.guru99.com/V4/");
    }
}
