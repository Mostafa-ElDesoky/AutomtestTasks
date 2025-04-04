package TaskSix;

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
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TaskSIX {
    static WebDriver Driver;
    @BeforeAll
    public static void setDriver() {Driver = new ChromeDriver();}
    @Test
    public void TaskSix(){
        Driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebDriverWait wait=new WebDriverWait(Driver, Duration.ofSeconds(3));
        WebElement CheckBox1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='checkboxes']/input[1]")));
        CheckBox1.click();
        Boolean x=CheckBox1.isSelected();
        Boolean y = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='checkboxes']/input[2]"))).isSelected();
        assertEquals(x,y);
    }
   @AfterAll
  public static void closeweb(){Driver.quit();}
}
