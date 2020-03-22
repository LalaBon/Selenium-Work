package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriver wait;

    public HomePage (WebDriver givendriver) {
        driver = givendriver;
        wait = new WebDriverWait(driver, 4);

    }

    public void OpenPage() {
        driver.get("https://kwidos.tk/");

    }

    public void clickToOpenSignIn {
        clickToElementByXpath("//*[contains(text(), 'SIGN IN')]");
    }

    private void clickToElementByXpath(String s) {
    }

}
