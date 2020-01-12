/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwanahtarkelimesi;

import java.util.Scanner;

/**
 *
 * @author sgb_3
 */
public class ThrowAnahtarKelimesi {

    /**
     * @param args the command line arguments
     */
    public static void mekanKontrol(int yas){
        if(yas<18){
            throw new ArithmeticException("Yaşın küçük");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas = scan.nextInt();
        
        try {
           mekanKontrol(yas);

        } catch (Exception e) {
            System.out.println("Yaş sınırı 18'dir.");
        }
    }
    
}
