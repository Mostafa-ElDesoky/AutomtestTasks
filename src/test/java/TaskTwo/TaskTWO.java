package TaskTwo;

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

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTWO {
    static WebDriver Driver;

    @BeforeAll
    public static void setDriver() {
        Driver = new ChromeDriver();
    }

    @Test
    public void TaskTwo() throws InterruptedException {
        Driver.get("https://duckduckgo.com/");
        //Driver.navigate().to("https://duckduckgo.com/");

        //Passed
        //Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //WebElement webone= Driver.findElement(By.id("searchbox_input"));
        //webone.sendKeys("Iphone");
        //

        //Passed
        //Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //WebElement webone= Driver.findElement(By.cssSelector("#searchbox_input"));
        //webone.sendKeys("Iphone");
        //

        //Passed
        //Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //WebElement webone= Driver.findElement(By.cssSelector(".searchbox_input__rnFzM"));
        //webone.sendKeys("Iphone");
        //
        //passed
        WebDriverWait waitt=new WebDriverWait(Driver,Duration.ofSeconds(3));
        WebElement webone=waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@class='header_headerLeft__rW6nD header_headerSection___XMRI']//img")));
        assertTrue(webone.isDisplayed());
        //

        //failed
        //WebElement webone=waitt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='logo']")));
        //
    }
    @AfterAll
    public static void closeDriver(){Driver.quit();}
}
