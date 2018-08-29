
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;

public class Example2 {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "//Users/sravanisainandina/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();
            //this creates a browser instance

            //go to an url
            driver.get("https://www.google.com/");

            sleep(3000);
            //driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("moon rover");

            driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("US Elections");


            driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
            //quit the browser
            driver.quit();




        }
}

