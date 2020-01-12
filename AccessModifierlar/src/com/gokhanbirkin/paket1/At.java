/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gokhanbirkin.paket1;

import com.gokhanbirkin.paket2.Hayvan;

/**
 *
 * @author gkand
 */
public class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }
   
    public void isminiSoyle(){
        System.out.println(super.isim);
    }
}
