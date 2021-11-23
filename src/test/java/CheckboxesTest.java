import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkboxesCheck() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxesList = driver.findElements(By.cssSelector("[type = checkbox]"));
        assertFalse(checkboxesList.get(0).isSelected(), "First checkbox is marked");
        checkboxesList.get(0).click();
        assertTrue(checkboxesList.get(0).isSelected(), "First checkbox not marked");

        assertTrue(checkboxesList.get(1).isSelected(), "Second checkbox not marked");
        checkboxesList.get(1).click();
        assertFalse(checkboxesList.get(1).isSelected(), "Second checkbox is marked");

    }

}