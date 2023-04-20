package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='All Topics']")
    public WebElement allTopicsBtn;

    @FindBy(xpath = "//button[text()='Coding']")
    public WebElement codingBtn;

    @FindBy(xpath = "//button[text()='Soft skills']")
    public WebElement softSkillsBtn;

    @FindBy(xpath = "//button[text()='Add do ']")
    public WebElement addDoBtn;

    @FindBy(xpath = "//div[@class='col-md-3 dont']//button")
    public WebElement addDontBtn;
    @FindBy(id = "inputArea1")
    public WebElement doTextBox;

    @FindBy(xpath = "//button[text()='Enter']")
    public WebElement enterBtnForDoSection;

    @FindBy(id = "inputArea2")
    public WebElement textBoxForDont;

    @FindBy(xpath = "(//button[@class='btn btn-outline-white btn-sm btn-success'])[2]")
    public WebElement enterBtnForDontSection;

    @FindBy(xpath = "//div[text()='Do study hard']")
    public WebElement doFinalText;

    @FindBy(xpath = "div[text()='Dont be a hater']")
    public WebElement dontFinalText;

    @FindBy(xpath = "//button[@class='btn btn-warning badge-pill newbtn']")
    public WebElement enterNewQuestionBtn;

    @FindBy(name = "question")
    public WebElement softSkillQuestionTextBox;

    @FindBy(xpath = "//textarea[@id='question']")
    public WebElement codingQuestionBox;

    @FindBy(xpath = "//button[@class='btn badge-pill btn-primary mb-1']")
    public WebElement softSkillEnterBtn;

    @FindBy(xpath = "(//div[@class='row question-section shadow-sm'][1])")
    public WebElement questionsTextBox;

    @FindBy(xpath = "(//div[@class='col-md-8'])[1]")
    public WebElement selectSoftSkillQuestion;

    @FindBy(xpath = "(//div[@class='col-md-8'])[1]")
    public WebElement selectCodingQuestion;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-warning']")
    public WebElement editBtn;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-danger ml-1']")
    public WebElement deleteBtn;


}
