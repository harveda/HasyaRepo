package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.concurrent.TimeUnit;

public class AT02_IframesLearnng {
    @Test
    public void frames01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement frames = driver.findElement(By.xpath(("//a[@title='Newsletter sign up']")));
        frames.click();
        Thread.sleep(2000);
        WebElement iframes = driver.findElement(By.xpath(("//a[@title='Log into my account']")));
        iframes.click();


    }
}
