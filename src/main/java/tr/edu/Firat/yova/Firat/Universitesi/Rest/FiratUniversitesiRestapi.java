package tr.edu.Firat.yova.Firat.Universitesi.Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dersler")

public class FiratUniversitesiRestapi {

	public static List<String> dersismi = new ArrayList<>();
	public static List<String> ogradi = new ArrayList<>();
	 public static List<Ogrenci> ogrenciderssecim = new ArrayList<>();
  	
	{
		dersismi.add("Matematik");
		dersismi.add("Yazılım");
		ogradi.add("İrem");
		ogradi.add("Beyza");
		ogrenciderssecim.add(new Ogrenci("Simge", "Matematik"));
        ogrenciderssecim.add(new Ogrenci("Selin", "Beden E."));
}
	
	 @GetMapping("/listele")
	    public static List<String> listele(){
	        return dersismi;
	        
	    }
	    
	    @PostMapping("/ekle")
	    public static String ekle(@RequestBody String ders) {
		dersismi.add(ders);
	    return ders;
}
	    @GetMapping("/ogrlistele")
	    public static List<String> listele2(){
	        return ogradi;
	        
	    }
	    @PostMapping("/ogrekle")
	    public static String ekleme(@RequestBody String ogrenci) {
		ogradi.add(ogrenci);
	    return ogrenci;
	    }
	    
	    @GetMapping("/secimlistele")
	    public static List<Ogrenci> listele3(){
	        return ogrenciderssecim;
	    }
	    @PostMapping("/secimekle")
	    public static Ogrenci ekle(@RequestBody Ogrenci ogrenci) {
		ogrenciderssecim.add(ogrenci);
	    return ogrenci;
	    }
}