package pages;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    By itemName = By.xpath("//div[@class=\"inventory_item_name\"]");

    By checkoutButton = By.xpath("//*[@id=\"checkout\"]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkIfContainItems(List<String> itemsToCheck) {
        List<WebElement> itemElements = driver.findElements(itemName);
        for (WebElement itemName : itemElements) {
            assertTrue(itemsToCheck.contains(itemName.getText()));
        }
    }

    public void checkIfContainItem(String title) {
            WebElement productTitle = driver.findElement(itemName);
            assertEquals(title, productTitle.getText());
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
