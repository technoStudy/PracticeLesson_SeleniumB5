package src._01_seleniumIntro;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import src.utility.BaseDriver;
import src.utility.MyFunction;


public class Test01 extends BaseDriver {

    @Test
    public void scenario1() {

        driver.get("http://demo.nopcommerce.com/");

        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        MyFunction.wait(1);
        WebElement genderMale = driver.findElement(By.id("gender-male"));
        genderMale.click();

        MyFunction.wait(1);
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("First Name");

        MyFunction.wait(1);
        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Last Name");

        MyFunction.wait(1);
        WebElement eMail = driver.findElement(By.id("Email"));
        eMail.sendKeys("testing" + ((int) (Math.random() * 10000)) + "@testing.com");

        MyFunction.wait(1);
        WebElement companyName = driver.findElement(By.name("Company"));
        companyName.sendKeys("Company");

        MyFunction.wait(1);
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("password");

        MyFunction.wait(1);
        WebElement passwordConfirm = driver.findElement(By.id("ConfirmPassword"));
        passwordConfirm.sendKeys("password");

        MyFunction.wait(1);
        WebElement registerButton = driver.findElement(By.className("register-next-step-button"));
        registerButton.click();

        waitAndClose();
    }
}
