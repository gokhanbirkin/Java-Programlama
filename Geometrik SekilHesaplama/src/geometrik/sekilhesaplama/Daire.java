/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrik.sekilhesaplama;

/**
 *
 * @author sgb_3
 */
public class Daire extends Sekil{
    private int yariCap;

    public Daire(int yariCap, String isim) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" alanı : "+(Math.PI*yariCap*yariCap));
    }
    
}
