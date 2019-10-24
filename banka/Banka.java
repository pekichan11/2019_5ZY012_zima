public class Banka {
    private String nazov;
    private String kodBanky;
    
    public Banka(String nazov, String kodBanky) {
        this.nazov = nazov;
        this.kodBanky = kodBanky;
    }
    
    public String getNazov() {
        return this.nazov;
    }
    
    public Ucet zalozUcet(Klient vlastnik) {
        String iban = String.format(
            "%s%02d%s000000%010d",
            this.kodBanky.substring(0, 2),
            0,
            this.kodBanky.substring(2),
            123
        );
        return new Ucet(this, vlastnik, iban);
    }
}
