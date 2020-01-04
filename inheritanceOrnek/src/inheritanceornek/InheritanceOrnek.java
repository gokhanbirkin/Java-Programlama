/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceornek;

/**
 *
 * @author sgb_3
 */
public class InheritanceOrnek {


    public static void main(String[] args) {
        Yonetici yonetici = new Yonetici("Süleyman Gökhan BİRKİN",3500,"IT",5);
        yonetici.calis();
        yonetici.bilgileriGoster();
        yonetici.zamYap();
    }
    
}
