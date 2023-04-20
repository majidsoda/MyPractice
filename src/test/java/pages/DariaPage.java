package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class DariaPage {
    public DariaPage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);}

    @FindBy(xpath = "//u[text()='Sign out']")
    public WebElement signOutBtn;

    @FindBy(xpath = "//u[text()='Manage Access']")
    public WebElement AccessBtn;

    @FindBy(xpath = "  //nav[@class='navbar navbar-expand-lg navbar-light bg-light']")
    public WebElement navBarBtn;

}