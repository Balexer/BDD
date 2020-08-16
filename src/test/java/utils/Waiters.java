package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {
    private WebDriver driver;
    private WebDriverWait wait;

    public Waiters(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public WebElement waitForVisibility(WebElement webElement) {
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public WebElement waitForVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}