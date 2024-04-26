package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginStepDef extends BaseTest {

   LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.userIsOnLoginPage();

    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username){
        loginPage.userInputUsernameWith(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.userInputPasswordWith(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.userClickLoginButton();
    }

//    @Then("user is on homepage")
//    public void userIsOnHomepage() {
//        By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
//        WebElement productElement = driver.findElement(productTitle);
//        assertTrue(productElement.isDisplayed());
//        assertEquals("Sauce Labs Backpack", productElement.getText());
//    }

    @Then("user able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {
        loginPage.userAbleToSeeErrorMessage(errorMessage);
    }

//    @Then("user is on homepage see error catalog")
//    public void userIsOnHomepageSeeErrorCatalog() {
//        driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img"));
//        assertEquals("", driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).getText());
//        By productTitle = By.xpath("//*[@id=\"item_4_img_link\"]/img");
//        WebElement productElement = driver.findElement(productTitle);
//        assertTrue(productElement.isDisplayed());
//        assertEquals("", productElement.getText());
//
//    }
//
//    @Then("user is on homepage see error one picture catalog")
//    public void userIsOnHomepageSeeErrorOnePictureCatalog() {
//        driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img"));
//        assertEquals("", driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).getText());
//        By productTitle = By.xpath("//*[@id=\"item_4_img_link\"]/img");
//        WebElement productElement = driver.findElement(productTitle);
//        assertTrue(productElement.isDisplayed());
//        assertEquals("", productElement.getText());
//    }
}


