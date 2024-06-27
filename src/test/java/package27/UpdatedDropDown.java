package package27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {

    public UpdatedDropDown() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        //NMAVIGATE TO THE PAGE
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
        //change the nuber of passengers - say add 3
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        /*
         * driver.findElement(By.id("hrefIncAdt")).click();
         * driver.findElement(By.id("hrefIncAdt")).click();
         * driver.findElement(By.id("hrefIncAdt")).click();
         * driver.findElement(By.id("hrefIncAdt")).click();
         * driver.findElement(By.id("hrefIncAdt")).click();
         * driver.findElement(By.id("hrefIncAdt")).click();
         */    //use for or while loop
        int i=0;
        /*
         * while(i<5) {
         *
         * driver.findElement(By.id("hrefIncAdt")).click(); Thread.sleep(2000); i++;
         *
         * }
         */
        for(i=0;i<5;i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        String noOfAdults = driver.findElement(By.id("divpaxinfo")).getText();
//        Assert.Equals(noOfAdults, "5 Adult");
        Assert.assertEquals(noOfAdults, "5 Adult");
        driver.quit();


    }
}
