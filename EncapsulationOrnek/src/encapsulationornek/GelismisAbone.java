/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationornek;

/**
 *
 * @author gkand
 */
public class GelismisAbone {
    private String isim;
    private int bakiye =0;
    private String sehir;
    
    public GelismisAbone(String isim, int bakiye, String sehir){
        this.isim = isim;
        this.sehir = sehir;
        if(bakiye>=0 && bakiye<=120){
            this.bakiye = bakiye;
        }else if(bakiye >120){
            System.out.println("Bakiyenize en fazla 120 TL yükleme yapabilirsiniz.");
            this.bakiye=120;
        }
        else{
            System.out.println("yanlış bir bakiye değeri girildi.");
        }
    }
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
