package io.qase.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestcasePage extends BasePage{

    @FindBy(css = "input[name=title]")
    private WebElement inputTitle;

    @FindBy(xpath = "//*[@id=\"statusGroup\"]/div[1]/div/div[1]")
    private WebElement dropdownStatus;
    @FindBy(xpath = "//div[text()='Actual']")
    private WebElement dropdownActual;

    @FindBy(css = "p[data-placeholder='For example: We can authorize on page http://example.com/login']")
    private WebElement inputDescription;

    public TestcasePage(){
        super();
        PageFactory.initElements(driver, this);
    }

    public void addTestcaseInfo(){
        inputTitle.sendKeys("Login Form");
        dropdownStatus.click();
        dropdownActual.click();
        inputDescription.sendKeys("We can authorize on page https://qase.io/login");
    }
}
