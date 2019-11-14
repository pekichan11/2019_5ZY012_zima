public class Experiment {
    private int pocetPokusov;
    private int pocetVyhernych;
    private boolean hracZmeniVolbu;
    
    public Experiment(int pocetPokusov, boolean hracZmeniVolbu) {
        this.pocetPokusov = pocetPokusov;
        this.hracZmeniVolbu = hracZmeniVolbu;
        this.pocetVyhernych = 0;
    }
    
    public void vykonaj() {
        for (int i = 0; i < this.pocetPokusov; i++) {
            Pokus pokus = new Pokus(this.hracZmeniVolbu);
            pokus.vykonajPokus();
            if (pokus.jeVyhra()) {
                this.pocetVyhernych++;
            }
        }
    }
}
