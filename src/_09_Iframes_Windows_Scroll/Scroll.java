package src._09_Iframes_Windows_Scroll;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import src.utility.BaseDriver;
import src.utility.MyFunction;

import java.util.ArrayList;

public class Scroll extends BaseDriver {

    @Test
    public void scrollTest(){

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        ArrayList<String>arrayList=new ArrayList<>();
        WebElement text;
        JavascriptExecutor js=(JavascriptExecutor)driver;

        for (int i = 1; i <11 ; i++) {
            MyFunction.wait(1);
            text= driver.findElement(By.xpath("(//div[@class='jscroll-added'])["+i+"]"));
            arrayList.add(i-1,text.getText());
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            System.out.println(i+"."+"Paragraf : " + arrayList.get(i-1));
        }
        waitAndClose();
    }
}
