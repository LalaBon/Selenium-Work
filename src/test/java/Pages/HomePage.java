package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    public HomePage (WebDriver givendriver) {
        super(givendriver);
    }

    public void OpenPage() {
        driver.get("https://kwidos.tk/");

    }

    public void clickToOpenSignIn() {
        clickToElementByXpath("//*[contains(text(), 'SIGN IN')]");
    }

}
