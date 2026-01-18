package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.WaitUtils;


public class UrunArama extends Driver {

    protected Logger logger = LoggerFactory.getLogger(getClass());



    public By urunAramaTextAlanı = By.cssSelector("input[type='text']");
    public By urunAramaIkonu = By.xpath("//*[@id='header']/div/div/div/div[2]/div/form/button");
    public By urunKontrolu = By.id("showcase-container");


    public void urlKontrolu() throws InterruptedException {

        String SayfaKonrolu = driver.getCurrentUrl();

        if (SayfaKonrolu.contains("https://qatestcase.myideasoft.com/")) {
            logger.info("Dogru URL Adresi...");
            Thread.sleep(2000);

        }
        else {
            logger.info("URL adresi dogru degil !! Lutfen kontrol ediniz...");

        }
    }

    public void hoverElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");

    }

    public void urunAramaClick() {WaitUtils.waitForVisible(urunAramaTextAlanı).click();}


    public void setUrunAramaIkonu (){WaitUtils.waitForVisible(urunAramaIkonu).click();}


    public boolean setUrunKontrolu () {
        return WaitUtils.waitForVisible(urunKontrolu).isDisplayed();

    }
}

