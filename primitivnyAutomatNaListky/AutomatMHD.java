
/**
 * Trieda modeluje primitivny automat na predaj
 * cestovnych listkov MHD.
 * Model predpoklada, ze kupujuci vlozi presnu
 * ciastku podla ceny listka.
 * Cena listka je urcena parametrom konstruktora.
 */
public class AutomatMHD {
    private int cenaListka;
    // suma vlozenych minci pred tlacou listka
    private int vlozenaCiastka;
    // celkova suma penazi za vsetky listky
    private int trzba;

    /**
     * Konstruktor vytvori automat, ktory bude
     * tlacit cestovne listky pevnej ceny.
     * Cena je urcena parametrom cenaListka.
     * Pozor - cena listka musi byt kladne cele
     * cislo a tato podmienka sa nekontroluje.
     */
    public AutomatMHD(int cenaListka) {
        this.cenaListka = cenaListka;
        this.vlozenaCiastka = 0;
        this.trzba = 0;
    }

    /**
     * Vrati hodnotu ceny listka
     */
    public int getCenaListka() {
        return this.cenaListka;
    }
    
    public void zmenCenuListka(int novaCena) {
        this.cenaListka = novaCena;
    }
    
    /**
     * Vrati doteraz vlozenu ciastku
     */
    public int getVlozenaCiastka() {
        return this.vlozenaCiastka;
    }
    
    public int getTrzba() {
        return this.trzba;
    }
    
    /**
     * Prijme mincu danej hodnoty od kupujuceho
     */
    public void vlozMincu(int hodnotaMince) {
        this.vlozenaCiastka += hodnotaMince;
    }
    
    /**
     * Vytlaci cestovny listok,
     * pripocita vlozenu ciastku k trzbe a
     * vynuluje vlozenu ciastku
     */
    public void tlacListok() {
        // tlac listka do okna konzoly
        System.out.println("*************************");
        System.out.println("* Skolska linka FRI");
        System.out.println("* Cestovny listok");
        System.out.print("* cena ");
        System.out.print(this.cenaListka);
        System.out.println(" centov");
        System.out.println("*************************");
        System.out.println();
        
        // pripocitaj cenu listka k trzbe
        this.trzba += this.cenaListka;
        // zniz vlozenu ciastku
        this.vlozenaCiastka -= this.cenaListka;
    }
    
    public void vratZostatok() {
        System.out.println("Vraciam ti: ");
        
        System.out.format("%d x 2�%n", this.vlozenaCiastka / 200);
        this.vlozenaCiastka %= 200;
        
        System.out.format("%d x 1�%n", this.vlozenaCiastka / 100);
        this.vlozenaCiastka %= 100;
        
        System.out.format("%d x 50c%n", this.vlozenaCiastka / 50);
        this.vlozenaCiastka %= 50;
        
        System.out.format("%d x 20c%n", this.vlozenaCiastka / 20);
        this.vlozenaCiastka %= 20;
        
        System.out.format("%d x 10c%n", this.vlozenaCiastka / 10);
        this.vlozenaCiastka %= 10;
        
        System.out.format("%d x 5c%n", this.vlozenaCiastka / 5);
        this.vlozenaCiastka %= 5;
        
        System.out.format("%d x 2c%n", this.vlozenaCiastka / 2);
        this.vlozenaCiastka %= 2;
        
        System.out.format("%d x 1c%n", this.vlozenaCiastka);
        
        this.vlozenaCiastka = 0;
    }
}
