/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass2;

/**
 *
 * @author sgb_3
 */
public class Sayisal extends Aday{

    public Sayisal(int turk, int mat, int fiz, int sos) {
        super(turk, mat, fiz, sos);
    }

    @Override
    public int puanHesapla() {
        return getTurk()*3+getMat()*5+getFiz()*4+getSos()*2;
    }
    
    
}
