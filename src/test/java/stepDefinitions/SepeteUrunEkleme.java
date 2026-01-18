package stepDefinitions;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SepeteUrunEkleme extends Driver {

    pages.SepeteUrunEkleme sepeteUrunEkleme = new pages.SepeteUrunEkleme();


    @Given("kullanıcı listedeki ilk ürüne tıklar")
    public void kullanıcıListedekiIlkÜrüneTıklar() {

        sepeteUrunEkleme.ilkUrunClick();

    }

    @When("ürün detay sayfası açılır")
    public void ürünDetaySayfasıAçılır() throws InterruptedException {

        sepeteUrunEkleme.urunDetayKontrolu();
        Thread.sleep(2000);

    }

    @And("ürün ismi, fiyatı ve sepete ekle butonu görünmelidir")
    public void ürünIsmiFiyatıVeSepeteEkleButonuGörünmelidir() {

        sepeteUrunEkleme.urunFiyatKontrol();
        sepeteUrunEkleme.urunIsımKontrol();
        sepeteUrunEkleme.urunTextKontrol();
        sepeteUrunEkleme.urunAdetKontrol();

    }


    @And("üründen 5 adet sepete ekle ve mesaj kontrolu")
    public void üründenAdetSepeteEkleVeMesajKontrolu() throws InterruptedException {

        sepeteUrunEkleme.urunSepeteEklemeVeMesajKontrolu();


    }
}
