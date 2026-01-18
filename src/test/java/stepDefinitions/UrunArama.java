package stepDefinitions;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UrunArama extends Driver {


    pages.UrunArama urunArama = new pages.UrunArama();


    @Given("dogru sayfa kontrolü")
    public void aramaAlanınınGörüpGörünmemesiKontrolü() throws InterruptedException {

        urunArama.urlKontrolu();

    }

    @When("kullanıcı arama alanına tıklar {string} yazar")
    public void kullanıcıAramaAlanınaTıklarYazar(String productName) {

        urunArama.urunAramaClick();

        WebElement aramaKutusu = driver.findElement(By.cssSelector("input[type='text']"));
        aramaKutusu.sendKeys(productName);
        
    }

    @And("kullanıcı arama butonuna tıklar")
    public void kullanıcıAramaButonunaTıklar() throws InterruptedException {

        urunArama.setUrunAramaIkonu();
        Thread.sleep(2000);
        
    }

    @Then("aratılan ürünün listelenmesinin kontrolü")
    public void aratılanÜrününListelenmesininKontrolü() {

        urunArama.setUrunKontrolu();
        Assert.assertTrue("ürünler listelendi",urunArama.setUrunKontrolu());


    }

    @And("aratılan ürüne kadar ekran kaydırılır")
    public void aratılanÜrüneKadarEkranKaydırılır() throws InterruptedException {
        urunArama.hoverElement();
        Thread.sleep(1000);
    }
}
