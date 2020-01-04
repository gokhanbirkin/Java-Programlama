/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlarprojesi;

/**
 *
 * @author sgb_3
 */
public class Yonetici extends Calisan{
    private int sorumluKisiSayisi;

    public Yonetici( String ad, String soyAd, int id,int sorumluKisiSayisi) {
        super(ad, soyAd, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sorumlu olduğu kişi sayısı : "+sorumluKisiSayisi);
    }
    
    public void zamYap(int zamMiktari){
        System.out.println(getAd()+" çalışanlara "+zamMiktari+" lira kadar zam yapıyor..");
    }
    
}
