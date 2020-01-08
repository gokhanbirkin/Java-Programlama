
package abstractclassgiris;

/**
 *
 * @author gkand
 */
public class Kare extends Sekil{
    private int kenar;
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" alanı : "+(kenar*kenar));
    }
    
    public void cevreHesapla(){
        System.out.println(getIsim()+" çevresi : "+(kenar*4));
    }
    
    
}
