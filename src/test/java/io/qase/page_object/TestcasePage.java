package io.qase.page_object;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestcasePage extends BasePage{

    @FindBy(css = "input[name=title]")
    private WebElement inputTitle;

    @FindBy(xpath = "//*[@id=\"statusGroup\"]/div[1]/div/div[1]")
    private WebElement dropdownStatus;
    @FindBy(xpath = "//div[text()='Actual']")
    private WebElement dropdownStatusActual;

    @FindBy(css = "p[data-placeholder='For example: We can authorize on page http://example.com/login']")
    private WebElement inputDescription;

    @FindBy(xpath = "//*[@id=\"severityGroup\"]/div[1]/div/div[1]")
    private WebElement dropdownSeverity;
    @FindBy(xpath = "//div[text()='Blocker']")
    private WebElement dropdownSeverityBlocker;

    @FindBy(xpath = "//*[@id=\"priorityGroup\"]/div[1]/div/div[1]")
    private WebElement dropdownPriority;
    @FindBy(xpath = "//div[text()='High']")
    private WebElement dropdownPriorityHigh;

    @FindBy(xpath = "//*[@id=\"typeGroup\"]/div[1]/div/div[1]")
    private WebElement dropdownType;
    @FindBy(xpath = "//div[text()='Smoke']")
    private WebElement dropdownTypeSmoke;

    @FindBy(xpath = "//*[@id=\"layerGroup\"]/div[1]/div/div[1]")
    private WebElement dropdownLayer;
    @FindBy(xpath = "//div[text()='E2E']")
    private WebElement dropdownLayerE2E;

    @FindBy(xpath = "//*[@id=\"behaviorGroup\"]/div[1]/div/div[1]")
    private WebElement dropdownBehavior;
    @FindBy(xpath = "//div[text()='Positive']")
    private WebElement dropdownBehaviorPositive;

    @FindBy(xpath = "(//*[@id=\"undefinedGroup\"]/div[1]/div[2]/div/p)[2]")
    private WebElement inputPreconditions;

    @FindBy(css = "a#add-step")
    private WebElement addStepButton;

    @FindBy(css = "p[data-placeholder='For example: Open Sign in page']")
    private WebElement inputAction;

    @FindBy(css = "p[data-placeholder='For example: Login / password']")
    private WebElement inputData;

    @FindBy(css = "p[data-placeholder='For example: popup is opened']")
    private WebElement inputExpectedResult;

    @FindBy(css = "button#save-case")
    private WebElement saveCaseButton;

    public TestcasePage(){
        super();
        PageFactory.initElements(driver, this);
    }

    public void addTestcaseInfo(){
        inputTitle.sendKeys("Login Form");
        dropdownStatus.click();
        dropdownStatusActual.click();
        inputDescription.sendKeys("We can authorize on page https://qase.io/login");
        dropdownSeverity.click();
        dropdownSeverityBlocker.click();
        dropdownPriority.click();
        dropdownPriorityHigh.click();
        dropdownType.click();
        dropdownTypeSmoke.click();
        dropdownLayer.click();
        dropdownLayerE2E.click();
        dropdownBehavior.click();
        dropdownBehaviorPositive.click();
        inputPreconditions.sendKeys("Войти на сайт https://qase.io/");
/*
        addStepButton.click();
        inputAction.sendKeys("Ввести данные в поле “Email”");
        inputData.sendKeys("Значение = zaprutsciy@mail.ru");
        inputExpectedResult.sendKeys("Введенное значение отображается в поле “Email”");
        addStepButton.click();
        inputAction.sendKeys("Ввести данные в поле “Password”");
        inputData.sendKeys("Значение = fE25hPhVXiu8xiM");
        inputExpectedResult.sendKeys("Введенное значение отображается в поле “Password”");
        addStepButton.click();
        inputAction.sendKeys("Нажать на кнопку “Login“");
        inputExpectedResult.sendKeys("Переход на страницу с проектами " +
                "и отображение иконки пользователя в правом верхнем углу");
*/
        saveCaseButton.click();
    }


}
