package tr.edu.Firat.yova.Firat.Universitesi.Rest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class FiratUniversitesiTest {

	FiratUniversitesiRestapi firatUniversitesiRestApi = new FiratUniversitesiRestapi();
    private static List<String> dersismi = FiratUniversitesiRestapi.dersismi;
    private static List<String> ogradi = FiratUniversitesiRestapi.ogradi;
    private static List<Ogrenci> ogrenciderssecim = FiratUniversitesiRestapi.ogrenciderssecim;

@Test
public void Listele() {
    List<String> sonuc = firatUniversitesiRestApi.listele();
    assertEquals(dersismi,sonuc);
}

@Test
public void Ekle() {
    String ders = "Yazılım";
    String sonuc = firatUniversitesiRestApi.ekle(ders);
    assertEquals("Yazılım",sonuc);
}

@Test
public void Listele2() {
    List<String> sonuc = firatUniversitesiRestApi.listele2();
    assertEquals(ogradi,sonuc);
}
@Test
public void Ekleme() {
    String ogradi = "Betül";
    String sonuc = firatUniversitesiRestApi.ekle(ogradi);
    assertEquals("Betül",sonuc);
}
@Test
public void Listele3() {
    List<Ogrenci> sonuc = firatUniversitesiRestApi.listele3();
    assertEquals(ogrenciderssecim,sonuc);
} 
@Test
public void DersSecimEkleme() {
    String ogrenciderssecim = "Resim";
    String sonuc = firatUniversitesiRestApi.ekle(ogrenciderssecim);
    assertEquals("Resim",sonuc);
}

}