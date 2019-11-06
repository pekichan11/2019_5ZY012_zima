public class Lopticka {
    private Hra hra;
    private Kruh lopticka;
    private int poziciaX;
    private int poziciaY;
    private int smerX;
    private int smerY;
    
    public Lopticka(Hra hra) {
        this.hra = hra;
        
        this.poziciaX = hra.getSirkaPola() / 2;
        this.poziciaY = hra.getVyskaPola() / 2;
        
        this.smerX = 5;
        this.smerY = 5;
        
        this.lopticka = new Kruh();
        this.lopticka.zmenPriemer(10);
        this.lopticka.posunVodorovne(this.poziciaX - 25);
        this.lopticka.posunZvisle(this.poziciaY - 65);
        this.lopticka.zobraz();
    }
    
    public void posun() {
        this.poziciaX += this.smerX;
        this.poziciaY += this.smerY;
        
        this.lopticka.posunVodorovne(this.smerX);
        this.lopticka.posunZvisle(this.smerY);
        
        if (this.poziciaX <= 5 || this.poziciaX >= this.hra.getSirkaPola() - 5) {
            this.smerX = -this.smerX;
        }
        
        if (this.poziciaY <= 5 || this.poziciaY >= this.hra.getVyskaPola() - 5) {
            this.smerY = -this.smerY;
        }
    }
    
    /**
     * vracia "vlavo" ak je na lavom okraji, "vpravo" na pravom okraji
     * a "stred" inokedy
     */
    public String getPozicia() {
        if (this.poziciaX <= 5) {
            return "vlavo";
        } else if (this.poziciaX >= this.hra.getSirkaPola() - 5) {
            return "vpravo";
        } else {
            return "stred";
        }
    }
    
    public boolean koliduje(Pad pad) {
        int y1 = pad.getY1();
        int y2 = pad.getY2();
        int x1 = pad.getX1();
        int x2 = pad.getX2();
        
        if (this.poziciaX >= x1 && this.poziciaX <= x2 && this.poziciaY >= y1 && this.poziciaY <= y2) {
            return true;
        } else {
            return false;
        }
    }
}
