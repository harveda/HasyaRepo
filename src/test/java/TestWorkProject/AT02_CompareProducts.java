package TestWorkProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;
import org.junit.Test;


import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class AT02_CompareProducts{
    @Test
    public void getComparison() throws  InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.harveynorman.com.au/");
        WebElement checkbox= driver.findElement(By.xpath("//*[@id='category-grid']/div[9]/div/div[4]/ul/li[1]/a"));
         checkbox.click();
        sleep(2000);
        WebElement checkbox1= driver.findElement(By.xpath("//*[@id='category-grid']/div[10]/div/div[4]/ul/li[1]/a "));
        checkbox1.click();
        sleep(2000);
        WebElement checkbox2= driver.findElement(By.xpath("//*[@id='category-grid']/div[11]/div/div[4]/ul/li[1]/a"));
        checkbox2.click();
        sleep(2000);
        WebElement Button= driver.findElement(By.linkText("COMPARE NOW"));
        Button.click();
        sleep(1000);
        List<WebElement> elements= driver.findElements(By.xpath("/*[@id='breadcrumbs']/li[2]"));
        sleep(1000);
        System.out.println("Get the Text");










    }
}