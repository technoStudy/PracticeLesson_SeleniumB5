package src._04_XPath;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import src.utility.BaseDriver;

public class Test04 extends BaseDriver {

    @Test

    public void xpathTest() {

        driver.get("http://demo.nopcommerce.com/");

        WebElement loginLink= driver.findElement(By.xpath("//a[@class='ico-login']"));
        //a[contains(@href,'login')]
        loginLink.click();

        WebElement eMail= driver.findElement(By.xpath("//input[@id='Email']"));
        // (//input[starts-with(@id,Email)])[3]
        eMail.sendKeys("adminTechno@gmail.com");

        WebElement password= driver.findElement(By.xpath("//input[@name='Password']"));
        //*[@name='Password' and @type='password']
        password.sendKeys("Admin123");

        WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
        //button[@type='submit' and contains(@class,'1 login')]
        loginButton.click();

        WebElement searchInput=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        //div[@class='search-box store-search-box']/form/input
        searchInput.sendKeys("Beats Pill");

        WebElement searchButton= driver.findElement(By.xpath("//div[@class='search-box store-search-box']/form/button"));
        searchButton.click();

        WebElement product=driver.findElement(By.xpath("//a[text()='Beats Pill 2.0 Wireless Speaker']"));

        /*
        ➢ Sayfada gözüken urunun Baslığının “Beats Pill” yazısını içerdiğini doğrulayınız.
        ➢ Ürüne tıklayınız.
        ➢ ADD TO CART Butonuna tıklayınız.
        ➢ Urunun başarılı bir şekilde Sepete eklendiğini doğrulayınız.
         */
    }
}
