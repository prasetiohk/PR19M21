package pages;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void userIsOnHomepage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void userIsOnHomepageSeeErrorCatalog() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void userIsOnHomepageSeeErrorOnePictureCatalog() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }
   // public void clickAddToCartButton(List<String> items) {
    // TODO Auto-generated method stub
    //   throw new UnsupportedOperationException("Unimplemented method 'clickAddToCartButton'");
    //}
    //public void goToCartPage() {
    // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'goToCartPage'");
    //}
    //public void clickProductName(String item) {
    // TODO Auto-generated method stub
    //  throw new UnsupportedOperationException("Unimplemented method 'clickProductName'");
    //}
    public void clickAddToCartButton(List<String> items) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickAddToCartButton'");
    }
    public void goToCartPage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goToCartPage'");
    }
	public void clickProductName(String item) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'clickProductName'");
	}

}
