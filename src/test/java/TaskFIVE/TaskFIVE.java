package TaskFIVE;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFIVE {
    static WebDriver Driver;
    @BeforeAll
    public static void setDriver() {Driver = new FirefoxDriver();}
    @Test
    public void TaskFour(){
        Driver.get("https://duckduckgo.com/");
        WebDriverWait waitt=new WebDriverWait(Driver, Duration.ofSeconds(3));
        WebElement search = waitt.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox_input")));
        search.sendKeys("Cucumber IO");
        search.submit();
        WebDriverWait waitt1=new WebDriverWait(Driver, Duration.ofSeconds(3));
        WebElement result=waitt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@data-testid='result-title-a'])[2]")));
        String x= result.getAttribute("href");
        Boolean checkkk=x.contains("https://www.linkedin.com");
        System.out.print(checkkk);
        assertTrue(checkkk,"The Result doesn't contain the URL");
    }
}