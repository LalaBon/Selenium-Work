package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage (WebDriver givendriver) {
        driver = givendriver;
        wait = new WebDriverWait
    }

    private String getSuccessText(String s) {
        String st = "Success";
        return st;

    }

    public String getErrorText (String cssSelector) {

        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector))).getText();

        return actualText;
    }

    public void openLoginPage()  {
        driver.get("https://kwidos.tk/auth/login");

    }

    public void enterEmail(String)
}
