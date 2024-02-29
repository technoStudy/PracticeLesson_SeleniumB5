package src._05_Select_ElementInStatus;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import src.utility.BaseDriver;
import src.utility.MyFunction;

public class Test05 extends BaseDriver {

    @Test
    public void scenario1() {

        driver.get("http://demo.nopcommerce.com/");

        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        MyFunction.wait(1);
        WebElement genderMale = driver.findElement(By.id("gender-male"));

        System.out.println("genderMale.isEnabled() = " + genderMale.isEnabled());
        System.out.println("genderMale.isDisplayed() = " + genderMale.isDisplayed());
        System.out.println("genderMale.isSelected() = " + genderMale.isSelected());

        genderMale.click();
        Assert.assertTrue(genderMale.isSelected());

        System.out.println("********************************");
        System.out.println("After check");

        System.out.println("genderMale.isEnabled() = " + genderMale.isEnabled());
        System.out.println("genderMale.isDisplayed() = " + genderMale.isDisplayed());
        System.out.println("genderMale.isSelected() = " + genderMale.isSelected());

        MyFunction.wait(1);
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("First Name");

        MyFunction.wait(1);
        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Last Name");

        WebElement dayMenu = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select daySelectMenu = new Select(dayMenu);
        daySelectMenu.selectByIndex(3);
//        daySelectMenu.selectByValue("3");
//        daySelectMenu.selectByVisibleText("3");

        WebElement monthMenu = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Select monthSelectMenu = new Select(monthMenu);
//        monthSelectMenu.selectByIndex(4);
        monthSelectMenu.selectByValue("4");
//        monthSelectMenu.selectByVisibleText("April");

        WebElement yearMenu = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select yearSelectMenu = new Select(yearMenu);
//        yearSelectMenu.selectByIndex(7);
//        yearSelectMenu.selectByValue("1920");
        yearSelectMenu.selectByVisibleText("1920");

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

        WebElement confirmMessage = driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertTrue("Not confirmed", confirmMessage.getText().contains("Your registration completed"));
        // Assert.assertTrue(confirmMessage.isDisplayed());

        waitAndClose();
    }
}
