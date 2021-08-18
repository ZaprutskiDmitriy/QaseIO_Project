package io.qase;

import io.qase.page_object.*;
import io.qase.value_object.StepData;
import io.qase.value_object.TestCaseData;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.util.Arrays.asList;

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
        }
        projectsPage.navigateToCreateProjectPage();
        createProjectPage.createProject();

        ProjectPage projectPage = new ProjectPage();
        projectPage.createNewCase();

        TestCaseData testCaseData = new TestCaseData(
                "Login Form",
                TestcasePage.Status.DRAFT,
                "We can authorize on page https://qase.io/login",
                TestcasePage.Severity.BLOCKER,
                asList(
                        new StepData("Step 1", "", "step1 completed"),
                        new StepData(
                                "Step 2",
                                "step 2 data",
                                "step2 completed"
                        )
                )
        );

        TestcasePage testcasePage = new TestcasePage();
        testcasePage.addTestcaseInfo(testCaseData);

        Assert.assertEquals(projectPage.getAlertText(), "Test case was created successfully!");
    }
}
