/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gokhanbirkin.paket1;

import com.gokhanbirkin.paket2.*;

/**
 *
 * @author gkand
 */
public class Main {
    public static void main(String args[]){
        Araba araba = new Araba();
        Hayvan hayvan = new Hayvan("Hayvan ismine böyle ulaşılamaz");
        At yeniAt = new At("at");
        yeniAt.isminiSoyle();       
        
    }
}