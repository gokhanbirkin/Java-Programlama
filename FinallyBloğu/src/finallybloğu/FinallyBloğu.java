/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallybloğu;

/**
 *
 * @author sgb_3
 */
public class FinallyBloğu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.hashCode());
            int a = 3/0;
        } catch (Exception e) {
            System.err.println("Sorun çıktı. Sorunun türü : "+e);
        }finally{
            System.out.println("Çalışır her türlü..");
        }
    }
    
}
