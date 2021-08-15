package io.qase;

import io.qase.page_object.*;
import org.testng.annotations.Test;

public class CreateTestcaseTest {

    @Test
    public void createTestcaseTest() throws InterruptedException {
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


    }

}
