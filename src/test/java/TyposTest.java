import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TyposTest extends BaseTest {


    @Test
    public void typosSpellCheck() {
        driver.get("https://the-internet.herokuapp.com/typos");
        //WebElement CheckSpell = driver.findElement(By.tagName("p"));
        String spellCheck = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
        assertEquals(spellCheck, "Sometimes you'll see a typo, other times you won't.", "There is a spelling error in the text");

    }


}