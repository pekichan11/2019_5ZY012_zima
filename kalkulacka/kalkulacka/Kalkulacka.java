public class Kalkulacka {
    private double medzicislo;
    private double pamat;

    public Kalkulacka(double prveCislo) {
        this.medzicislo = prveCislo;
        this.pamat = 0;
    }

    public void scitaj(double operand) {
        this.medzicislo += operand;
    }

    public void odcitaj(double operand) {
        this.medzicislo -= operand;
    }

    public void vynasob(double operand) {
        this.medzicislo *= operand;
    }

    public void vydel(double operand) {
        this.medzicislo /= operand;
    }

    public double vypluj() {
        return this.medzicislo;
    }

    public void mc() {
        this.pamat = 0;
    }

    public void mr() {
        this.medzicislo = this.pamat;
    }

    public void mPlus() {
        this.pamat += this.medzicislo;
    }

    public void ms() {
        this.pamat = this.medzicislo;
    }
}
