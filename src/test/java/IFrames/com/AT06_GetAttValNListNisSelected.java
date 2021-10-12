package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT06_GetAttValNListNisSelected {
    @Test
    public void enabled() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      List<WebElement> listOfRadioButtons = driver.findElements(By.xpath(("//input[@name='radio1']")));

        int sizeofRadio=listOfRadioButtons.size();
        System.out.println("size of radio buttons is  :"   +sizeofRadio);

        for (int i=0;i < sizeofRadio; i++){
            String ValAtt=listOfRadioButtons.get(i).getAttribute("type");

            System.out.println("Value of attribute is : " + ValAtt);
            if (ValAtt.equalsIgnoreCase("radio")){
                boolean check=listOfRadioButtons.get(i).isSelected();
                if (check==false){
                    listOfRadioButtons.get(i).click();
                }

            }

        }
    }
}
