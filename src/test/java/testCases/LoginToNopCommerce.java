package testCases;

import base.BaseClass;
import org.junit.jupiter.api.Test;

public class LoginToNopCommerce extends BaseClass
{

    @Test
    public void login()
    {
        homepage.clickLoginLink();

        pageRefresh();

        /*
        loginpage.enterEmail(prop.getProperty("email"));
        loginpage.enterPassword(prop.getProperty("password"));
        loginpage.clickLoginButton();

         */

        loginpage.loginToApp(prop.getProperty("email"),prop.getProperty("password"));
    }
}
