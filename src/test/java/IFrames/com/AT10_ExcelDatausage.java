package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AT10_ExcelDatausage {
    /*/public <Xls_Reader> void Excel() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/apple-iphone-13-pro.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Xls_Reader reader=new Xls_Reader("Documents");
        // we did rowcount in worksheet
        int rowcount =reader.GetRowCount("RegTestData");
        //we start picking data from line 2
        for (int i=2;i<rowcount;i++){
            //we picked firstname and entered into firstname field on the website
            String FirstName = reader.GetCellData("RegTestData", "FirstName", i);
            //we clear the field
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys(FirstName);

            String LastName = reader.GetCellData("RegTestData", "LastName", i);
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys(LastName);

            String EmailAddress = reader.GetCellData("RegTestData", "EmailAddress", i);
            driver.findElement(By.id("email_address")).clear();
            driver.findElement(By.id("email_address")).sendKeys(EmailAddress);*/

        }




