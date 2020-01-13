/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veritabanikullanim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gkand
 */
public class Baglanti {
    private String kullaniciAdi = "cafeApp";
    private String parola = "şifre...";
    private String dbIsmi = "app_db";
    private String host = "mysql11.turhost.com";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;
    public void MalzemeleriGetir(){
        String sorgu = "Select * From malzeme";
        
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int zno = rs.getInt("zno");
                String zadi = rs.getString("zadi");
                String ztipi = rs.getString("ztipi");
                int zbirimFiyati = rs.getInt("zbirimFiyati");
                System.out.print("zno : "+zno+"\tzadi : "+zadi+"\tztipi : "+ztipi+"\tzbirimFiyati : "+zbirimFiyati);
                System.out.println("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void MalzemeEkle(){
        try {
            statement = con.createStatement();
            int zno = 77;
            String zadi = "Karabiber";
            String ztipi = "Baharat";
            int zbirimFiyati = 25;
            String sorgu = "Insert Into malzeme(zno,zadi,ztipi,zbirimFiyati) values('"+zno+"','"+zadi+"','"
                    +ztipi+"','"+zbirimFiyati+"')";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public Baglanti(){
        String url = "jdbc:mysql://"+host+":"+port+"/"+dbIsmi+"?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Driver Bulunamadı");
        }
        try {
            con = DriverManager.getConnection(url,kullaniciAdi,parola);
            System.out.println("Bağlantı başarılı..");
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Bağlantı başarısız..");
        }
    }
    public static void main(String args[]){
        Baglanti baglanti = new Baglanti();
        baglanti.MalzemeEkle();
        baglanti.MalzemeleriGetir();
        
    }
}
