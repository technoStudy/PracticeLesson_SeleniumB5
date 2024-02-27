package src._03_CssSelector;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import src.utility.BaseDriver;
import src.utility.MyFunction;

public class Test03 extends BaseDriver {

    @Test
    public void nopCommerce() {

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().setPosition(new Point(-2000,0));
        driver.manage().window().maximize();
        MyFunction.wait(3);
//        WebElement register = driver.findElement(By.cssSelector("[class='ico-register']"));
//        register.click();

        driver.findElement(By.cssSelector("[class='ico-register']")).click();
        driver.findElement(By.cssSelector("[type=\"radio\"][id='gender-male']")).click();
        driver.findElement(By.cssSelector("[for=\"FirstName\"]+input")).sendKeys("ESMA");
        driver.findElement(By.cssSelector("#LastName")).sendKeys("dengeşik");

        MyFunction.wait(3);

        driver.quit();

    }


}
