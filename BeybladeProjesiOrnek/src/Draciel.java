
/**
 *
 * @author gkand
 */
public class Draciel extends Beyblade{

    private String kutsalCanavar;
    
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal canavarının adı : "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" kutsal canavarı olan "+kutsalCanavar+" çıkarıyor.");
        System.out.println(getBeybladeci()+"ın savunması kale savunması.. ");
    }
    
    
}
