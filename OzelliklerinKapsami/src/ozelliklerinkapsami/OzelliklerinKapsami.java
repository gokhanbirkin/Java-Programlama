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
public class OzelliklerinKapsami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KapsamSinifi kapsam = new KapsamSinifi();
        //kapsam.onileCarp();
        KapsamSinifi2.DahiliSınıf kapsam2 = new KapsamSinifi2().new DahiliSınıf();
        kapsam2.onileCarp();
        KapsamSinifi2 kapsam3 = new KapsamSinifi2();
        kapsam3.dahiliSınıfKontrol();
    }
    
}
