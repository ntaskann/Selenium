package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasina git
        driver.get("https://amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdir
        System.out.println("Sayfanin Konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu :"+driver.manage().window().getSize());

        //Sayfayi simge durumuna getir
        driver.manage().window().minimize();

        //Simge durumunda 3 saniye bekle ve maximize yap
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini mazimize halindeyken yazdir
        System.out.println("Sayfanin Konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu :"+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen halindeyken yazdir
        System.out.println("Sayfanin Konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu :"+driver.manage().window().getSize());

        //Sayfayi kapat
        Thread.sleep(2000);
        driver.close();










    }
}
