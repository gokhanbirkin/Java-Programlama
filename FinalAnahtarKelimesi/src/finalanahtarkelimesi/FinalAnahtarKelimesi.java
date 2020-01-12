package finalanahtarkelimesi;

/**
 *
 * @author gkand
 */
public class FinalAnahtarKelimesi {

    public static void main(String[] args) {
        FinalTest f1 = new FinalTest("Obje1");
        FinalTest f2 = new FinalTest("Obje2");
        
        System.out.println("Obje sayısı : "+f1.objeSayisi);
        System.out.println("Obje sayısı : "+f2.objeSayisi);
        // f2.objeSayisi = 10; Hatalı. Contstructorda verilebiliyor sadece
        System.out.println(Math.PI);// ctrl'ye basılı tutarak metod isimlerine tıklayınca tanımlandığı yerleri gösterir
        System.out.println("Database ismi : "+Database.dbName);
        System.out.println("Database kullanıcı adı : "+Database.userName);
        System.out.println("Database şifresi : "+Database.password);
        
    }   
    
}
