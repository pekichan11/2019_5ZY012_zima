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
}
