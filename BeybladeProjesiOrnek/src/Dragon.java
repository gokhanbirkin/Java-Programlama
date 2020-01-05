
/**
 *
 * @author gkand
 */
public class Dragon extends Beyblade{
    
    private String kutsalCanavar;
    private String gizliYetenek;
            
    public Dragon(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal canavarının adı : "+kutsalCanavar);
        System.out.println("Gizli yetenek : "+gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" kutsal canavarı olan "+kutsalCanavar+" çıkarıyor.");
        System.out.println(getBeybladeci()+"ın saldırısı hayalet kasırgası.. ");
    }
}
