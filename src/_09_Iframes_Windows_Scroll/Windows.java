package src._09_Iframes_Windows_Scroll;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import src.utility.BaseDriver;

import java.util.List;
import java.util.Set;

public class Windows extends BaseDriver {

    @Test
    public void windowsTest() {

        driver.get("https://demoqa.com/browser-windows");

        List<WebElement> consent = driver.findElements(By.xpath("//p[@class='fc-button-label']"));
        if (!consent.isEmpty()) {
            consent.get(0).click();
        }

        String firstTabID = driver.getWindowHandle();

        WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTab.click();

        Set<String> windowIDs = driver.getWindowHandles();

        for (String windowID : windowIDs) {
            if (windowID.equals(firstTabID)) {
                continue;
            }
            driver.switchTo().window(windowID);
        }

        WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));

        System.out.println("text.getText() = " + text.getText());

        waitAndClose();
    }
}
