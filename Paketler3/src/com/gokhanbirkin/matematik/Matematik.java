package com.gokhanbirkin.matematik;

/**
 *
 * @author gkand
 */
public class Matematik implements IMatematik{

    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplama işlemi sonucu : "+(a+b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Çıkarma işlemi sonucu : "+(a-b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Çarpma işlemi sonucu : "+(a*b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bölme işlemi sonucu : "+((double)a/b));
    }
    
}
