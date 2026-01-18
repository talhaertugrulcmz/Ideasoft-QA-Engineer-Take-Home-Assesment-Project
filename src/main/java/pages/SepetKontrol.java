package pages;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import utils.WaitUtils;
import org.slf4j.Logger;

public class SepetKontrol extends Driver {

    protected Logger logger = LoggerFactory.getLogger(getClass());


    public By sepetIkonTıklama = By.cssSelector("a[href='/sepet']");


    public void sepeteTıklama(){

        WaitUtils.waitForVisible(sepetIkonTıklama).click();

    }



    public void sepetKontrol () throws InterruptedException {

        WebElement UrunText = driver.findElement(By.xpath("//*[@id=\"cart-items\"]/div/div/div[2]/div/div/div[2]/div/div/div/input"));
        int UrunValue = Integer.parseInt(UrunText.getAttribute("value"));

        logger.info("Sepete Eklediginiz Urun Adedi = " + UrunValue);



        Assert.assertEquals(UrunValue,  5);
        logger.info("Sepetteki Mevcut Urun Adediniz = 5'tir\n" +
                "Sepete Eklediginiz Urun Adedi Sepetteki Mevcut Urun Adedi Ile Ayni...");

        Thread.sleep(2000);
        logger.info("SON SENARYO BAŞARILI BİR ŞEKİLDE TAMAMLANMIŞTIR...!");
    }
}

