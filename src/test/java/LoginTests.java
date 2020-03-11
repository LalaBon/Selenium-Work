import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests  extends BaseTest {


    @Test
    public void LoginWrongCredentialsTest() throws InterruptedException {

        openLoginPage();
        enterEmail("wrong@email.com");
        enterPassword("Password");
        clickSubmit();

        String actualText = getErrorText(".alert.alert-danger");
        Assert.assertEquals(actualText, "Username or password in incorrect");

    }


    @Test
    public void LoginEmptyEmailTest() throws InterruptedException {

        openLoginPage();
        enterEmail("");
        enterPassword("Password");
        clickSubmit();


        String actualText = getErrorText("[class='form-group has-error'] div");
        Assert.assertEquals(actualText, "Email is required");

    }

    @Test
    public void LoginEmptyPasswordTest ()  {
        openLoginPage();
        enterEmail("");
        enterPassword("Password");
        clickSubmit();


        String actualText = getErrorText("[class='form-group has-error'] div");
        Assert.assertEquals(actualText, "Email is required");

    }

    private void enterPassword(String password) {
    }

    private void clickSubmit() {
    }


}
        


