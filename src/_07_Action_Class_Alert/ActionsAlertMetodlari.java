package src._07_Action_Class_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.interactions.Actions;
import src.utility.BaseDriver;

public class ActionsAlertMetodlari extends BaseDriver {
    public void alert1(){
        Actions actions = new Actions(driver);

        //Java Selenium'da Alert işlemleri, web sayfalarında görünen JavaScript alert, confirm veya
        // prompt pencerelerini kontrol etmek ve yönetmek için kullanılır.

        // 1. Alert Oluşturma:
        Alert alert = driver.switchTo().alert();

        // 2. Alert İçeriğini Alma:
        String alertText = alert.getText();
        System.out.println("Alert içeriği: " + alertText);

        // 3. Alert'i Kabul Etme (OK):
        alert.accept();

        // 4. Alert'i Reddetme (Cancel):
        alert.dismiss();

        // 5. Alert Üzerine Metin Gönderme (Prompt):
        alert.sendKeys("Merhaba, Selenium!");

        // 6. Alert Kontrolü (Var mı Yok mu?):
        boolean isAlertPresent = false;

        try {
            // Alert varsa bu kod bloğu çalışacaktır
            driver.switchTo().alert();
            isAlertPresent = true;
        } catch (NoAlertPresentException e) {
            // Alert yoksa bu hata alınacaktır ve isAlertPresent false olacaktır
        }

        System.out.println("Alert var mı? " + isAlertPresent);

//        //Alert ile İlgili Bekleme (Wait):
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();

//        //Örnek Senaryo 1 : Alert İle Uyarıyı Kabul Etme:
//        // Bir elemente tıkladığınızda bir alert penceresi çıkıyor varsayalım
//        WebElement element = driver.findElement(By.id("someElementId"));
//        element.click();
//        // Alert penceresine geçiş yapalım
//        Alert alert = driver.switchTo().alert();
//        // Alert içeriğini alalım
//        String alertText = alert.getText();
//        System.out.println("Alert içeriği: " + alertText);
//        // Alert'i kabul edelim
//        alert.accept();

//        //Örnek Senaryo 2 : Alert İle Uyarıyı Reddetme:
//        // Bir elemente tıkladığınızda bir alert penceresi çıkıyor varsayalım
//        WebElement element = driver.findElement(By.id("someElementId"));
//        element.click();
//
//        // Alert penceresine geçiş yapalım
//        Alert alert = driver.switchTo().alert();
//
//        // Alert içeriğini alalım
//        String alertText = alert.getText();
//        System.out.println("Alert içeriği: " + alertText);
//
//        // Alert'i reddedelim
//        alert.dismiss();



    }
}
