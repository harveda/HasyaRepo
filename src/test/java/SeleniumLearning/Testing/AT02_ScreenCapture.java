package SeleniumLearning.Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

public class AT02_ScreenCapture {




    @Test

    public  void navigate()throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://echoecho.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File("C:\\Users\\user\\Downloads\\har"));

    }
}
