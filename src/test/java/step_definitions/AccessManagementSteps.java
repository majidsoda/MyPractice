package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AccessManagementPage;
import pages.DariaPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class AccessManagementSteps {
    AccessManagementPage page;

    public AccessManagementSteps() {
        page = new AccessManagementPage();

    }

    @Then("Verify Filter dropdown field is displayed:")
    public void verifyFilterDropdownFieldIsDisplayed() {

        BrowserUtils.isDisplayed(page.filterDropdown);
    }


    @When("I verify all Action buttons are displayed")
    public void iClickOnEachButton() {
        List<WebElement> actionBtns = page.actionButtons;
        for (int i = 0; i < actionBtns.size(); i++) {
            BrowserUtils.isDisplayed(actionBtns.get(i));
        }
    }

    @Then("Verify action button has the following options displayed")
    public void verifyTheseButtonsHaveTheFollowingActionDisplayed(List <String> options) {
        for (String each : options) {
            switch (each.toLowerCase()) {
                case "edit":
                    BrowserUtils.isDisplayed(page.editBtn);
                    break;
                case "delete":
                    BrowserUtils.isDisplayed(page.deleteBtn);
                    break;
                case "reset password":
                    BrowserUtils.isDisplayed(page.resetPasswordBtn);
                    break;
                default:
                    Assert.fail("Invalid Input field");
            }
        }
    }

        @Then("Verify all lines users are displayed")
        public void verifyAllLinesUsersAreDisplayed () {
            BrowserUtils.assertTrue(page.filterAllDropdown.isDisplayed());
        }


}
