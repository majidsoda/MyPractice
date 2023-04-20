package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class AccessManagementPage {
    public AccessManagementPage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);}
    @FindBy(xpath="//form[@class='form-inline my-2 my-lg-0']/select[@class='form-control']")
    public WebElement filterDropdown;

    @FindBy(xpath="//option[contains(text(),'All')]")
    public WebElement allFilterOption;

    @FindBy(xpath="//option[contains(text(),'Firstname')]")
    public WebElement firstnameFilterOption;

    @FindBy(xpath="//option[contains(text(),'Lastname')]")
    public WebElement lastnameFilterOption;

    @FindBy(xpath="//option[contains(text(),'Email')]")
    public WebElement emailFilterOption;

    @FindBy(xpath="//option[contains(text(),'Role')]")
    public WebElement roleFilterOption;

    @FindBy(xpath="//option[contains(text(),'Batch')]")
    public WebElement batchFilterOption;


    @FindBy(xpath="//tr/td[6]")
    public WebElement actionButton;

   @FindBy(xpath="//tr/td[6]")
   public List<WebElement> actionButtons;

    @FindBy(xpath="//button[text()='Edit']")
    public WebElement editBtn;

    @FindBy(xpath="//button[text()='Delete']")
    public WebElement deleteBtn;

    @FindBy(xpath="//button[text()='Reset Password']")
    public  WebElement resetPasswordBtn;

    @FindBy(xpath="//button[text()='Show all']")
    public WebElement showAllBtn;
    @FindBy(xpath="//select/option[text()='All']")
    public WebElement filterAllDropdown;

}
