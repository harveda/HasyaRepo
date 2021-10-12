package TestWorkProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;



public class AT01_GoogleLinks {


    @Test
    public void getGoogleLinks() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com.au");
        //Fetching all href links from the source page
        List<WebElement> list=driver.findElements(By.xpath("//*[@href or @src]"));

        for(WebElement e : list){
            // it returns the value of the web element's attribute as a string
            String link = e.getAttribute("href");
            if(null==link)

                link=e.getAttribute("src");
            System.out.println(e.getTagName() + "=" + link);
        }

    }
    }



