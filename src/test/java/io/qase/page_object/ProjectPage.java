package io.qase.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage extends BasePage{

    @FindBy(xpath = "//a[text()='Create new case']")
    private WebElement createCaseButton;

    public ProjectPage(){
        super();
        PageFactory.initElements(driver, this);
    }

    public void createNewCase(){
        createCaseButton.click();
    }
}
