package io.qase;

import io.qase.page_object.LoginPage;
import io.qase.page_object.ProjectsPage;
import io.qase.page_object.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest (){
        StartPage startPage = new StartPage();
        startPage.navigateToLoginPage();

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ProjectsPage projectsPage = new ProjectsPage();
        Assert.assertTrue(projectsPage.getUserImage().isDisplayed());
    }
}
