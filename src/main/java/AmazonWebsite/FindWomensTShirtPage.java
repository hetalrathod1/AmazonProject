package AmazonWebsite;

import org.openqa.selenium.By;

public class FindWomensTShirtPage extends Utils{

    private By _selectdropdown=By.xpath("//select[@id='native_dropdown_selected_size_name']");
    public void verifyUserIsOnFindWomensTshirtPage()
    {
        assertTextMessage("find. Women's T-Shirt\n", By.xpath("//span[@id='productTitle']"));
    }
    public void userSelectSize()
    {
        selectDropdownValue(_selectdropdown,"36");
    }
}
