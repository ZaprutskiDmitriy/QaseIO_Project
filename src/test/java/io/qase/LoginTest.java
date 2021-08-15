package io.qase;

import io.qase.page_object.LoginPage;
import io.qase.page_object.StartPage;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest(){
        StartPage startPage = new StartPage();
        startPage.navigateToLoginPage();

        LoginPage loginPage = new LoginPage();
        loginPage.login();

    }
}
