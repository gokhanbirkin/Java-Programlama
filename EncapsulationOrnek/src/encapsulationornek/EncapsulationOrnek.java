
package encapsulationornek;

/**
 *
 * @author gkand
 */
public class EncapsulationOrnek {

    
    public static void main(String[] args) {
        /*Abone abone = new Abone();
        abone.isim="Süleyman Gökhan BİRKİN";
        abone.bakiye = 300;
        abone.sehir = "İstanbul";
        abone.bakiyeOgren();
        abone.dogalgazKullan(150);*/
        
        GelismisAbone abone = new GelismisAbone("Gökhan", 250, "Kayseri");
        abone.bakiyeOgren();
        abone.dogalgazKullan(100);
        
    }
    
}
