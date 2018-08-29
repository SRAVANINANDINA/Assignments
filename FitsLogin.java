import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FitsLogin {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sravanisainandina/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://fits.qauber.com/#/page/login");
        sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("crazy4.sravani@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Ssst.7195");

        sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/button")).click();

        driver.quit();
    }
}