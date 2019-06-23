import AmazonWebsite.HomePage;
import AmazonWebsite.TodaysDealPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MyStepdefs {
    //
    HomePage homePage=new HomePage();
    TodaysDealPage todaysDealPage=new TodaysDealPage();
    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
        homePage.userClickOnTodaysDeal();
    }

    @When("^user click on Todays deals$")
    public void userClickOnTodaysDeals() {
        todaysDealPage.verifyUserIsOnTodaysDealPage();
    }

    @And("^user click on Up to (\\d+)% off tops and bottoms from Amazon brands$")
    public void userClickOnUpToOffTopsAndBottomsFromAmazonBrands(int arg0) {

    }
}
