
package ınterfacereallife;

/**
 *
 * @author gkand
 */
public class InterfaceRealLife {

    
    public static void main(String[] args) {
       SignUpManager signUp = new SignUpManager(new AgeUserCheckService()); 
       signUp.signUp(new User(1, "Gökhan", 25));
    }
    
}
