/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.ornek.pkg2;

/**
 *
 * @author sgb_3
 */
public class Kopek extends Hayvan {

    private int disSayisi;
    
    public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSaysisi) {
        super(isim, kilo, boy, bacakSayisi);
        this.disSayisi = disSaysisi;
    }

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }
    
    public void hareketeGec(int hiz){
        System.out.println("Köpek "+hiz+" ile hareket ediyor.");
    }
    
    public void kos(int hiz){
        System.out.println("Köpek koşuyor..");

        super.hareketeGec(hiz);
        hareketeGec(hiz);
    }
}
