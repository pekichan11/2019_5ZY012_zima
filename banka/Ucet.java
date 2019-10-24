public class Ucet {
    private Banka banka;
    private long stavVCentoch;
    
    public Ucet(Banka banka) {
        this.stavVCentoch = 0;
        this.banka = banka;
    }
    
    public String getNazovBanky() {
        return this.banka.getNazov();
    }
    
    public void vlozPeniaze(double suma) {
        if (suma <= 0) {
            System.out.println("Vkladat ide iba kladnu ciastku");
            return;
        }
        
        this.stavVCentoch += suma * 100;
    }
    
    public void vyberPeniaze(double suma) {
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
