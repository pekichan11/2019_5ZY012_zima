public class Dvere {
    private boolean suVyherne;
    private boolean suOtvorene;
    private boolean suVybrane;
    
    public Dvere(boolean suVyherne) {
        this.suVyherne = suVyherne;
        this.suOtvorene = false;
        this.suVybrane = false;
    }
    
    public void otvor() {
        if (this.suOtvorene) {
            System.out.println("Dvere uz su otvorene");
            return;
        }
        if (this.suVyherne) {
            System.out.println("Tieto nemozes isto otvorit");
            return;
        }
        if (this.suVybrane) {
            System.out.println("Tie si uz vybral hrac");
            return;
        }
        this.suOtvorene = true;
    }
    
    public void vyber() {
        if (this.suOtvorene) {
            System.out.println("Dvere uz su otvorene");
            return;
        }
        if (this.suVybrane) {
            System.out.println("Tie si si uz vybral");
            return;
        }
        this.suVybrane = true;
    }
    
    public void zrusVyber() {
        if (!this.suVybrane) {
            System.out.println("Dvere nie su vybrane");
            return;
        }
        this.suVybrane = false;
    }
    
    public boolean jeVyhra() {
        return this.suVybrane && this.suVyherne;
    }
}
