
package ınterfacereallife;

/**
 *
 * @author gkand
 */
public class SignUpManager {
    private IUserCheckService iUserCheckService;
    
    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }
    public void signUp(User user){
        if(iUserCheckService.checkUser(user)){
            System.out.println("Kayıt başarılı. "+user.getName());
        }else{
            System.out.println("Yaş sınırı 18");
        }
        
    }
}
