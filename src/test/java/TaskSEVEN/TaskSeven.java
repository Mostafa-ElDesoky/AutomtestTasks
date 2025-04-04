package TaskSEVEN;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSeven {

    static WebDriver Driver;
    @BeforeAll
    public static void setDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--headless=new", // Run in headless mode
                "--disable-extensions",
                "--no-sandbox",
                "--disable-dev-shm-usage",
                "--blink-settings=imagesEnabled=false");
        Driver = new ChromeDriver(options);
    }
    @Test
    public void TaskSevenn(){
        Driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebDriverWait wait=new WebDriverWait(Driver, Duration.ofSeconds(10));
        WebElement CountryActual=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ws-table-all']/tbody/tr[contains(td, 'Ernst')]/td[3]")));
        //WebElement CountryActual=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ws-table-all']/tbody/tr[4]/td[3]")));
        String CountryExpected = "Austriaa";
        assertEquals(CountryExpected,CountryActual.getText());
    }
    @AfterAll
    public static void closeweb(){Driver.quit();}
}
