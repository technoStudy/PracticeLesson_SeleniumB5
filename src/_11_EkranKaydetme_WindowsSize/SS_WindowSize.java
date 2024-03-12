package src._11_EkranKaydetme_WindowsSize;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import src.utility.MyFunction;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static src.utility.BaseDriver.driver;
import static src.utility.BaseDriver.wait;

public class SS_WindowSize {
    @Test
    public void test() throws IOException {

        driver.get("https://www.facebook.com/");

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement button = driver.findElement(By.xpath("//button[@name='login']"));

        email.sendKeys("asdasdasd");
        pass.sendKeys("asdasdasd");
        button.click();

        List<WebElement> errMsg = driver.findElements(By.xpath("//*[text()='Wrong credentials']"));

        if (errMsg.size() > 0) {
            System.out.println("Hata alindi ");

            MyFunction.wait(3);

            // Ekran boyutu ayarlama (Window Size )
            Dimension dimension=new Dimension(1000,1000);
            driver.manage().window().setSize(dimension);

            TakesScreenshot ts = (TakesScreenshot) driver;
            File hafiza = ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(hafiza, new File("screenshott\\Gecersiz_giris.jpg"));
        }


        MyFunction.wait(3);
        driver.quit();


        // Todo : Hata aldiginizda ekran resmi yerine ekran videosu alma .

    }
}
