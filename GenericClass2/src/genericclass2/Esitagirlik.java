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
public class Esitagirlik extends Aday{

    public Esitagirlik(int turk, int mat, int fiz, int sos) {
        super(turk, mat, fiz, sos);
    }

    @Override
    public int puanHesapla() {
        return getTurk()*5+getSos()*4+getMat()*3+getFiz()*2;
    }
    
}
