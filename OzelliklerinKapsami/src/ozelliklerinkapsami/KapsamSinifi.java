/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozelliklerinkapsami;

/**
 *
 * @author sgb_3
 */
public class KapsamSinifi {
    private int privateDegisken = 30;
    public KapsamSinifi(){
        
    }
    public void onileCarp(){
        int privateDegisken = 10; // Bu durumda en local olan metoddaki değişkenin değerini alır
        for(int i=0; i<6; i++){
            System.out.println(i+" * "+privateDegisken+" = "+(i*privateDegisken));
        }
        for(int i=0; i<6; i++){
                        System.out.println(i+" * "+this.privateDegisken+" = "+(i*this.privateDegisken));

        }
    }
}
