package TaskThree;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTHREE {
    static WebDriver Driver;

    @BeforeAll
    public static void setDriver() {Driver = new ChromeDriver();}
    @Test
    public void TestThree(){
        Driver.get("https://duckduckgo.com");
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5)); // Explicit wait
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox_input")));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit(); //OR//searchBox.sendKeys(Keys.RETURN);

        //Failed because I didn't add wait
        //WebElement getSearchbox= Driver.findElement(By.id("searchbox_input"));
        //getSearchbox.sendKeys("Selenium WebDriver");

        //passed
//        WebDriverWait waitt = new WebDriverWait(Driver, Duration.ofSeconds(5));
//        WebElement firstResult = waitt.until(ExpectedConditions.presenceOfElementLocated(
//                By.cssSelector(".eVNpHGjtxRBq_gLOfGDr.LQNqh2U1kzYxREs65IJu")));
//        String actualUrl = firstResult.getAttribute("href");
//        String expectedUrl = "https://www.selenium.dev/documentation/webdriver/";
//        assertEquals(actualUrl, expectedUrl);

        //failed
//        WebDriverWait waitt = new WebDriverWait(Driver, Duration.ofSeconds(5));
//        WebElement firstResult = waitt.until(ExpectedConditions.presenceOfElementLocated(
//                By.className("eVNpHGjtxRBq_gLOfGDr LQNqh2U1kzYxREs65IJu")));
//        String actualUrl = firstResult.getAttribute("href");
//        String expectedUrl = "https://www.selenium.dev/documentation/webdriver/";
//        assertEquals(actualUrl, expectedUrl);

        //Passed
//        WebDriverWait waitt = new WebDriverWait(Driver, Duration.ofSeconds(5));
//        WebElement firstResult = waitt.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath("(//a[@data-testid='result-title-a'])[1]"))); // Updated selector
//        String actualUrl = firstResult.getAttribute("href");
//        String expectedUrl = "https://www.selenium.dev/documentation/webdriver/";
//        assertEquals(actualUrl, expectedUrl);

        WebDriverWait waitt = new WebDriverWait(Driver, Duration.ofSeconds(5));
        WebElement firstResult = waitt.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("(//a[@class='eVNpHGjtxRBq_gLOfGDr LQNqh2U1kzYxREs65IJu'])[2]")));
        String actualUrl = firstResult.getAttribute("href");
        String expectedUrl = "https://www.selenium.dev/documentation/webdriver/";
        assertEquals(actualUrl, expectedUrl);


    }

    @AfterAll
    public static void closeweb(){Driver.quit();}
















    //private static WebElement getSearchResultByIndex(WebDriver driver, int index) //{
    // Use XPath to dynamically select the nth result
    // String xpath = String.format("(//a[@data-testid='result-title-a'])[%d]",index);
    //  return new WebDriverWait(driver, Duration.ofSeconds(5))
    //            .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(xpath)));
    // }
    //int desiredResultIndex = 3; // Change this to 3 for the third result
    //WebElement result = getSearchResultByIndex(Driver, desiredResultIndex);
    //String actualUrl = result.getAttribute("href");
    //String expectedUrl = "https://www.selenium.dev/documentation/webdriver/";
    //assertEquals(actualUrl, expectedUrl);


}
