package io.qase.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPage extends BasePage {

    @FindBy(css = "img#user-menu")
    public WebElement userImage;

    @FindBy(css = "a#createButton")
    public WebElement createProjectButton;

    @FindBy(xpath = "//a[text()='TestqaseTest']")
    public WebElement nameOfProject;

    @FindBy(xpath = "//a[text()='TestqaseTest']/../../../td[8]/div/a")
    public WebElement dropdownMenu;

    @FindBy(css = "a[href='/project/TESTQASETE/delete']")
    public WebElement deleteReference;

    @FindBy(css = "button[type=submit]")
    public WebElement confirmDelete;


    public ProjectsPage(){
        super();
        PageFactory.initElements(driver, this);
    }

    public WebElement getUserImage(){
        return userImage;
    }

    public void navigateToCreateProjectPage(){
        createProjectButton.click();
    }

    public WebElement getNameOfProject(){
        return nameOfProject;
    }

    public void deleteProject(){
        dropdownMenu.click();
        deleteReference.click();
        confirmDelete.click();
    }

}
