package src._08_Wait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import src.utility.BaseDriver;

import java.util.List;

public class Wait extends BaseDriver {

    @Test
    public void test1() {

        driver.get(" https://qatest.twoplugs.com/");

        WebElement improved = driver.findElement(By.xpath("//*[@id='details-button']"));
        improved.click();

        WebElement moveOn = driver.findElement(By.xpath("//*[@id='proceed-link']"));
        moveOn.click();

        WebElement element = driver.findElement(By.xpath("//span[text()='What do I need to sign up?']"));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        WebElement text = driver.findElement(By.xpath("//p[text()='You need a facebook account or a valid email address to sign up.']"));
        wait.until(ExpectedConditions.visibilityOf(text));

        // The first method
        Assert.assertEquals("You need a facebook account or a valid email address to sign up.", text.getText());
        // The second method
        Assert.assertTrue(text.isDisplayed());

        waitAndClose();
    }

    @Test
    public void test02() {

        driver.get("https://google.com/");

        List<WebElement> rejectAll=driver.findElements(By.xpath("//button[@id='W0wltc']/div"));
        if(!rejectAll.isEmpty()){
            rejectAll.get(0).click();
        }

        WebElement searchInput= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        Actions actions=new Actions(driver);
        Action action=actions
                .moveToElement(searchInput)
                .click()
                .sendKeys("selenium"+ Keys.ENTER)
                .build();
        action.perform();

        WebElement theFirstLink= driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        wait.until(ExpectedConditions.elementToBeClickable(theFirstLink));

        // The first method
        Assert.assertEquals("Selenium",theFirstLink.getText());

        // The second method
        Assert.assertTrue(theFirstLink.getText().toLowerCase().contains("selenium"));

        waitAndClose();
    }
}
