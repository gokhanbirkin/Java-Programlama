/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygslysbirincileri;

/**
 *
 * @author gkand
 */
public class Sayisal extends Aday{

    public Sayisal(int turk, int mat, int fiz, int sos, String isim) {
        super(turk, mat, fiz, sos,isim);
    }

    @Override
    public int puanHesapla() {
        return getTurk()*3+getMat()*5+getFiz()*4+getSos()*2;
    }
    
    
}
