import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class InputsTest extends BaseTest {


    @Test
    public void InputPozitiveDigits() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputNumbers = driver.findElement(By.tagName("input"));
        inputNumbers.sendKeys("100500");
        inputNumbers.sendKeys(Keys.ARROW_UP);
        assertEquals(inputNumbers.getAttribute("value"), "100501", "The number has not increased");
        inputNumbers.sendKeys(Keys.ARROW_DOWN);
        assertEquals(inputNumbers.getAttribute("value"), "100500", "The number has not decreased");

    }

    @Test
    public void InputNegativeDigits() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputNumbers = driver.findElement(By.tagName("input"));
        inputNumbers.sendKeys("-1");
        inputNumbers.sendKeys(Keys.ARROW_UP);
        assertEquals(inputNumbers.getAttribute("value"), "0", "The number has not increased");
        inputNumbers.sendKeys(Keys.ARROW_DOWN);
        assertEquals(inputNumbers.getAttribute("value"), "-1", "The number has not decreased");

    }


}