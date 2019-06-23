package AmazonWebsite;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _clickOnTodaysDeal= By.xpath("//a[contains(text(),\"Today's Deals\")]");

    public void userClickOnTodaysDeal()
    {
        clickElements(_clickOnTodaysDeal);
    }


}
