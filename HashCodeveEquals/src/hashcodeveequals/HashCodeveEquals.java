package hashcodeveequals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author gkand
 */


class Player{
    private String isim;
    private int id;
    public Player(String isim,int id){
        this.isim = isim;
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.isim);
        hash = 31 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "|| ID : "+id+"  isim : "+isim+" ||";
    }
    
}

public class HashCodeveEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        Player player1 = new Player("Gökhan",7);
        Player player2 = new Player("Mustafa",1);
        Player player3 = new Player("Murat",3);
        Player player4 = new Player("Gökhan",7);
        
        Set<Player> hashSetP = new HashSet<Player>();
        hashSetP.add(player1);
        hashSetP.add(player2);
        hashSetP.add(player3);
        hashSetP.add(player4);
        for(Player p : hashSetP){
            System.out.println(p);
        }
        
        /*hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("C++");
        for(String temp : hashSet){
            System.out.println(temp);
        }*/
    }
    
    
}
