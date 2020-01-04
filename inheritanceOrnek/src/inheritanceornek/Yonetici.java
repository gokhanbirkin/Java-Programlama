/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceornek;

/**
 *
 * @author sgb_3
 */
public class Yonetici extends Calisan{
    private int sorumlu_kisi;
    public Yonetici(String ad, int maas, String departman, int sorumlu_kisi) {
        super(ad, maas, departman);
        this.sorumlu_kisi =sorumlu_kisi;
    }
    @Override
    public void calis(){
        System.out.println("Yönetici çalışıyor.");
    }
    
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Sorumlu olunan kişi sayısı : "+sorumlu_kisi);
    }
    
    public void zamYap(){
        System.out.println("Yöneici zam yapıyor..");
    }
}
