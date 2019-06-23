package AmazonWebsite;

import org.openqa.selenium.By;

public class AmazonFashion extends Utils{

    private By _clcikOnWomenTshirt=By.xpath(" //h2[@class='a-size-base s-inline s-access-title a-text-normal']");

    public void verifyUserIsOnAmazonFashionPage()
    {
        assertTextMessage(" //a[@class='a-link-normal a-color-base a-text-bold a-text-normal']", By.xpath(" //a[@class='a-link-normal a-color-base a-text-bold a-text-normal']"));
    }


}
