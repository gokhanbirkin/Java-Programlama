
package basitmatvebasitfizproblemleri;

import java.util.Scanner;

public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim) {
        this.isim = isim;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vectörün i j k değerlerini giriniz..");
        System.out.print("i :");
        this.i = scan.nextInt();
        System.out.print("j :");
        this.j = scan.nextInt();
        System.out.print("k :");
        this.k = scan.nextInt();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
}
