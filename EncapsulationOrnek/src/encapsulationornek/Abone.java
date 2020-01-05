
package encapsulationornek;

/**
 *
 * @author gkand
 */
public class Abone {
    
    public String isim;
    public int bakiye;
    public String sehir;

    
    public void dogalgazKullan(int miktar){
        if(this.bakiye<miktar){
            System.out.println("Yeterli bakiye yok");
        }else{
            this.bakiye-=miktar;
            if(this.bakiye<=0){
                System.out.println("Bakiyeniz bitmiştir. Lütfen en yakın doldurma merkezine gidiniz."+
                        "Kredi limiti = 200TL");
            }else{
                System.out.println("Kalan bakiyeniz : "+this.bakiye);
            }
        }
    }
    public void bakiyeOgren(){
        System.out.println("Bakiyeniz : "+this.bakiye);
    }
}
