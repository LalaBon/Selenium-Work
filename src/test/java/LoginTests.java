
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {

    @Test
    public void LoginSuccessTest() throws InterruptedException {

        homepage.openPage();
        homepage.clickToOpenSignIn();
        loginPage.openPage();

        loginPage.enterEmail("azat@testpro.io");
        loginPage.enterPassword("Password1!");
        loginPage.clickSubmit();

        String actualText = loginPage.getSuccessText(".alert.alert-danger");
        Assert.assertEquals(actualText, "Success");
    }


    @Test
    public void LoginWrongCredentialsTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.openPage();
                 .enterEmail("wrong@email.com");
                 .enterPassword("Password");
                 .clickSubmit();

        String actualText = loginPage.getErrorText(".alert.alert-danger");
        Assert.assertEquals(actualText, "Username or password is incorrect");

    }


    @Test
    public void LoginEmptyEmailTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.openPage();
        loginPage.enterEmail("");
        loginPage.enterPassword("Password");
        loginPage.clickSubmit();


        String actualText = loginPage.getErrorText("[class='form-group has-error'] div");
        Assert.assertEquals(actualText, "Email is required");

    }

    @Test
    public void LoginEmptyPasswordTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.openPage();
        loginPage.enterEmail("wrong@email.com");
        loginPage.enterPassword("");
        loginPage.clickSubmit();


        String actualText = loginPage.getErrorText("[class='form-group has-error'] div");
        Assert.assertEquals(actualText, "Password is required");

    }

}