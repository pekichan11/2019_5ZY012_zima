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
        if (sumaVCentoch > 0) {
            this.stavVCentoch += sumaVCentoch;
        } else {
            System.out.println("Vkladat ide iba kladnu ciastku");
        }
    }
    
    public void vyberPeniaze(long sumaVCentoch) {
        if (sumaVCentoch > 0) {
            if (this.stavVCentoch >= sumaVCentoch) {
                this.stavVCentoch -= sumaVCentoch;
            } else {
                System.out.println("Nemozes telo vybrat! Mas malo na ucte");
            }
        } else {
            System.out.println("Vyberat ide iba kladnu ciastku");
        }
    }
}
