import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTest {

    @Test
    public void CheckboxesCheck() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type = checkbox]"));
        assertFalse(checkboxes.get(0).isSelected(), "First checkbox is marked");
        checkboxes.get(0).click();
        assertTrue(checkboxes.get(0).isSelected(), "First checkbox not marked");

        assertTrue(checkboxes.get(1).isSelected(), "Second checkbox not marked");
        checkboxes.get(1).click();
        assertFalse(checkboxes.get(1).isSelected(), "Second checkbox is marked");

    }

}