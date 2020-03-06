import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class HomePageTest {

    @Test
    public void titleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get ("https://testkwidos.tk/");
        driver.manage().window().maximize();
        
        String title = driver.getTitle();
        Assert.assertEquals(title, "Kwidos");
    }

    @Test
    public static void LoginWrongCredentialsTest () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get ("https://kwidos.com/auth/login");
        driver.manage().window().maximize();

        //email locator #email
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#email")).sendKeys("wrong@email.com");

        // password locator
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
    }
}