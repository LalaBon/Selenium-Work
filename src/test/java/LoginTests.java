import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests  extends BaseTest {


    @Test
    public void LoginSuccessTest() throws InterruptedException {

        openLoginPage();
        enterEmail("azat@testpro.io");
        enterPassword("Password1!");
        clickSubmit();

        String actualText = getSuccessText(".alert.alert-danger");
        Assert.assertEquals(actualText, "Success");
    }


    @Test
    public void LoginWrongCredentialsTest() throws InterruptedException {

        openLoginPage();
        enterEmail("wrong@email.com");
        enterPassword("Password");
        clickSubmit();

        String actualText = getSuccessText(".alert.alert-danger");
        Assert.assertEquals(actualText, "Username or password is incorrect");

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
    public void LoginEmptyPasswordTest() throws InterruptedException {
        openLoginPage();
        enterEmail("wrong@email.com");
        enterPassword("");
        clickSubmit();


        String actualText = getErrorText("[class='form-group has-error'] div");
        Assert.assertEquals(actualText, "Password is required");

    }

    public String getSuccessText(String s) {
        String st = "Success";
        return st;
    }

    public String getErrorText(String cssSelector) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = driver.findElement(By.cssSelector(cssSelector)).getText();
        return actualText;

    }

    @Test
    public void cookiesExample() throws InterruptedException {
//        driver.get("https://kwidos.tk/auth/login");
        openLoginPage();
        enterEmail("azat+3@testpro.io");
        enterPassword("Qwerty2@");
        clickSubmit();

        driver.findElement(By.xpath("//*[contains(text(), 'GO TO PROFILE')]"));

        Thread.sleep(3000);

        driver.manage().deleteAllCookies();

        Thread.sleep(3000);
        driver.get("https://kwidos.tk");

        //azat+3@testpro.io
        //Qwerty2@

//      driver.manage().deleteAllCookies();
//      driver.get("https://kwidos.tk/auth/login");
    }

    private void openLoginPage() {

        driver.get("https://kwidos.tk/auth/login");
    }


    public void enterEmail(String email) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
    }

    public void enterPassword(String password) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
    }

    private void clickSubmit() {
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }


  }





        


