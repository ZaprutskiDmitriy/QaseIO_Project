package io.qase;

import io.qase.page_object.*;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTestcaseTest {

    @Test
    public void createTestcaseTest() {
        StartPage startPage = new StartPage();
        startPage.navigateToLoginPage();

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ProjectsPage projectsPage = new ProjectsPage();
        CreateProjectPage createProjectPage = new CreateProjectPage();

        if(projectsPage.nameOfProject.getText().equals("TestqaseTest")){
            projectsPage.deleteProject();
            projectsPage.navigateToCreateProjectPage();
            createProjectPage.createProject();
        }
        else {
            projectsPage.navigateToCreateProjectPage();
            createProjectPage.createProject();
        }

        ProjectPage projectPage = new ProjectPage();
        projectPage.createNewCase();

        TestcasePage testcasePage = new TestcasePage();
        testcasePage.addTestcaseInfo();

        Assert.assertEquals(projectPage.getAlertText(), "Test case was created successfully!");
    }
}
