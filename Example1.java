import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Example1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sravanisainandina/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        //this creates a browser instance

        //go to an url
        driver.get("http://fits.qauber.com/#/page/login");

        sleep(3000);
        //quit the browser
        driver.quit();

    }

}
