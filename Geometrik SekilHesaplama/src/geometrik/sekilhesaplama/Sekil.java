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
public abstract class Sekil {
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Sekil(String isim) {
        this.isim = isim;
    }
    abstract void alanHesapla();

}
