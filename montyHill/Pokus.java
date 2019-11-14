import java.util.Random;

public class Pokus {
    private Sutaz sutaz;
    private boolean hracZmeniVolbu;
    
    public Pokus(boolean hracZmeniVolbu) {
        this.sutaz = new Sutaz();
        this.hracZmeniVolbu = hracZmeniVolbu;
    }
    
    public boolean jeVyhra() {
        return this.sutaz.jeVyhra();
    }
    
    public void vykonajPokus() {
        Random nahodneCisla = new Random();
        
        int vybraneDvere = nahodneCisla.nextInt(3);
        this.sutaz.vyberDvere(vybraneDvere);
        
        int otvaraneDvere;
        do {
            otvaraneDvere = nahodneCisla.nextInt(3);
        } while (!this.sutaz.mozeOtvoritDvere(otvaraneDvere));
        
        this.sutaz.otvorDvere(otvaraneDvere);
        
        if (this.hracZmeniVolbu) {
            for (int i = 0; i < 3; i++) {
                if (this.sutaz.mozeVybratDvere(i)) {
                    this.sutaz.vyberDvere(i);
                    return;
                }
            }
        }
    }
}
