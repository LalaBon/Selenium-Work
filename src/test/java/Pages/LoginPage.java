package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver givendriver) { super(givendriver);  }

    public String getSuccessText(String s) {
        String st = "Success";
        return st;
    }

    public String getErrorText (String cssSelector) {

        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector))).getText();

        return actualText;
    }

    public void  openPage(String input)  {
       String input = driver.get("https://kwidos.tk/auth/login");
       return input;

    }

    public void enterEmail(String email)  {
        findElement("#email").sendKeys(email);
        return email;
    }

    public void  enterPassword(String password)  {
        findElement("#password").sendKeys(password);
        return this;
    }

    public void LoginPage clickSubmit()  {
        clickToElement("[type='submit']");
        return this;
    }


}
