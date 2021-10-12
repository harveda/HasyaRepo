package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AT07_IsEnabled {
    @Test
    public void enabled() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/customer/account/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (driver.findElement(By.id("send2")).isEnabled()) {
            System.out.println("Button is Enabled");

        } else {
            System.out.println("Button is Disabled");

        }
    }
}