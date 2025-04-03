package TaskOne;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskONE {
      static WebDriver Driver;

    @BeforeAll
    public static void setDriver() {Driver = new ChromeDriver();}

    @Test
    public void TaskOne(){
        //Driver.get("https://duckduckgo.com/");
        Driver.navigate().to("https://duckduckgo.com/");
        String ActualResult= Driver.getTitle();
        assertEquals("Google",ActualResult,"The Expected Result is :"+"Google"+" and the Actual Result is :"+ ActualResult);
    }
    @AfterAll
    public static void closeDriver(){Driver.quit();}
}
