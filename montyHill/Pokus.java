import java.util.Random;

public class Pokus {
    private Sutaz sutaz;
    
    public Pokus() {
        this.sutaz = new Sutaz();
    }
    
    public boolean jeVyhra() {
        return this.sutaz.jeVyhra();
    }
    
    public void vykonajPokus() {
        Random nahodneCisla = new Random();
        
        int vybraneDvere = nahodneCisla.nextInt(3);
        this.sutaz.vyberDvere(vybraneDvere);
    }
}
