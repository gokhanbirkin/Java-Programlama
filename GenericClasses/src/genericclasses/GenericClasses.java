package genericclasses;

import java.util.ArrayList;

/**
 *
 * @author gkand
 */
public class GenericClasses {

    public static void main(String[] args) {
        Character[] charDizi = {'J','A','V','A'};
        Integer[] intDizi = {1,2,3,4,5};
        String[] stringDizi = {"Java","Php","C"};
        Ogrenci[] ogrenciDizi = {new Ogrenci("Gökhan"),new Ogrenci("Mustafa"),new Ogrenci("Mehmet")};
        /*for(Ogrenci o : ogrenciDizi){
            System.out.println(o);
        }*/
        /*CharYazdir.yazdir(charDizi);
        System.out.println("_________________________________");
        IntYazdir.yazdir(intDizi);
        System.out.println("_________________________________");
        StringYazdir.yazdir(stringDizi);
        System.out.println("_________________________________");
        OgrenciYazdir.yazdir(ogrenciDizi);*/
        GenericClass<Character> yazdirChar = new GenericClass<Character>();
        GenericClass<String> yazdirString = new GenericClass<String>();
        GenericClass<Integer> yazdirInt = new GenericClass<Integer>();
        GenericClass<Ogrenci> yazdirOgrenci = new GenericClass<Ogrenci>();
        
        yazdirChar.yazdir(charDizi);
        System.out.println("__________________");
        yazdirString.yazdir(stringDizi);
        System.out.println("__________________");
        yazdirInt.yazdir(intDizi);
        System.out.println("__________________");
        yazdirOgrenci.yazdir(ogrenciDizi);
        
        
        
        
    }
    
    
    
}
