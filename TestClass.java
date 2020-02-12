import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\BrowserSeleniumDrivers\\GoogleChrome\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("https://www.bbc.com/");
        WebElement searchField = webDriver.findElement(By.xpath("//input[@id=\"orb-search-q\"]"));
        searchField.clear();
        searchField.sendKeys("helloWorld");
        searchField.submit();
        WebElement webElement = webDriver.findElement(By.xpath("//input[@id =\"se-searchbox-input-field\"]"));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        webDriver.close();
        webDriver.quit();

        //System.out.println(webElement.getAttribute("value"));

    }


    
}
