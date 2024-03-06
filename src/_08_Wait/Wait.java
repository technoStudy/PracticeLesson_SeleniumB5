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

    /*
  Task 2:
  "https://qatest.twoplugs.com/" sitesine gidiniz.
  What do I need to sign up?  sorusuna tiklatiniz.
  "You need a facebook account or a valid email address to sign up." texti görülene kadar bekletiniz.
  Text'in göründüğünü doğrulayınız.
     */

    @Test
    public void test01() {

        driver.get("https://qatest.twoplugs.com/");

        WebElement improved = driver.findElement(By.xpath("//button[@id='details-button']"));
        improved.click();

        WebElement moveOn = driver.findElement(By.xpath("//a[@id='proceed-link']"));
        moveOn.click();

        WebElement text = driver.findElement(By.xpath("//span[text()='What do I need to sign up?']"));
        wait.until(ExpectedConditions.elementToBeClickable(text));
        text.click();

        WebElement newText = driver.findElement(By.xpath("//p[text()='You need a facebook account or a valid email address to sign up.']"));
        wait.until(ExpectedConditions.visibilityOf(newText));

        // The first method
        Assert.assertEquals("You need a facebook account or a valid email address to sign up.", newText.getText());

        // The second method
        Assert.assertTrue(newText.isDisplayed());

        waitAndClose();
    }

    @Test
    public void test02() {

        /*
          Task 3:
   "https://google.com/"  sitesine gidiniz.
   Search kısmına "selenium" yazıp Enter'a basiniz.
   Sonuclar kısmındaki ilk sonucun "selenium" kelimesini içerdiğini doğrulayınız.
         */
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

        WebElement theFirstLink= driver.findElement(By.xpath("//h3[text()='Selenium']"));
        wait.until(ExpectedConditions.elementToBeClickable(theFirstLink));


        Assert.assertEquals("Selenium",theFirstLink.getText());

        waitAndClose();
    }
}
