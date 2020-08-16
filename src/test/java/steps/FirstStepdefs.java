package steps;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;

public class FirstStepdefs extends BaseUtil {
    BaseUtil baseUtil;

    @Given("browser is started")
    public void browserIsStarted() {
        baseUtil.driver = new ChromeDriver();


    }

    @When("Search page is opened")
    public void PageIsOpened() {
        baseUtil.driver.get("https://www.booking.com/searchresults.en-gb.html");
        baseUtil.driver.manage().window().maximize();


    }


    @Then("Hotel {string} is displayed and check score {string}")
    public void hotelIsDisplayedAndCheckScore(String hotelName, String score) {

        SearchPage searchPage = new SearchPage(driver);
        searchPage.Search(hotelName);
        Assert.assertTrue(searchPage.isVisible(hotelName));
        Assert.assertEquals(score, searchPage.getHotelScore(hotelName));

    }
}

