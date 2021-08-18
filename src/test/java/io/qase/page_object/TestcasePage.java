package io.qase.page_object;

import io.qase.page_element.QaseSelect;
import io.qase.page_element.StepElement;
import io.qase.value_object.StepData;
import io.qase.value_object.TestCaseData;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestcasePage extends BasePage{

    @FindBy(css = "input[name=title]")
    private WebElement inputTitle;

    @FindBy(css = "p[data-placeholder='For example: We can authorize on page http://example.com/login']")
    private WebElement inputDescription;

    private static String selectLocatorTemplate = "[id='%sGroup']";

    @FindBy(xpath = "//*[@id=\"behaviorGroup\"]/div[1]/div/div[1]")
    private WebElement dropdownBehavior;
    @FindBy(xpath = "//div[text()='Positive']")
    private WebElement dropdownBehaviorPositive;

    @FindBy(xpath = "(//*[@id=\"undefinedGroup\"]/div[1]/div[2]/div/p)[2]")
    private WebElement inputPreconditions;

    @FindBy(css = ".steps-add")
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

    public void addTestcaseInfo(TestCaseData data){
        inputTitle.sendKeys(data.getTitle());
        pickStatus(data.getStatus());
        inputDescription.sendKeys(data.getDescription());
        pickSeverity(data.getSeverity());

        Actions actions = new Actions(driver);
        for (StepData stepData :
                data.getStepDataList()) {
//            ((JavascriptExecutor) driver).executeScript(
//                    "arguments[0].click()", addStepButton);
//            actions.moveToElement(addStepButton).click().perform();
            addStepButton.click();
            StepElement stepElement = new StepElement(
                    driver, By.cssSelector(".suitecase-step"));
            stepElement.fillStep(stepData);
        }

        saveCaseButton.click();
    }

    private void pickStatus(Status status) {
        QaseSelect dropdownStatusSelect = new QaseSelect(
                driver,
                By.cssSelector(String.format(selectLocatorTemplate, "status")
                )
        );
        if (Status.ACTUAL.equals(status)) {
            dropdownStatusSelect.selectByVisibleText("Actual");
        } else if (Status.DRAFT.equals(status)) {
            dropdownStatusSelect.selectByVisibleText("Draft");
        }
    }

    private void pickSeverity(Severity severity) {
        QaseSelect dropdownSeveritySelect = new QaseSelect(
                driver,
                By.cssSelector(String.format(selectLocatorTemplate, "severity")
                )
        );
        if (Severity.BLOCKER.equals(severity)) {
            dropdownSeveritySelect.selectByVisibleText("Blocker");
        }
    }


    public enum Status {
        ACTUAL, DRAFT, DEPRECATED
    }

    public enum Severity {
        NORMAL, BLOCKER
    }
    enum Priority { NOT_SET }
    enum Type { OTHER }
    enum Level { UNKNOWN }
    enum Behaviour { NOT_SET }

}
