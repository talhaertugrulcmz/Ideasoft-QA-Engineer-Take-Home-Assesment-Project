package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.WaitUtils;

public class SepeteUrunEkleme extends Driver {

    protected Logger logger = LoggerFactory.getLogger(getClass());


    public By UrunTiklama = By.xpath("//*[@id=\"showcase-container\"]/div/div[1]");
    public By UrunDetaySayfasi = By.id("product-detail-container");
    public By urunFiyatKontrol = By.cssSelector("div[class=\"product-price\"]");
    public By urunIsımKontrol = By.cssSelector("div[class=\"product-title\"]");
    public By urunSepetEklemeButonu = By.cssSelector("a[class=\"add-to-cart-button\"]");
    public By urunAdetKontrol = By.cssSelector("div[class=\"product-qty-wrapper\"]");
    public By urunAdetKutucugu = By.cssSelector("a[aria-label=\"Increase Quantity\"]");



    public void ilkUrunClick() {
        WaitUtils.waitForVisible(UrunTiklama).click();
    }


    public boolean urunDetayKontrolu() {
        return WaitUtils.waitForVisible(UrunDetaySayfasi).isDisplayed();

    }

    public boolean urunFiyatKontrol() {
        return WaitUtils.waitForVisible(urunFiyatKontrol).isDisplayed();

    }

    public boolean urunIsımKontrol() {
        return WaitUtils.waitForVisible(urunIsımKontrol).isDisplayed();

    }

    public boolean urunTextKontrol() {
        return WaitUtils.waitForVisible(urunSepetEklemeButonu).isDisplayed();

    }

    public boolean urunAdetKontrol() {
        return WaitUtils.waitForVisible(urunAdetKontrol).isDisplayed();

    }

    public void urunSepeteEklemeVeMesajKontrolu() throws InterruptedException {

        WebElement urunAdetSayisiGirme = driver.findElement(urunAdetKutucugu);
        WebElement urunuSepeteEkle = driver.findElement(urunSepetEklemeButonu);


        for (int i=0; i<4;i++){
            urunAdetSayisiGirme.click();
        }

        Thread.sleep(1000);
        urunuSepeteEkle.click();
        Thread.sleep(1000);


        String PopupMesaj = driver.findElement(By.cssSelector("body[class=\"current-page-product-detail\"]")).getText();

        if (PopupMesaj.contains("SEPETİNİZE EKLENMİŞTİR")) {
            logger.info("SEPETINIZE EKLENMISTIR ... Urununuz basarili bir sekilde sepete eklenmistir.");
        } else {
            logger.info("Sectiginiz Urun Sepete Eklenemedi... ");
        }
        Thread.sleep(2000);

    }

}
