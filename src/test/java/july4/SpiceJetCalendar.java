package july4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SpiceJetCalendar {
    public static void main(String[] args) {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        //driver.window().manage().maximize();
        driver.get("https://www.spicejet.com/");

        // Locate the 'Departure Date' field and click on it to open the calendar
        WebElement departureDateField = driver.findElement(By.id("ctl00_mainContent_view_date1"));
        departureDateField.click();
        WebElement departureDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[text()='15']"));
        departureDate.click();
        WebElement returnDateField = driver.findElement(By.id("ctl00_mainContent_view_date2"));
        returnDateField.click();
        // XPath based on the current structure of the website
        WebElement returnDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[text()='25']"));
        returnDate.click();

        driver.quit();
    }
}

