package Registration;

import BaseClass.OpenBrowser;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class SD02_CreateUsers {
    @Test
    public void Navigate() throws IOException {
        OpenBrowser.NavToWebsite("urlCreate");

    }
    @Test
    public void firstname() {
        OpenBrowser.driver.findElement(By.id("firstname")).clear();
        OpenBrowser.driver.findElement(By.id("firstname")).sendKeys("HARIKA");

    }
    @Test
    public void  LastName() throws IOException {
        OpenBrowser.driver.findElement(By.id("lastname")).clear();
        OpenBrowser.driver.findElement(By.id("lastname")).sendKeys("lastname");

    }
    @Test
    public void emailadd() throws IOException {
        OpenBrowser.driver.findElement(By.id("email_address")).clear();
        OpenBrowser.driver.findElement(By.id("email_address")).sendKeys("emailadd@gmail.com");

    }
    @Test
    public void pass() throws IOException {
        OpenBrowser.driver.findElement(By.id("password")).clear();
        OpenBrowser.driver.findElement(By.id("password")).sendKeys("password");
    }
    @Test
    public void Repass () throws IOException {
        OpenBrowser.driver.findElement(By.id("confirmation")).clear();
        OpenBrowser.driver.findElement(By.id("confirmation")).sendKeys("password");

    }
}