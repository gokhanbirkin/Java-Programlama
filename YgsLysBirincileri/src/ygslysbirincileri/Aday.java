/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygslysbirincileri;

/**
 *
 * @author sgb_3
 */
public abstract class Aday {
    private int turk;
    private int mat;
    private int fiz;
    private int sos;
    private String isim;

    public Aday(int turk, int mat, int fiz, int sos,String isim) {
        this.turk = turk;
        this.mat = mat;
        this.fiz = fiz;
        this.sos = sos;
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTurk() {
        return turk;
    }

    public void setTurk(int turk) {
        this.turk = turk;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getFiz() {
        return fiz;
    }

    public void setFiz(int fiz) {
        this.fiz = fiz;
    }

    public int getSos() {
        return sos;
    }

    public void setSos(int sos) {
        this.sos = sos;
    }
    
    abstract int puanHesapla();
    
}
