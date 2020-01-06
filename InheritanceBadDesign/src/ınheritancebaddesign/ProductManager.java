
package ınheritancebaddesign;

/**
 *
 * @author gkand
 */
public class ProductManager {
    public void add(Product product,int databaseType){
        
        if(databaseType ==1){
            MysqlProductDao mysqlProductDao = new MysqlProductDao("OracleString");
            mysqlProductDao.add(product);
        }else if(databaseType == 2){
            OracleProductDao oracleProductDao = new OracleProductDao("OracleString");
            oracleProductDao.add(product);
        }
        //iş katmanı sınıfı
        
        
        System.out.println("Ürün İş Katmanı İşlemleri");
        System.out.println("Ürün ismi : "+product.getName());
    }
}
