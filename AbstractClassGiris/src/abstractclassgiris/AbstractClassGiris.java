
package abstractclassgiris;

/**
 *
 * @author gkand
 */
public class AbstractClassGiris {

    
    public static void main(String[] args) {
        Sekil sekil;
        sekil = new Kare("Kare2",7);
        Kare kare = new Kare("Kare",3);
        Daire daire = new Daire("Daire", 1);
        kare.alanHesapla();
        daire.alanHesapla();
        sekil.alanHesapla();
        kare.cevreHesapla();
        //sekil.cevreHesapla(); Hata
    }
    
}
