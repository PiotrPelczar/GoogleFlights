import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {


    @org.junit.jupiter.api.Test
    public void test2() {

        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.navigate().to("https://www.google.com/travel/flights");

        //eksploruj
        driver.findElement(By.xpath("/html/body/c-wiz[1]/div[3]/div/div[2]/div/nav/div[2]/a/button/span")).click();

        //obie strony przycisk
        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/button/span[1]/span[2]")).click();
        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/ul/li[2]")).click();

        //calendar
        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div/span/button[1]")).click();

        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/section/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[3]/div[1]/button/span")).click();

        //wszystkie filtry
        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/button/span")).click();
        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div[2]/div/div[1]/section[1]/div/div/div[2]/div/input")).click();
        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div[2]/div/div[1]/section[2]/div/div/div[2]/div/input")).click();

        //slider
      driver.findElement(By.cssSelector("#yDmH0d > c-wiz:nth-child(24) > div > div.lteUWc > div > c-wiz > div.ql6Nlc > div > div > div.yg0R1e > div.CkJH0 > section > div > div.MzdRSe > div.IS0cNb.ExHZLe > div:nth-child(1) > div.CQeWeb.ikpmV > div.JQrP8b.PLrkBc > div > div.v0tSxb.SOcuWe > div.dvO2xc.k0gFV > div > button > span.VfPpkd-vQzf8d")).click();
        driver.findElement(By.cssSelector("#yDmH0d > c-wiz:nth-child(24) > div > div.lteUWc > div > c-wiz > div.ql6Nlc > div > div > div.yg0R1e > div.CkJH0 > section > div > div.MzdRSe > div.IS0cNb.ExHZLe > div:nth-child(1) > div.CQeWeb.ikpmV > div.JQrP8b.PLrkBc > div > div.v0tSxb.SOcuWe > div.dvO2xc.k0gFV > div > button > span.VfPpkd-vQzf8d")).click();

        driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/div/c-wiz/div[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/button/span")).click();

        WebElement slider = driver.findElement(By.cssSelector("#yDmH0d > c-wiz:nth-child(24) > div > div.lteUWc > div > c-wiz > div.ql6Nlc > div > div > div.yg0R1e > div.CkJH0 > div > div > div > div.dq93Ae.lqK3vd.cmKkVe.eXUIm > div.xkSIab > div > div.i4ijO > div > div.ztrQMe.gBIxsf > section:nth-child(4) > div > div > div > div.WNEA0e > div > div"));


        //  WebElement sliderH = driver.findElement(By.className("VfPpkd-UTM9ec-tmWYNe"));
     Actions action = new Actions(driver);
     action.dragAndDropBy(slider, -5000,0).release();


      // Actions action = new Actions(driver);
      //  action.dragAndDropBy(sliderHandle,-530, 0).click();






    }
}
