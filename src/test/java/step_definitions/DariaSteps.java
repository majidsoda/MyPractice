package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DariaPage;
import utils.BrowserUtils;

import java.util.List;

public class DariaSteps {

    DariaPage page;

    public DariaSteps() {
        page = new DariaPage();

    }

    @When("user is on the main page")
    public void user_is_on_the_main_page() {
        String homePageUrl = "https://interview-prep-test.herokuapp.com/";
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl().equals(homePageUrl));
    }

    @Then("Verify {string} button is displayed")
    public void verify_button_is_displayed(String btn) {
        switch (btn.toLowerCase()) {
            case "sign out":
                BrowserUtils.isDisplayed(page.signOutBtn);
                break;
            default:
                System.out.println("Wrong button name");
                Assert.fail();
        }
    }

    @Then("Verify {string} button is not displayed")
    public void verifyManageAccessButtonIsNotDisplayed(String txtBtn) {
        List < WebElement> btns = BrowserUtils.getDriver().findElements(By.xpath("//a/u"));
        for(WebElement btn:btns){
            BrowserUtils.assertFalse(btn.getText().equals(txtBtn));
        }
    }

    @When("I click nav button {string}")
    public void i_click_nav_button(String navBtn) {
        switch (navBtn.toLowerCase()) {
            case "manage access" :
                BrowserUtils.click(page.AccessBtn);
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}