package AmazonWebsite;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{

     BrowserSelectore browserSelectore=new BrowserSelectore();

    @Before
    public void setUpBrowser()
    {
     browserSelectore.setUpBrowser();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
     driver.get("https://www.amazon.co.uk/");
    }
    @After
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed()) {
            try {
                File ts=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
//                TakesScreenshot ts = (TakesScreenshot) driver;
//                File source = ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(ts, new File(".\\CaptureScreenShots" + scenario.getName() +".png"));
                System.out.println("Screenshot taken");
            } catch (Exception e) {

                System.out.println("Exception while taking screenshot " + e.getMessage());
            }

            driver.quit();
        }
       // driver.quit();
    }
}
