import java.util.Random;
import java.math.BigInteger;
import java.util.ArrayList;

public class Banka {
    private String nazov;
    private String kodBanky;
    private ArrayList<Ucet> ucty;
    
    public Banka(String nazov, String kodBanky) {
        this.nazov = nazov;
        this.kodBanky = kodBanky;
        this.ucty = new ArrayList<Ucet>();
    }
    
    public String getNazov() {
        return this.nazov;
    }
    
    public Ucet getUcet(String iban) {
        for (Ucet ucet : this.ucty) {
            if (ucet.getIban().equals(iban)) {
                return ucet;
            }
        }
        
        return null;
    }
    
    public Ucet zalozUcet(Klient vlastnik) {
        Random nahodneCisla = new Random();
        
        long cisloUctu = Math.abs(nahodneCisla.nextLong()) % 10000000000L;
        
        String ibanPreVypocetKC = String.format(
            "%s000000%010d%02d%02d00",
            this.kodBanky.substring(2),
            cisloUctu,
            this.kodBanky.charAt(0) - 55,
            this.kodBanky.charAt(1) - 55
        );
        
        int kontrolneCislo = 98 - new BigInteger(ibanPreVypocetKC).mod(new BigInteger("97")).intValue();
        
        String iban = String.format(
            "%s%02d%s000000%010d",
            this.kodBanky.substring(0, 2),
            kontrolneCislo,
            this.kodBanky.substring(2),
            cisloUctu
        );
        
        Ucet novyUcet = new Ucet(this, vlastnik, iban);
        
        this.ucty.add(novyUcet);
        
        return novyUcet;
    }
}
