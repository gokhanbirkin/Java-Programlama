
package sarkiciprojesi;

import java.util.ArrayList;

/**
 *
 * @author gkand
 */
public class Sarkicilar {
    private  ArrayList<String> sarkiciListesi = new ArrayList<String>();
    
    public void sarkicilariBastir(){
        System.out.println("Şarkıcı listesinde"+sarkiciListesi.size()+" kadar şarkıcı var.");
        for(int i =0; i<sarkiciListesi.size(); i++){
            System.out.println((i+1)+". Şarkıcı : "+sarkiciListesi.get(i));
        }
    }
    public void sarkiciEkle(String isim){
        sarkiciListesi.add(isim);
        System.out.println(isim+" isimli şarkıcı listeye eklendi.");
    }
    public void sarkiciGuncelle(String yeniAd, int pozisyon){
        sarkiciListesi.set(pozisyon, yeniAd);
        System.out.println("Şarkıcı listesi güncellenmiştir");
    }
    public void sarkiciSil(int pozisyon){
        String isim = sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);
        System.out.println(isim+" isimli şarkıcı silindi.");
    }
    public void sarkiciAra(String sarkiciAdi){
        int pozisyon = sarkiciListesi.indexOf(sarkiciAdi);
        if(pozisyon>=0){
            System.out.println(sarkiciAdi+" isimli "+(pozisyon+1)+" numaralı pozisyonda bulundu");
        }else{
            System.out.println(sarkiciAdi+" isimli şarkıcı listede bulunamadı");
        }
    }
            
}
    
