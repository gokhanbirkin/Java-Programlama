
package hafizaoyunu;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class HafizaOyunu {
    private static Kart[][] kartlar = new Kart[4][4];
    
    public static void main(String[] args) {
        /*
        kartlar[0][0] = new Kart('A');
        */
        
        
        kartlar[0][0] = new Kart('A');
        kartlar[0][1] = new Kart('B');
        kartlar[0][2] = new Kart('E');
        kartlar[0][3] = new Kart('A');
        kartlar[1][0] = new Kart('C');
        kartlar[1][1] = new Kart('D');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('E');
        kartlar[2][0] = new Kart('B');
        kartlar[2][1] = new Kart('F');
        kartlar[2][2] = new Kart('C');
        kartlar[2][3] = new Kart('G');
        kartlar[3][0] = new Kart('G');
        kartlar[3][1] = new Kart('H');
        kartlar[3][2] = new Kart('F');
        kartlar[3][3] = new Kart('H');
       // oyunTahtasi();
        while(oyunBittiMi() == false){
            oyunTahtasi();
            tahminEt();
        }
    }
    
    public static void oyunTahtasi(){
        /*for(int i =0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("array ["+i+"]"+"["+j+"] : "+kartlar[i][j].getDeger());
                System.out.print("\t");
            }
            System.out.println("");
        }*/
        System.out.println("______________________________");
        for(int i =0; i<4; i++){
            
            for(int j=0; j<4; j++){
                
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" | "+kartlar[i][j].getDeger()+" | ");
                    System.out.print("\t");
                }else{
                    System.out.print(" | |  \t");
                }
                 
            }
            System.out.println("\n______________________________");
           
        }
    }
    public static boolean oyunBittiMi(){
        for(int i = 0; i<4; i++){
            for(int j =0; j<4; j++){
                if(kartlar[i][j].isTahmin()==false){
                    return false;
                }
            }
        }
        oyunTahtasi();
        System.out.println("Oyun bitti tebrikler :)");
        return true;
    }
    public static void tahminEt(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci tahmini giriniz(i ve j değerlerini bir boşlukla giriniz) : ");
        int i1 = scan.nextInt();
        int j1 = scan.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        
        
        System.out.print("İkinci tahmini giriniz(i ve j değerlerini bir boşlukla giriniz) : ");
        int i2 = scan.nextInt();
        int j2 = scan.nextInt();
        

        if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
            kartlar[i2][j2].setTahmin(true);
        }
        else{
            kartlar[i1][j1].setTahmin(false);
        }
    }
}
