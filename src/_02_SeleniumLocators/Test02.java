package src._02_SeleniumLocators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import src.utility.BaseDriver;
import src.utility.MyFunction;

public class Test02 extends BaseDriver {
    @Test
    public void scenerio02(){

        driver.get("https://www.mediamarkt.com.tr/");

        WebElement quer = driver.findElement(By.name("query"));
        quer.sendKeys("Telefon");
         MyFunction.wait(5);
        WebElement search =driver.findElement(By.partialLinkText("APPLE iPhone 15 128 GB Akıllı "));
        search.click();

         WebElement add = driver.findElement(By.id("pdp-add-to-cart"));
         add.click();
         WebElement price = driver.findElement(By.className("item-price"));
         System.out.println("Fiyat ;"+ price.getText());
         MyFunction.wait(3);
         WebElement continu = driver.findElement(By.id("continue"));
         continu.click();
         // WebElement home = driver.findElement(By.className("responsive ng-scope"));
         // home.click();
           driver.quit();
    }
}
// WebElement text1= driver.findElement(By.id("product-details"));
// System.out.println("Urun bilgisi : "+text1.getText());
// //WebElement garanti = driver.findElement(By.id("3056"));
//         //garanti.click();