package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(name = "email")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//u[.='Manage Access']")
    public WebElement manageAccessBtn;

    @FindBy(xpath = "//div[@class='row']//span[1]//button")
    public WebElement editDeleteBtn;

    @FindBy(xpath = "//button[.='+ Add']")
    public WebElement addDashboardBtn;

    @FindBy(xpath = "//button[.='Selenium']")
    public WebElement selDashboardBtn;

    @FindBy(id = "Firstname")
    public WebElement fistName;

    @FindBy(id = "Lastname")
    public WebElement lastName;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Role")
    public WebElement role;
    @FindBy(id = "Batch")
    public WebElement batch;

    @FindBy(id = "submit-btn")
    public WebElement addUserBtn;

    @FindBy(xpath = "//td[3]")
    public List<WebElement> emailTable;



}
