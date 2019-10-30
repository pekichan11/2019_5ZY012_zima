
/**
 * Write a description of class Pad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pad {
    private Obdlznik pad;
    private int poziciaY;
    private Hra hra;
    
    public Pad(boolean pravy, Hra hra) {
        this.hra = hra;
        
        this.poziciaY = this.hra.getVyskaPola() / 2;
        
        this.pad = new Obdlznik();
        this.pad.zmenStrany(5, 30);
        if (pravy) {
            this.pad.posunVodorovne(this.hra.getSirkaPola() - 65);
        } else {
            this.pad.posunVodorovne(-60);
        }
        this.pad.posunZvisle(this.poziciaY - 65);
        this.pad.zobraz();
    }
    
    public void posunHore() {
        if (this.poziciaY <= 15) {
            return;
        }
        
        this.pad.posunZvisle(-5);
        this.poziciaY -= 5;
    }
    
    public void posunDole() {
        if (this.poziciaY >= this.hra.getVyskaPola() - 15) {
            return;
        }
        
        this.pad.posunZvisle(5);
        this.poziciaY += 5;
    }
}
