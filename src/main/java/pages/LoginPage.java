package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass
{
    WebDriver driver;

    @FindBy(id = "Email")
    public WebElement emailTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;


    @FindBy(css = "input.login-button")
    public WebElement loginButton;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void enterEmail(String email)
    {
        emailTextBox.sendKeys(email);
    }

    public void enterPassword(String pwd)
    {
       passwordTextBox.sendKeys(pwd);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }


    public void loginToApp(String un,String pw)
    {
        emailTextBox.sendKeys(un);
        passwordTextBox.sendKeys(pw);
        loginButton.click();

    }








}
