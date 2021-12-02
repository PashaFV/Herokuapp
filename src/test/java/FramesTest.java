import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FramesTest extends BaseTest {
    @Test
    public void textInParagraph() {
        driver.get("http://the-internet.herokuapp.com/frames");
        driver.findElement(By.xpath("//a[@href='/iframe']")).click();
        WebDriver frame = driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        String textFromParagraph = frame.findElement(By.xpath("//body[@class='mce-content-body ']/p")).getText();
        assertEquals(textFromParagraph, "Your content goes here.", "Text does not  match");
    }

}