package src._06_ActionClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import src.utility.BaseDriver;

import java.time.Duration;

public class ActionsClassMetodlari extends BaseDriver {
    @Test
    public void action1(){

        Actions actions = new Actions(driver);

        //Mouse Hover (Fare Üzerine Gelme):
        WebElement elementToHover = driver.findElement(By.id("elementId"));
        actions.moveToElement(elementToHover).perform();
        //1. **Mouse Hover (Fare Üzerine Gelme):**
        //- Site: "http://the-internet.herokuapp.com/hovers"

        //Double Click (Çift Tıklama):
        WebElement elementToDoubleclick = driver.findElement(By.id("elementId"));
        actions.doubleClick(elementToDoubleclick).perform();

        //Right Click (Sağ Tıklama)
        WebElement elementToRightClick = driver.findElement(By.id("elementId"));
        actions.contextClick(elementToRightClick).perform();
        //2. **Right Click (Sağ Tıklama):**
        //- Site: "https://the-internet.herokuapp.com/context_menu"

        //Drag and Drop (Sürükle ve Bırak):
        WebElement sourceElement = driver.findElement(By.id("sourceElementId"));
        WebElement targetElement = driver.findElement(By.id("targetElementId"));
        actions.dragAndDrop(sourceElement, targetElement).perform();
        //3. **Drag and Drop (Sürükle ve Bırak):**
        //- Site: "http://the-internet.herokuapp.com/drag_and_drop"

        //Keyboard Actions (Klavye Etkileşimleri):
        actions.sendKeys(Keys.CONTROL, "a").build().perform(); // Ctrl+A
        //4. **Keyboard Actions (Klavye Etkileşimleri):**
        //- Site: "http://the-internet.herokuapp.com/key_presses"

        //Composite Actions (Karmaşık Etkileşimler):
        WebElement elementToHover1 = driver.findElement(By.id("elementId"));
        WebElement elementToClick1 = driver.findElement(By.id("anotherElementId"));

        actions.moveToElement(elementToHover1)
                .click()
                .moveToElement(elementToClick1)
                .click()
                .perform();

        //Pause (Bekleme):
        actions.pause(Duration.ofSeconds(2)).perform(); // 2 saniye bekleme

        //Performing Multiple Actions:
        WebElement element = driver.findElement(By.id("elementId"));
        actions.moveToElement(element).perform();
        actions.click().perform();
        actions.sendKeys("Hello").perform();

        //Keyboard Shortcuts (Klavye Kısayolları):
        actions.keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .perform(); // Ctrl+C (Kopyala)

        //Slider Kullanımı:
        WebElement slider = driver.findElement(By.id("slider"));
        actions.dragAndDropBy(slider, 100, 0).perform(); // Slider'ı 100 piksel sağa sürükle
        //5. **Slider Kullanımı:**
        //- Site: "http://the-internet.herokuapp.com/horizontal_slider"

        //Çoklu Tuş Kombinasyonları:
        actions.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform(); // Ctrl+A (Hepsini Seç)

        //Eleman Üzerinde Click ve Hold:
        WebElement element1 = driver.findElement(By.id("elementId"));
        actions.clickAndHold(element1).perform(); // Element üzerinde basılı tutma
        //6. **Eleman Üzerinde Click ve Hold:**
        //   - Site: "http://the-internet.herokuapp.com/drag_and_drop" (bir elementi sürüklerken basılı tutma)

        //Eleman Üzerinde Release (Bırakma):
        WebElement element2 = driver.findElement(By.id("elementId"));
        actions.release(element2).perform(); // Element üzerinde basılı tutmayı bırakma
        //7. **Eleman Üzerinde Release (Bırakma):**

        //Çift Eleman Arasında Drag and Drop:
        WebElement sourceElement1 = driver.findElement(By.id("sourceElementId"));
        WebElement targetElement1 = driver.findElement(By.id("targetElementId"));
        actions.dragAndDrop(sourceElement1, targetElement1).perform();

        //Mouse Scroll To Element:
        WebElement element3 = driver.findElement(By.id("elementId"));
        actions.moveToElement(element3).perform(); // Elemente doğru sayfayı kaydırma
    }
}
