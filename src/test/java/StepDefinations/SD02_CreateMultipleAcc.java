package StepDefinations;

import BaseClass.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.io.IOException;

public class SD02_CreateMultipleAcc {

    @Given("Navigate to  registration screen of HN website")
    public void navigate_to_registration_screen_of_hn_website() throws IOException {
        OpenBrowser.NavToWebsite("urlCreate");

    }
    @Then("customers enters firstname as <{string}>")
    public void customers_enters_firstname_as(String FirstName ) {
        OpenBrowser.driver.findElement(By.id("firstname")).clear();
        OpenBrowser.driver.findElement(By.id("firstname")).sendKeys("HARIKA");


    }
    @Then("customers enters lastname as <{string}>")
    public void customers_enters_lastname_as(String LastName) {
        OpenBrowser.driver.findElement(By.id("lastname")).clear();
        OpenBrowser.driver.findElement(By.id("lastname")).sendKeys("lastname");


    }
    @Then("customers enters emailadd as <{string}>")
    public void customers_enters_emailadd_as(String EmailAdd) {
        OpenBrowser.driver.findElement(By.id("email_address")).clear();
        OpenBrowser.driver.findElement(By.id("email_address")).sendKeys("emailadd@gmail.com");


    }
    @Then("customers enters pass as <{string}>")
    public void customers_enters_pass_as(String Password) {
        OpenBrowser.driver.findElement(By.id("password")).clear();
        OpenBrowser.driver.findElement(By.id("password")).sendKeys("password");


    }
    @Then("customers enters Repass as <{string}>")
    public void customers_enters_repass_as(String RePassword) {
        OpenBrowser.driver.findElement(By.id("confirmation")).clear();
        OpenBrowser.driver.findElement(By.id("confirmation")).sendKeys("password");



    }
}
