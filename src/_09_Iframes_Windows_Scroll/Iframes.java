package src._09_Iframes_Windows_Scroll;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import src.utility.BaseDriver;

public class Iframes extends BaseDriver {

    @Test
    public void iFrameTest() {

        // 1. Sayfayı açmak için gerekli URL'yi kullanın
        driver.get("https://the-internet.herokuapp.com/iframe");

        // 2. Iframe'e geçmek için iframe'in id, name veya index özelliğini kullanın
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
//        driver.switchTo().frame(0);
//        driver.switchTo().frame("mce_0_ifr");

        // 3. Iframe'in içindeki metin kutusunu bulmak için xpath kullanın
        WebElement textArea = driver.findElement(By.xpath("//body[@id='tinymce']"));

        // 4. Metin kutusunun içeriğini temizlemek için clear() metodunu kullanın
        textArea.clear();

        // 5. Metin kutusuna yeni bir metin yazmak için sendKeys() metodunu kullanın
        textArea.sendKeys("Bu metin Selenium ile değiştirildi.");

        // 6. Iframe'den çıkmak parentFrame() metodunu kullanın
        driver.switchTo().parentFrame();

        // 7. Tüm iframelerden çıkıp direkt ana sayfaya dönmek için defaultContent() metodunu kullanın
        driver.switchTo().defaultContent();

        waitAndClose();
    }
}
