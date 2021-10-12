package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AT09_Tabs {
    @Test
    public void SelectDropDown() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/customer/account/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@title='CustomiseMe']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
            System.out.println(tabs.size());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().window(tabs.get(1));
        driver.navigate().refresh();
        driver.switchTo().window(tabs.get(0));
        for (int i=0; i<tabs.size();i++){
            driver.switchTo().window(tabs.get(i));
            break;
        }



    }
}
