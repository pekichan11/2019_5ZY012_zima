
public class Klient {
    private Banka banka;
    private String meno;
    private long stavVCentoch;
    
    public Klient(String meno) {
        this.stavVCentoch = 0;
        this.meno = meno;
        this.banka = null;
    }
    
    public void zalozUcet(Banka banka) {
        this.banka = banka;
    }
    
    public String getNazovBanky() {
        if (this.banka != null) {
            return this.banka.getNazov();
        } else {
            return null;
        }
    }
    
    public void vlozPeniaze(double suma) {
        if (this.banka == null) {
            System.out.println("Najskor si zaloz ucet");
            return;
        }
        
        if (suma <= 0) {
            System.out.println("Vkladat ide iba kladnu ciastku");
            return;
        }
        
        this.stavVCentoch += suma * 100;
    }
    
    public void vyberPeniaze(double suma) {
        if (this.banka == null) {
            System.out.println("Najskor si zaloz ucet");
            return;
        }
        
        if (suma <= 0) {
            System.out.println("Vyberat ide iba kladnu ciastku");
            return;
        }
        
        if (this.stavVCentoch < suma * 100) {
            System.out.println("Nemozes telo vybrat! Mas malo na ucte");
            return;
        }
        
        this.stavVCentoch -= suma * 100;
    }
    
    public double getStav() {
        return this.stavVCentoch / 100.;
    }
}
