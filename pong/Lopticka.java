public class Lopticka {
    private Kruh lopticka;
    private int poziciaX;
    private int poziciaY;
    
    public Lopticka(Hra hra) {
        this.poziciaX = hra.getSirkaPola() / 2;
        this.poziciaY = hra.getVyskaPola() / 2;
        
        this.lopticka = new Kruh();
        this.lopticka.zmenPriemer(10);
        this.lopticka.posunVodorovne(this.poziciaX - 25);
        this.lopticka.posunZvisle(this.poziciaY - 65);
        this.lopticka.zobraz();
    }
}
