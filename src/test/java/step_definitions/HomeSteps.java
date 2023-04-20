package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.input.BrokenInputStream;
import org.junit.Assert;
import pages.AccessManagementPage;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    AccessManagementPage accPage;

    LoginPage loginPage;
    public HomeSteps(){
        page = new HomePage();
        loginPage = new LoginPage();
        accPage = new AccessManagementPage();
    }
    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String dashboardTitle) {
        switch(dashboardTitle){
            case "all topics":
                BrowserUtils.isDisplayed(page.allTopicsBtn);
                break;
            case "soft skills":
                BrowserUtils.isDisplayed(page.softSkillsBtn);
                break;
            case "coding":
                BrowserUtils.isDisplayed(page.codingBtn);
                break;
            case "do study hard":
                BrowserUtils.isDisplayed(page.doFinalText);
                break;
            case "don't be a hater":
                BrowserUtils.isDisplayed(page.dontFinalText);
                break;
            case "who will win nba championship?":
                BrowserUtils.selectByVisibleText(page.questionsTextBox, "Who will win nba championship?");
                break;
            case "who will win ncaa championship?":
                BrowserUtils.selectByVisibleText(page.questionsTextBox, "who will win ncaa championship?");
                break;
            default:
                System.out.println("Text not available");


        }
    }

    @When("I click on {string} button")
    public void iClickOnButton(String textButton) {
        switch (textButton.toLowerCase()){
            case "add do":
                BrowserUtils.click(page.addDoBtn);
                break;
            case "add don't":
                BrowserUtils.click(page.addDontBtn);
                break;
            case "enter 1":
                BrowserUtils.click(page.enterBtnForDoSection);
                break;
            case "enter 2":
                BrowserUtils.click(page.enterBtnForDontSection);
                break;
            case "soft skills":
                BrowserUtils.click(page.softSkillsBtn);
                break;
            case "coding":
                BrowserUtils.click(page.codingBtn);
                break;
            case "enter new question":
                BrowserUtils.click(page.enterNewQuestionBtn);
                break;
            case "soft skills question":
                BrowserUtils.click(page.softSkillQuestionTextBox);
                break;
            case "enter 3":
                BrowserUtils.click(page.softSkillEnterBtn);
                break;
            case "all topics":
                BrowserUtils.click(page.allTopicsBtn);
                break;
            case "manage access":
                BrowserUtils.click(loginPage.manageAccessBtn);
                break;
            case "add user":
                BrowserUtils.click(loginPage.addUserBtn);
                break;
            case "action":
                BrowserUtils.click(accPage.actionButton);
                break;
            case "show all":
                BrowserUtils.click(accPage.showAllBtn);
                break;
            default:
                System.out.println("Button doesn't exist");
        }
        
    }

    @And("I will type {string}")
    public void iWillType(String argument) {
        switch (argument.toLowerCase()){
            case "do study hard":
                BrowserUtils.sendKeys(page.doTextBox, "Do study hard");
                break;
            case "don't be a hater":
                BrowserUtils.sendKeys(page.textBoxForDont, "Don't be a hater");
                break;
            case "who's going to win the nba championship?":
                BrowserUtils.sendKeys(page.softSkillQuestionTextBox, "Who's going to win the NBA Championship?");
                break;
            case "who's going to win the ncaa championship?":
                BrowserUtils.sendKeys(page.codingQuestionBox, "Who's going to win the NCAA Championship?");
                break;
            default:
                System.out.println("Argument not available");;
        }
        
    }

    @Then("I click on {string} text box")
    public void iClickOn(String textBox) {
        switch (textBox.toLowerCase()){
            case "input area 1":
                BrowserUtils.click(page.doTextBox);
                break;
            case "input area 2":
                BrowserUtils.click(page.textBoxForDont);
                break;
            case "soft skill":
                BrowserUtils.click(page.questionsTextBox);
                break;
            case "coding question box":
                BrowserUtils.click(page.codingQuestionBox);
                break;
            default:
                System.out.println("Text box not available");
        }
    }


    @Then("Verify {string} button is enabled")
    public void verifyButtonIsEnabled(String functionalityButtons) {
        switch (functionalityButtons.toLowerCase()){
            case "edit":
                BrowserUtils.isEnabled(page.editBtn);
                break;
            case "delete":
                BrowserUtils.isEnabled(page.deleteBtn);
                break;
            default:
                System.out.println("Button isn't enabled");
        }
    }
}
