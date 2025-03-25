import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testselenium {
    public static void main(String[] args){
    //invoke browser
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://automationintesting.online/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }

}