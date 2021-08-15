package io.qase.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends BasePage{

    @FindBy(css = "a#signin")
    private WebElement loginButton;

    public StartPage(){
        super();
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage(){
        loginButton.click();
    }

}
