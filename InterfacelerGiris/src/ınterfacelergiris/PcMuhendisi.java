/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınterfacelergiris;

/**
 *
 * @author sgb_3
 */
public class PcMuhendisi implements IMuhendis{
    
    private boolean askerlik;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
    @Override
    public void askerlikDurumuSorgula() {
        if(askerlik){
            System.out.println("Askerliğimi yaptım.");
        }else{
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam "+ derece;
    }

    @Override
    public void adliSicilSorgula() {
        if(adliSicil){
            System.out.println("Adli sicil kaydım bulunmaktadır.");
        }else{
            System.out.println("Adli sicil kaydım yoktur.");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak listede gözüken şirketlerde çalıştım");
        for(String s : array){
            System.out.println(s);
        }
    }
    
}
