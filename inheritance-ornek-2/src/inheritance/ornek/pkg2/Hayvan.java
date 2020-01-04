/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.ornek.pkg2;


public class Hayvan {
    private String isim;
    private int kilo;
    private int boy;
    private int bacakSayisi;
    
    public Hayvan(String isim, int kilo, int boy, int bacakSayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacakSayisi = bacakSayisi;
    }

    public String getisim() {
        return isim;
    }

    public void setisim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
    }
    
    public void yemekye(){
        System.out.println("Hayvan şu anda yemek yiyor..");
    }
    
    public void hareketeGec(int hiz){
        System.out.println("Hayvan "+hiz+" ile hareket ediyor.");
    }
    
}
