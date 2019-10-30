
/**
 * Write a description of class Pad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pad {
    private Obdlznik pad;
    private int poziciaY;
    
    public Pad(boolean pravy) {
        this.pad = new Obdlznik();
        this.pad.zmenStrany(5, 30);
        if (pravy) {
            this.pad.posunVodorovne(235);
        } else {
            this.pad.posunVodorovne(-60);
        }
        this.pad.posunZvisle(85);
        this.pad.zobraz();
        
        this.poziciaY = 150;
    }
    
    public void posunHore() {
        if (this.poziciaY <= 15) {
            return;
        }
        
        this.pad.posunZvisle(-5);
        this.poziciaY -= 5;
    }
    
    public void posunDole() {
        if (this.poziciaY >= 285) {
            return;
        }
        
        this.pad.posunZvisle(5);
        this.poziciaY += 5;
    }
}
