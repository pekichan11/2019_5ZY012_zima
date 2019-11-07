public class Ucet {
    private Banka banka;
    private long stavVCentoch;
    private Klient vlastnik;
    private String iban;
    
    public Ucet(Banka banka, Klient vlastnik, String iban) {
        this.stavVCentoch = 0;
        this.banka = banka;
        this.vlastnik = vlastnik;
        this.iban = iban;
    }
    
    public String getIban() {
        return this.iban;
    }
    
    public Klient getVlastnik() {
        return this.vlastnik;
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
    
    public void prevedPeniaze(String cielIban, double suma) {
        Ucet ucet = this.banka.getUcet(cielIban);
        
        if (ucet == null) {
            System.out.println("Asi si zadal nespravny IBAN");
            return;
        }
        
        if (this.stavVCentoch < suma * 100) {
            System.out.println("Nemozes telo vybrat! Mas malo na ucte");
            return;
        }
        
        if (ucet == this) {
            System.out.println("Nemozes previest na vlastny ucet");
            return;
        }
        
        if (suma <= 0) {
            System.out.println("Previest ide iba kladnu ciastku");
            return;
        }
        
        this.stavVCentoch -= suma * 100;
        ucet.vlozPeniaze(suma);
    }
    
    public double getStav() {
        return this.stavVCentoch / 100.;
    }
}
