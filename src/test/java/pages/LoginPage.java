package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userIsOnLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void userInputUsernameWith(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void userInputPasswordWith(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void userClickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void userAbleToSeeErrorMessage(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
