package pages;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Waiters;

public class SearchPage {
    private WebDriver driver;
    private String hotelScore = "//span[contains(text(),'replace')]/ancestor::" +
            "div[@class='sr_item_content sr_item_content_slider_wrapper ']//div[@aria-label]";
    String HOTElIDENTIFICATOR = "//span[contains(text(),'replace')]";
    private By SEARCHWINDOW = By.id("ss");
    private By SEARCHBUTTON = By.xpath("//button[@data-sb-id]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchWindow() {
        return driver.findElement(SEARCHWINDOW);
    }

    public WebElement getSearchButton() {
        return driver.findElement(SEARCHBUTTON);
    }

    public String getHotelScore(String name) {
        String tmphotelScore = hotelScore.replace("replace", name);
        Waiters waiters = new Waiters(BaseUtil.driver);
        waiters.waitForVisibility(By.xpath(tmphotelScore));
        return driver.findElement(By.xpath(tmphotelScore)).getText();
    }


    public boolean isVisible(String name) {
        String hotelName = HOTElIDENTIFICATOR.replace("replace", name);
        Waiters waiters = new Waiters(BaseUtil.driver);
        waiters.waitForVisibility(By.xpath(hotelName));
        return driver.findElement(By.xpath(hotelName)).isDisplayed();
    }

    public void Search(String name) {
        getSearchWindow().sendKeys(name);
        getSearchButton().submit();


    }


}
