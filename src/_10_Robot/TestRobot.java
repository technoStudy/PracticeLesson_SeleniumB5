package src._10_Robot;

import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.awt.event.InputEvent.*;
import static src.utility.BaseDriver.driver;

public class TestRobot {


    @Test
    public void Test() throws AWTException {
        driver.get("https://www.trendyol.com/");
        Robot robot =new Robot();

        //Reklam kapatma
        robot.delay(5000);
        robot.mouseMove(1604,557);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

        // cerezleri kabul ettik
        robot.mouseMove(2030,1390);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

        // bildirimlere izin verdik
        robot.delay(2000);
        robot.mouseMove(372,215);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

         //Arama cubugu
        robot.delay(1000);
        robot.mouseMove(1015,260);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

          // urunu yazin
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_ENTER);

          // bos alana tikla
        robot.delay(2000);
        robot.mouseMove(500,400);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

        // urune tikla
        robot.mouseMove(1200,550);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

        // sepete ekle
        robot.delay(2000);
        robot.mouseMove(1300,830);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

        // TARAYICIDAKI 2. SEKMEYI KAPAT
        robot.mouseMove(550,57);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

        // tarayiciyi kapat
        robot.mouseMove(24,50);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);

        robot.delay(6000);
        driver.quit();

    }
}
