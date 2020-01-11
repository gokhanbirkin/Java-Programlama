package com.gokhanbirkin.paket1;

import com.gokhanbirkin.paket2.AdayOgrenci;

/**
 *
 * @author gkand
 */
public class Ogrenci implements AdayOgrenci{
    
    public void deneme(){
        System.out.println("Deneme metodu");
    }
    
    @Override
    public void dersCalis() {
        System.out.println("Ders çalışıyorum..");            
    }
    
}
