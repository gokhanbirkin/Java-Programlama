
package polymorphismornek;

/**
 *
 * @author gkand
 */
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus(){
        return "Hayvan konuşuyor";
    }
    
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" miyavlıyor";
    }
    
}

class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" kişniyor"; //To change body of generated methods, choose Tools | Templates.
    }

    
}

public class PolyMorphismOrnek {

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("Limon");
        System.out.println(hayvan.konus());
        Hayvan kedi = new Kedi("Minnak"); // Yoruma alırsan extends ettiği classtaki konus metodu çalışır
        System.out.println(kedi.konus()); // yani Hayvan konuşuyor yazar.
        Hayvan kopek = new Kopek("Karabaş");
        System.out.println(kopek.konus());
        Hayvan at = new At("Bold Pilot");
        System.out.println(at.konus());
        
        konustur(at); // Bold Pilot kişniyor
        konustur(new At("Şahbatur")); //Şahbatur kişniyor
        
    }
    
}


