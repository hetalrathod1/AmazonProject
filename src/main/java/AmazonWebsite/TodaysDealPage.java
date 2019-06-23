package AmazonWebsite;

import org.junit.Assert;
import org.openqa.selenium.By;

public class TodaysDealPage extends Utils{

    private By _viewDealTopsBottom= By.xpath("//div[@id='100_dealView_6']");

    public void verifyUserIsOnTodaysDealPage()
    {
        Assert.assertTrue(driver.getTitle().equals("Amazon UK Deals - Discover Our Daily Deals\\n"));
    }
    public void clickOnViewDealTopsBottomDeal()
    {
        clickElements(_viewDealTopsBottom);
    }
}
