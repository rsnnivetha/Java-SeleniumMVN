package July2;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;



public class Assertions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://spicejet.com"); //URL in the browser

        ////div[@class="css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa"][text()="Senior Citizen"]

        //Assert.assertFalse(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][text()='Senior Citizen']")).isSelected());

//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][text()='Senior Citizen']")).click();

        System.out.println(driver.findElement(By.cssSelector("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][text()='Senior Citizen']")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][text()='Senior Citizen']")).isSelected());


    }
}