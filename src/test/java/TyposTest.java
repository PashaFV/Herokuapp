import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TyposTest extends BaseTest {


    @Test
    public void TyposCheck() {
        driver.get("https://the-internet.herokuapp.com/typos");
        WebElement CheckText = driver.findElement(By.tagName("p"));
        assertEquals("Sometimes you'll see a typo, other times you won't.", CheckText.getText(), "There is a spelling error in the text");

    }


}