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
}
