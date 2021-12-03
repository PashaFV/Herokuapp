import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControls() {

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 15);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='checkbox-example' ]/p")));
        assertTrue(driver.findElements(By.xpath("//input[@type='checkbox']")).isEmpty());
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        assertFalse(input.isEnabled(), "Input is enabled");
        driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='input-example']/p")));
        assertTrue(input.isEnabled(), "Input is disabled.");

    }
}