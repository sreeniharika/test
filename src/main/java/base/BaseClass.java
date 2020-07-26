package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass
{
    public static WebDriver driver;

    public static Properties prop;

    public static HomePage homepage;

    public static LoginPage loginpage;


    @BeforeAll
    public static void setUp()
    {
        prop = new Properties();

        try
        {
            FileInputStream fs = new FileInputStream("./src/main/java/config/data.properties");
            prop.load(fs);
        } catch(Exception e)
        {
            e.printStackTrace();
        }


        driver = new ChromeDriver();
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);

    }


    @AfterAll
    public static void tearDown()
    {
           driver.quit();
    }


    public String getPageTitle()
    {
        return driver.getTitle();
    }

    public void pageRefresh()
    {
        driver.navigate().refresh();
    }
}
