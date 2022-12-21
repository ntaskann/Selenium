package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//bos bir browser actik

        driver.get("https://www.amazon.com");//gitmek istedigimiz sayfayi belirtiriz
        System.out.println("Sayfa Baslıgı   : " + driver.getTitle());
        System.out.println("Sayfa Url'i     : " + driver.getCurrentUrl());
        //System.out.println("Kaynak Kodlar   : " + driver.getPageSource());
        System.out.println(driver.getWindowHandle());//Bize o window'a ait hash degerini verir. Biz bu hash degerlerini
                                                     // bir String'e atayip pencereler arasi gecis yapabiliriz



    }
}
