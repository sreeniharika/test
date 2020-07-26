package testCases;


import base.BaseClass;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class SearchForItem extends BaseClass
{


    @Test
    public void searchProduct()
    {
        homepage.enterSearchText(prop.getProperty("searchText"));
        homepage.clickSearchButton();

    }
}
