Feature: Kullanıcı aradıgı ürünü sepete ekler

  @UrunSepeteEkleme
  Scenario Outline: Kullanıcı aradığı ürünü listelenen sayfada tıklar ve detay sayfasına gider ardından ürünü sepete ekler

    Given kullanıcı arama alanına tıklar "<productName>" yazar
    When  kullanıcı arama butonuna tıklar
    And   aratılan ürüne kadar ekran kaydırılır
    And   kullanıcı listedeki ilk ürüne tıklar
    And   ürün detay sayfası açılır
    And   ürün ismi, fiyatı ve sepete ekle butonu görünmelidir
    Then  üründen 5 adet sepete ekle ve mesaj kontrolu



    Examples:
      |productName|
      |ürün      |

