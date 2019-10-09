public class Kalkulacka {
    private double medzicislo;
    private double pamat;
    private boolean mrcStlacene;

    public Kalkulacka(double prveCislo) {
        this.medzicislo = prveCislo;
        this.pamat = 0;
        this.mrcStlacene = false;
    }

    public void scitaj(double operand) {
        this.medzicislo += operand;
        this.mrcStlacene = false;
    }

    public void odcitaj(double operand) {
        this.medzicislo -= operand;
        this.mrcStlacene = false;
    }

    public void vynasob(double operand) {
        this.medzicislo *= operand;
        this.mrcStlacene = false;
    }

    public void vydel(double operand) {
        this.medzicislo /= operand;
        this.mrcStlacene = false;
    }

    public double getVysledok() {
        return this.medzicislo;
    }

    public void mc() {
        this.pamat = 0;
        this.mrcStlacene = false;
    }

    public void mr() {
        this.medzicislo = this.pamat;
        this.mrcStlacene = false;
    }

    public void mPlus() {
        this.pamat += this.medzicislo;
        this.mrcStlacene = false;
    }

    public void ms() {
        this.pamat = this.medzicislo;
        this.mrcStlacene = false;
    }
    
    public void mrc() {
        if (this.mrcStlacene) {
            this.pamat = 0;
            this.mrcStlacene = false;
        } else {
            this.medzicislo = this.pamat;
            this.mrcStlacene = true;
        }
    }
}
