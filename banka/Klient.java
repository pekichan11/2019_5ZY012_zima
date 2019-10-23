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
    
    public void vlozPeniaze(long sumaVCentoch) {
        if (this.banka == null) {
            System.out.println("Najskor si zaloz ucet");
            return;
        }
        
        if (sumaVCentoch <= 0) {
            System.out.println("Vkladat ide iba kladnu ciastku");
            return;
        }
        
        this.stavVCentoch += sumaVCentoch;
    }
    
    public void vyberPeniaze(long sumaVCentoch) {
        if (this.banka == null) {
            System.out.println("Najskor si zaloz ucet");
            return;
        }
        
        if (sumaVCentoch <= 0) {
            System.out.println("Vyberat ide iba kladnu ciastku");
            return;
        }
        
        if (this.stavVCentoch < sumaVCentoch) {
            System.out.println("Nemozes telo vybrat! Mas malo na ucte");
            return;
        }
        
        this.stavVCentoch -= sumaVCentoch;
    }
}
