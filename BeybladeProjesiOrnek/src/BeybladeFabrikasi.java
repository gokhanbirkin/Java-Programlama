
/**
 *
 * @author gkand
 */
public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beybladeTuru){
        if(beybladeTuru.equalsIgnoreCase("dragon")){
            return new Dragon("Takao",800,300,"Mavi Ejderha","Kutsal cavarla konuşma");
        }else if(beybladeTuru.equalsIgnoreCase("Dranza")){
            return new Dranza("Kai",600,400,"Kırmızı Anka Kuşu");
        }else if(beybladeTuru.equalsIgnoreCase("drayga")){
            return new Drayga("Rei",800,250,"Beyaz Kaplan");
        }else if(beybladeTuru.equalsIgnoreCase("draciel")){
            return new Draciel("Max",400,1000,"Kara Kaplumbağa");
        }
        else{
            return null;
        }
    }
}
