package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
    @Test
    public void Down() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore--ssl--errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.energyaustralia.com.au/");
        driver.findElement(By.linkText("Electricity and gas")).click();
         Actions actions=newActions(driver);
       WebElement element = driver.findElement(By.linkText(" Compare electricity and gas plans "));

        actions.contextClick(element).perform();

        driver.findElement(By.id("edit-refine-location-type-postcode__label")).click();

        driver.findElement(By.id("address-auto-input")).sendKeys("3024");


    }

    private Actions newActions(WebDriver driver) {
        return null;
    }


}