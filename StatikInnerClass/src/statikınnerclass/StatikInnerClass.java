/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statikınnerclass;

/**
 *
 * @author gkand
 */
public class StatikInnerClass {

    
    public static void main(String[] args) {
        
        Matematik.Alan alan = new Matematik.Alan();
        
        alan.daireAlan(5);
        
        Matematik.Alan.daireAlan(5);
    }
    
}
