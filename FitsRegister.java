import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FitsRegister {
    public static void main(String[] args) throws InterruptedException{


            System.setProperty("webdriver.chrome.driver", "/Users/sravanisainandina/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("http://fits.qauber.com/#/page/login");

            sleep(3000);

        //driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();

           driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/a")).click();
           sleep(2000);

            //driver.findElement(By.name("q")).sendKeys("hello");

       // driver.findElement(By.className("btn btn-block btn-default")).click();






        }

}
