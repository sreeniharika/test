package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass
{
       WebDriver driver;

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(linkText = "Log in")
    public WebElement loginLink;

    @FindBy(id = "small-searchterms")
    public WebElement searchTextBox;

    @FindBy(css = "input.search-box-button")
    public WebElement searchButton;


    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    public void clickRegisterLink()
    {
        registerLink.click();
    }

    public void clickLoginLink()
    {
        loginLink.click();
    }

    public void enterSearchText(String searchText)
    {
        searchTextBox.sendKeys(searchText);
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }
}
