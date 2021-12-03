import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.*;

public class FileUploadTest extends BaseTest {
    @Test
    public void uploadFile() {
        driver.get("http://the-internet.herokuapp.com/upload");
        File file = new File("src/test/resources/testimg.jpg");
        driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        assertEquals(driver.findElement(By.xpath("//div[@class='example']/h3")).getText(), "File Uploaded!", "File not Uploaded!");

    }
}