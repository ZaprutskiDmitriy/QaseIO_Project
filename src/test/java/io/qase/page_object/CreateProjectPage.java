package io.qase.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProjectPage extends BasePage{

    @FindBy(css = "input[name=title]")
    private WebElement inputProjectName;

    @FindBy(css = "button[type=submit]")
    private WebElement createProjectButton;

    public CreateProjectPage (){
        super();
        PageFactory.initElements(driver, this);
    }

    public void createProject(){
        inputProjectName.clear();
        inputProjectName.sendKeys("TestqaseTest");
        createProjectButton.click();
    }


}
