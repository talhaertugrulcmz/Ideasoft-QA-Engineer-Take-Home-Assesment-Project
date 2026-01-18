package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SepetKontrol {

    pages.SepetKontrol sepetKontrol = new pages.SepetKontrol();


    @And("kullanıcı sepet ikonu tıklar")
    public void kullanıcıSepetIkonuTıklar() {

        sepetKontrol.sepeteTıklama();
    }

    @Then("sepette ürün adet kontrolü yapılır")
    public void sepetteÜrünAdetKontrolüYapılır() throws InterruptedException {

        sepetKontrol.sepetKontrol();

    }
}
