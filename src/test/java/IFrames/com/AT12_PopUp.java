package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AT12_PopUp {
@Test
public void pop(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments(new String[]{"--ignore-ssl-errors=yes"});
    options.addArguments(new String[]{"--start-maximised"});
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://content.wisestep.com/explain-project-interview-freshers-experienced/");
    driver.findElement(By.id("onesignal-slidedown-allow-button")).click();
}



}
