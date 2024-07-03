package mockproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class TS1 {
    static WebDriver driver = new ChromeDriver();
    public static void logo_navigation(String web_locator, String page_name) throws InterruptedException {
        driver.findElement(By.xpath(web_locator)).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://platotech.com/"+page_name+"/");
        System.out.println("Driver is in "+page_name+" page.");
        driver.findElement(By.xpath("//a[@class='fusion-logo-link']")).click();
        System.out.println("Driver clicked on Logo");
        Assert.assertEquals(driver.getCurrentUrl(),"https://platotech.com/");
        System.out.println("Driver navigated back to home page successfully.");
    }

    public static void main(String[] args) throws Exception{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://platotech.com/");
        driver.findElement(By.xpath("//a[@class='fusion-logo-link']")).click();
        logo_navigation("//a//span[text()='Careers']", "careers");
        logo_navigation("//a//span[text()='Training Program']", "training");
        driver.quit();
    }
}

//package mockproject;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.assertEquals;
//
//public class TS1 {
//    public static WebElement clickPlatoLogo(WebDriver driver){
//        return driver.findElement(By.cssSelector("img.fusion-standard-logo"));
//    }
//    public static void main(String[] args) throws Exception{
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://platotech.com/");
//      // driver.findElement(By.cssSelector("img.fusion-mobile-logo")).click();
//
//        clickPlatoLogo(driver).click();
//       Thread.sleep(1000);
//driver.findElement(By.xpath("//span[@class='menu-text' and text()='Services']")).click();
//Thread.sleep(1000);
//        clickPlatoLogo(driver).click();
//String url = driver.getCurrentUrl();
//System.out.println(url);
//Assert.assertEquals(url,"https://platotech.com/");
//Thread.sleep(2000);
////training program
//driver.findElement(By.xpath("//span[@class='menu-text' and text()='Training Program']")).click();
//        Thread.sleep(1000);
//        clickPlatoLogo(driver).click();
//        System.out.println(url);
//        Assert.assertEquals(url,"https://platotech.com/");
//        Thread.sleep(2000);
//        //Careers
//        driver.findElement(By.xpath("//span[@class='menu-text' and text()='Careers']")).click();
//        Thread.sleep(1000);
//        clickPlatoLogo(driver).click();
//        System.out.println(url);
//        Assert.assertEquals(url,"https://platotech.com/");
//        Thread.sleep(2000);
//        //About Us
//        driver.findElement(By.xpath("//span[@class='menu-text' and text()='About Us']")).click();
//        Thread.sleep(1000);
//        clickPlatoLogo(driver).click();
//        System.out.println(url);
//        Assert.assertEquals(url,"https://platotech.com/");
//        Thread.sleep(2000);
//        //resources
//        driver.findElement(By.xpath("//span[@class='menu-text' and text()='Resources']")).click();
//        Thread.sleep(1000);
//        clickPlatoLogo(driver).click();
//        System.out.println(url);
//        Assert.assertEquals(url,"https://platotech.com/");
//        driver.findElement(By.xpath("//span[@class='fusion-button-text-left' and text()='Work With Us']")).click();
//        Thread.sleep(1000);
//        clickPlatoLogo(driver).click();
//        System.out.println(url);
//        Assert.assertEquals(url,"https://platotech.com/");
//    driver.quit();
//    }
//}
//

