import java.util.Random;

public class Sutaz {
    private Dvere[] dvere;
    
    public Sutaz() {
        this.dvere = new Dvere[3];
        
        Random nahodneCisla = new Random();
        
        int vyherneDvere = nahodneCisla.nextInt(this.dvere.length);
        
        for (int i = 0; i < this.dvere.length; i++) {
            this.dvere[i] = new Dvere(i == vyherneDvere);
        }
    }
    
    public boolean mozeVybratDvere(int cislo) {
        return this.dvere[cislo].mozeVybrat();
    }
    
    public void vyberDvere(int cislo) {
        for (Dvere dvere : this.dvere) {
            dvere.zrusVyberAkTreba();
        }
        
        this.dvere[cislo].vyber();
    }
    
    public boolean mozeOtvoritDvere(int cislo) {
        return this.dvere[cislo].mozeOtvorit();
    }
    
    public void otvorDvere(int cislo) {
        this.dvere[cislo].otvor();
    }
    
    public boolean jeVyhra() {
        for (Dvere dvere : this.dvere) {
            if (dvere.jeVyhra()) {
                return true;
            }
        }
        
        return false;
    }
}
