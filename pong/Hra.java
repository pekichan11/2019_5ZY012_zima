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
        
        switch (this.lopticka.getPozicia()) {
            case "vlavo":
                if (!this.lopticka.koliduje(this.lavy)) {
                    System.out.println("Lavy prehral");
                    this.lopticka.znic();
                    this.lopticka = new Lopticka(this);
                }
                break;
            case "vpravo":
                if (!this.lopticka.koliduje(this.pravy)) {
                    System.out.println("Pravy prehral");
                    this.lopticka.znic();
                    this.lopticka = new Lopticka(this);
                }
                break;
        }
    }
    
    public int getSirkaPola() {
        return this.sirkaPola;
    }
    
    public int getVyskaPola() {
        return this.vyskaPola;
    }
}
