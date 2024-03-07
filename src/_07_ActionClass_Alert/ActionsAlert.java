package src._07_ActionClass_Alert;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import src.utility.BaseDriver;
import src.utility.MyFunction;

public class ActionsAlert extends BaseDriver {
    @Test
    public void alert1() {

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setPosition(new Point(-1000, 0));
        driver.manage().window().maximize();

        WebElement jsAlert = driver.findElement(By.xpath("//*[text()='JavaScript Alerts']"));
        jsAlert.click();
        MyFunction.wait(3);
        WebElement alertButton1 = driver.findElement(By.xpath("(//button)[1]"));
        alertButton1.click();

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();
        System.out.println("Alert Mesajı : " + alertText);
        MyFunction.wait(3);
        alert.accept();
        MyFunction.wait(3);
        driver.quit();
    }

    @Test
    public void alert2() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setPosition(new Point(-1000, 0));
        driver.manage().window().maximize();

        WebElement jsAlert = driver.findElement(By.xpath("//*[text()='JavaScript Alerts']"));
        jsAlert.click();
        MyFunction.wait(3);

        WebElement alertButton2 = driver.findElement(By.xpath("(//button)[2]"));
        alertButton2.click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert Mesajı : " + alertText);
        MyFunction.wait(3);

        //alert.accept();
        alert.dismiss();

        MyFunction.wait(3);
        driver.quit();

    }

    @Test
    public void alert3(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setPosition(new Point(-1000, 0));
        driver.manage().window().maximize();

        WebElement jsAlert = driver.findElement(By.xpath("//*[text()='JavaScript Alerts']"));
        jsAlert.click();
        MyFunction.wait(3);

        WebElement alertButton3 = driver.findElement(By.xpath("(//button)[3]"));
        alertButton3.click();

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert Mesajı : "+ alert.getText());

        MyFunction.wait(3);

        alert.sendKeys("Merhaba, Selenium");

        alert.accept();

        MyFunction.wait(3);

        System.out.println("Alert gönderilen mesaj: "+ driver.findElement(By.id("result")).getText());

        MyFunction.wait(3);
        driver.quit();

    }
}
