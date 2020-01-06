/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınheritancebaddesign;

/**
 *
 * @author sgb_3
 */
public class MysqlProductDao {
  
    private String connectionString;
    
    public MysqlProductDao(String connectionString) {
        this.connectionString = connectionString;
    }
    
    public void add(Product product){
        System.out.println("Mysql Database "+product.getName()+" eklendi.");
    }
    
    public void delete(Product product){
        System.out.println("Mysql Database"+product.getName()+" silindi.");
    }
}
 

