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
public class Ucgen extends Sekil{
    private int a,b,c;

    public Ucgen(int a, int b, int c, String isim) {
        super(isim);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void alanHesapla(){
        double u = (a+b+c)/2.0;
        double alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(getIsim()+" alanı : "+alan);
    }
    
    
}
