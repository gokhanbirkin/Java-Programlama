/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınterfacedetay;

/**
 *
 * @author gkand
 */
public interface IDetay {
    //private  int a = 4; // Tanımlanmıyor..
    public int a =4; //Tanımlanabiliyor..
    public String deneme = "Deneme";
    public final int b =6;
    /*public void deneme(){ HATALI
        System.out.println("Deneme");
    }*/
    public static void deneme(){
        System.out.println("Deneme Interface içinde metod..");
    }
}
