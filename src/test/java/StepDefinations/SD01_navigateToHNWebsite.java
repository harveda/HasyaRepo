package StepDefinations;

import Homepage.AT01_NavigateToWebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_navigateToHNWebsite {
    @Given("Navigate to website and assert")
    public void navigate_to_website_and_assert() throws IOException {
        AT01_NavigateToWebsite.navigate();

    }
    @Then("Navigate to Login screen")
    public void navigate_to_login_screen() throws IOException {
    AT01_NavigateToWebsite.NavLoginscr();



    }
}
