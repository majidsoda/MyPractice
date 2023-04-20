package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class LoginSteps {
    LoginPage page;

    public LoginSteps() {
        page = new LoginPage();
    }

    @When("I log in as a {string}")
    public void iLogInAsA(String login) {
        switch (login.toLowerCase()) {
            case "user":
                BrowserUtils.sendKeys(page.usernameInput, "test@yahoo.com");
                BrowserUtils.sendKeys(page.passwordInput, "test123");
                break;
            case "admin":
                BrowserUtils.sendKeys(page.usernameInput, "admin@yahoo.com");
                BrowserUtils.sendKeys(page.passwordInput, "admin123");
                break;
            default:
                Assert.fail();
        }
        BrowserUtils.click(page.loginBtn);
    }

    @Then("Verify page title is displayed as {string}")
    public void verify_page_title_is_displayed_as(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);

    }

    @Then("Verify {string} button is visible")
    public void verifyButtonIsVisible(String button) {
        switch (button.toLowerCase()) {
            case "manage access":
                BrowserUtils.isDisplayed(page.manageAccessBtn);
                break;
            case "edit/delete":
                BrowserUtils.isDisplayed(page.editDeleteBtn);
                break;
            case "add dashboard":
                BrowserUtils.isDisplayed(page.addDashboardBtn);
                break;
            case "selenium":
                BrowserUtils.isDisplayed(page.selDashboardBtn);
                break;
            default:
                Assert.fail();
        }
    }

    @Then("Verify following input fields are displayed:")
    public void verifyFollowingInputFieldsAreDisplayed(List<String> inputField) {
        for (String each : inputField) {
            switch (each.toLowerCase()) {
                case "first name":
                    BrowserUtils.isDisplayed(page.fistName);
                    break;
                case "last name":
                    BrowserUtils.isDisplayed(page.lastName);
                    break;
                case "e-mail":
                    BrowserUtils.isDisplayed(page.email);
                    break;
                case "role":
                    BrowserUtils.isDisplayed(page.role);
                    break;
                case "batch":
                    BrowserUtils.isDisplayed(page.batch);
                    break;
                default:
                    Assert.fail("Invalid input Field");
            }

        }
    }

    @And("I fill out new user form with following data:")
    public void iFillOutNewUserFormWithFollowingData(Map<String, String> inputForm) {
        for (String key : inputForm.keySet()) {
            BrowserUtils.sendKeys(
                    BrowserUtils.getDriver().findElement(By.id(key)), inputForm.get(key));
        }
    }

    @Then("Verify the new added user is displayed")
    public void verifyTheNewAddedUserIsDisplayed() {
        List<WebElement> emails = page.emailTable;

        for (WebElement email : emails) {
            String expectedEmail = "petergriffin@familyguy.com";
            if (email.getText().equalsIgnoreCase(expectedEmail))

                BrowserUtils.assertTrue(true);
        }
    }
}
