public class Segment {
    private Obdlznik zobrazenie;
    
    public Segment(int x, int y, int sirka, int vyska) {
        this.zobrazenie = new Obdlznik();
        this.zobrazenie.posunZvisle(y - 50);
        this.zobrazenie.posunVodorovne(x - 60);
        this.zobrazenie.zmenStrany(sirka, vyska);
        this.zobrazenie.zmenFarbu("black");
        this.zobrazenie.zobraz();
    }
    
    public void setSvieti(boolean svieti) {
        if (svieti) {
            this.zobrazenie.zmenFarbu("yellow");
        } else {
            this.zobrazenie.zmenFarbu("black");
        }
    }
}
