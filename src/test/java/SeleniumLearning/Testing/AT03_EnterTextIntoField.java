package SeleniumLearning.Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT03_EnterTextIntoField {
    @Test
    public void navigate() throws IOException{
        //this code will know which version of chrome we installed and opens the chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver=new ChromeDriver(options);

        driver.get("https://www.harveynorman.com.au/customer/account/create/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       WebElement firstname= driver.findElement(By.name("firstname"));
       firstname.sendKeys("Harika");
        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("Vedantam");
        WebElement email= driver.findElement(By.id("email_address"));
        email.sendKeys("Harika.Vedantam@");
        String text = driver.findElement(By.xpath("//label[@for='firstname']")).getText();

        System.out.println(text);
        driver.close();
    }
    }

