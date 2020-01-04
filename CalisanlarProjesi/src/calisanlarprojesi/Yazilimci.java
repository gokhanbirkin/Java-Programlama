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
public class Yazilimci extends Calisan{

    private String diller;
    
    public Yazilimci(String ad, String soyAd, int id, String diller) {
        super(ad, soyAd, id);
        this.diller = diller;
    }
    
    public void formatAt(String isletimSistemi){
        System.out.println(getAd()+" "+isletimSistemi+" yüklüyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yazılımcının bildiği diller : "+diller);
    }
    
}
