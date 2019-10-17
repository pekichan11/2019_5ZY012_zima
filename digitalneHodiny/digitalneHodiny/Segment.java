public class Segment {
    private Obdlznik zobrazenie;
    
    public Segment(int x, int y, int dlzka, boolean jeNalezato) {
        this.zobrazenie = new Obdlznik();
        this.zobrazenie.posunZvisle(y - 50);
        this.zobrazenie.posunVodorovne(x - 60);
        if (jeNalezato) {
            this.zobrazenie.zmenStrany(dlzka, 5);
        } else {
            this.zobrazenie.zmenStrany(5, dlzka);
        }
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
