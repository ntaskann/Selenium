package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        //Tehproeducation sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");

        //Tekrar Amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().back();

        //Tekrar tehproeducation sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //Sayfayi yenile
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Sayfayi kapat
        driver.close();


    }
}
