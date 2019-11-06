public class Hra {
    private Pad lavy;
    private Pad pravy;
    private Lopticka lopticka;
    private int sirkaPola;
    private int vyskaPola;
    
    public Hra(int sirkaPola, int vyskaPola) {
        this.sirkaPola = sirkaPola;
        this.vyskaPola = vyskaPola;
        
        Obdlznik pozadie = new Obdlznik();
        pozadie.zmenFarbu("yellow");
        pozadie.zmenStrany(sirkaPola, vyskaPola);
        pozadie.posunVodorovne(-60);
        pozadie.posunZvisle(-50);
        pozadie.zobraz();
        
        this.lavy = new Pad(false, this);
        this.pravy = new Pad(true, this);
        this.lopticka = new Lopticka(this);
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
    
    public void tik() {
        this.lopticka.posun();
    }
    
    public int getSirkaPola() {
        return this.sirkaPola;
    }
    
    public int getVyskaPola() {
        return this.vyskaPola;
    }
}
