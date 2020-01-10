/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclasses;

/**
 *
 * @author sgb_3
 */
public class GenericClass <E> {
    
    public void yazdir(E[] dizi){
        for(E e: dizi){
            System.out.println(e);   
        }
    }
}
