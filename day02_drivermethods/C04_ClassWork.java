package day02_drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//Tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların ilkini yazdırın
        List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.get(0).getText());

        //Arama sonuc sayisini ekrana yazdir
        String[] sonucSayisi = aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("sonucSayisi[2] = " + sonucSayisi[2]);

        //Sonuc sayisini LAMBDA ile yazdir
        Arrays.stream(sonucSayisi).limit(3).skip(2).forEach(System.out::println);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWE = driver.findElements(By.className("s-image"));
        ilkWE.get(0).click();
    }
}
