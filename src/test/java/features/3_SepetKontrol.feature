Feature: Kullanıcı sepete eklediği ürünü kontrolünü yapar

  @SepeteKontrol
  Scenario Outline: Kullanıcı sepete eklediğini ürünün kontrolünü yapar

    Given kullanıcı arama alanına tıklar "<productName>" yazar
    When  kullanıcı arama butonuna tıklar
    And   aratılan ürüne kadar ekran kaydırılır
    And   kullanıcı listedeki ilk ürüne tıklar
    And   ürün detay sayfası açılır
    And   ürün ismi, fiyatı ve sepete ekle butonu görünmelidir
    And   üründen 5 adet sepete ekle ve mesaj kontrolu
    And   kullanıcı sepet ikonu tıklar
    Then  sepette ürün adet kontrolü yapılır


    Examples:
      |productName|
      |ürün      |