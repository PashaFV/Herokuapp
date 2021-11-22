import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTest {

    @Test
    public void CheckboxesCheck() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement firstCheckbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        assertFalse(firstCheckbox.isSelected(), "First checkbox is marked");

        firstCheckbox.click();
        assertTrue(firstCheckbox.isSelected(), "First checkbox not marked");

        WebElement secondCheckbox = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        assertTrue(secondCheckbox.isSelected(), "Second checkbox not marked");

        secondCheckbox.click();
        assertFalse(secondCheckbox.isSelected(), "Second checkbox is marked");

    }

}