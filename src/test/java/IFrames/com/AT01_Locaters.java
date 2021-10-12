package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Sleeper;

public class AT01_Locaters {
    @Test
    public void Loclearn() throws  InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/customer/account/create/");
       // driver.findElement(By.cssSelector("#firstname")).sendKeys("Finsim");
        driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Finsim");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Newsletter sign up")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Vacuum & ")).click();





    }
}
