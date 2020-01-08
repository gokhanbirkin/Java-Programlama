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
public class Kare extends Sekil{
    private int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" alanı :"+(kenar*kenar));
    }
    
}
