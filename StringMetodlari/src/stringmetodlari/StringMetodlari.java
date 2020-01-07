/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodlari;

/**
 *
 * @author gkand
 */
public class StringMetodlari {

    
    public static void main(String[] args) {
        String a = "Gökhan";
        String b = new String("Gökhan");
        
        System.out.println(b);
        System.out.println("Harf sayısı : "+b.length());
        System.out.println("0. index : "+b.charAt(0));
        System.out.println("1. index : "+b.charAt(b.length()-1));
        for(int i =0; i<b.length(); i++){
            System.out.println(b.charAt(i));
        }
        System.out.println(b.startsWith("Gö")); // Bu string ile başlıyor mu
        System.out.println(b.endsWith("n")); // Bu string ile bitiryor mu
        System.out.println(b.indexOf("h")); // ilk gördüğü yerdeki index'i verir
        System.out.println(b.lastIndexOf("a")); //son gördüğü yerdeki index'i verir
        System.out.println(b.toLowerCase()); // tüm karakterleri küçüğe çevirir
        System.out.println(b.toUpperCase()); // tüm karakterleri büyüğe çevirir
        
        
        String c = "1923";
        
        int d = Integer.parseInt(c);
        System.out.println(d+1);
        
        int g = 1923;
        String h = String.valueOf(g);
        System.out.println(g);
        
        String a1 = "Gökhan";
        String a2 = "Gökhan";
        
        if(a1==a2){
            System.out.println("Eşitler");
        }
        
        String b1 = new String("Gökhan");
        String b2 = new String("Gökhan");
        
        if(b1==b2){
            System.out.println("Eşitler");
        }else{
            System.out.println("Farklı yerleri gösteriyorlar.");
        }
        
        if(b1.equals(b2)){
            System.out.println("İçerikleri aynı");
        }else{
            System.out.println("İçerikleri aynı değil");
        }

        
    }
    
}
