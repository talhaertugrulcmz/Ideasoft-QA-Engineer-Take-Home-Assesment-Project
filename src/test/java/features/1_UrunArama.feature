
Feature: Ana sayfada arama yerine ürün yazılarak arama yapılır


  @UrunArama
  Scenario Outline: Kullanıcı ürün araması yapar
    Given dogru sayfa kontrolü
    When  kullanıcı arama alanına tıklar "<productName>" yazar
    And   kullanıcı arama butonuna tıklar
    And   aratılan ürüne kadar ekran kaydırılır
    Then  aratılan ürünün listelenmesinin kontrolü

    Examples:
      |productName|
      |ürün      |


