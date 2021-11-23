import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTest {

    @Test
    public void selectAnOption() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.id("dropdown")).click();
        driver.findElement(By.cssSelector("[value='1']")).click();
        assertEquals(driver.findElement(By.id("dropdown")).getAttribute("value"), "1", "Option 1 not selected.");

        driver.findElement(By.cssSelector("[value='2']")).click();
        assertEquals(driver.findElement(By.id("dropdown")).getAttribute("value"), "2", "Option 2 not selected.");

    }
}