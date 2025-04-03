package TASKFour;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFOUR {
    static WebDriver Driver;

    @BeforeAll
    public static void setDriver() {Driver = new FirefoxDriver();}
    @Test
    public void TaskFour(){
        Driver.get("https://duckduckgo.com/");
        WebDriverWait waitt=new WebDriverWait(Driver, Duration.ofSeconds(3));
        WebElement search = waitt.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox_input")));
        search.sendKeys("TestNG");

//        search.submit();
//        WebElement firstResult = waitt1.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath("(//a[@class='eVNpHGjtxRBq_gLOfGDr LQNqh2U1kzYxREs65IJu'])[4]/span")));
//        WebElement firstResult = waitt1.until(ExpectedConditions.presenceOfElementLocated(
//               By.xpath("(//h2[@class='LnpumSThxEWMIsDdAT17 CXMyPcQ6nDv47DKFeywM'])[4]/a[1]/span")));

//        get the fourth element directly
//        WebDriverWait waitt1 = new WebDriverWait(Driver, Duration.ofSeconds(7));
//        WebElement list1=waitt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='searchbox_suggestion__2TYYJ'])[4]")));

        WebDriverWait waitt1 = new WebDriverWait(Driver, Duration.ofSeconds(7));
        List<WebElement> list1= waitt1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='searchbox_suggestionList__HFw4I']/li")));



         String actualUrl = list1.get(3).getText();
         String expectedUrl = "TestNG Tutorial";
        assertEquals(actualUrl, expectedUrl);



    }
    @AfterAll
    public static void closeweb(){Driver.quit();}
}
