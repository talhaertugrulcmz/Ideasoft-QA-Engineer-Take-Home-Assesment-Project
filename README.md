Görev 1 - Ideasoft QA Web Otomasyon Projesi 
-------------------------------------------

* Geliştirme Ortamı : Intelij

* Kullanılan Programlama Dili: Java

* Framework : Cucumber

* Kütüphane : Selenium

* Herbir test senaryosunun koşumu tek bir feature dosyası yerine her ana senaryo icin ayrı feature dosyaları olusturulup test kosumu gerceklestirilmistir


Projede Yararlanılan Kaynaklar :
---------------------------------------
* pom.xml için = mvnrepository.com

* UrunArama senaryosunda kullanılan (hoverElement) metodu için = browserstack.com internet siteleri kullanılmıştır.Dış kaynak kullanarak yararlandığım kod aşağıda belirtilmiştir.

    public void hoverElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
    }
