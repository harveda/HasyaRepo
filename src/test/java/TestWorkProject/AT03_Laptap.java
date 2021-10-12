package TestWorkProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class AT03_Laptap {
    @Test
    public void openComputers() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.harveynorman.com.au/");
        driver.findElement(By.linkText("SHOP ALL PRODUCTS"));
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[1]/div/div/ul/li[3]/span")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[1]/div/div/ul/li[3]/ul/li[3]/ul[1]/li[1]/ul/li[1]/a")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='aside']/div/div[2]/h1")).click();
        driver.getPageSource();

    }

}

