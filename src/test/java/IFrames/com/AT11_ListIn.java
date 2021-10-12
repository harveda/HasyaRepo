package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AT11_ListIn {
    @Test
    public void Listing(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--Ignore--ssl--error=yes");
        options.addArguments("--Start--maximised");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.energyaustralia.com.au/home/electricity-and-gas/plans");
        driver.findElement(By.linkText("Postcode")).click();
        driver.findElement(By.name("refine-location-refine-postcode-input")).sendKeys("3024");


    }
}
