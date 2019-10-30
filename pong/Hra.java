public class Hra {
    private Pad lavy;
    private Pad pravy;
    private int sirkaPola;
    private int vyskaPola;
    
    public Hra(int sirkaPola, int vyskaPola) {
        this.sirkaPola = sirkaPola;
        this.vyskaPola = vyskaPola;
        
        this.lavy = new Pad(false, this);
        this.pravy = new Pad(true, this);
    }
    
    public void posunDole() {
        this.lavy.posunDole();
    }
    
    public void posunHore() {
        this.lavy.posunHore();
    }
    
    public void posunVlavo() {
        this.pravy.posunHore();
    }
    
    public void posunVpravo() {
        this.pravy.posunDole();
    }
    
    public int getSirkaPola() {
        return this.sirkaPola;
    }
    
    public int getVyskaPola() {
        return this.vyskaPola;
    }
}
