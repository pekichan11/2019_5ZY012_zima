public class Kalkulacka {
    private double medzicislo;
    private double pamat;
    private boolean mrcStlacene;
    private double operand;

    public Kalkulacka(double prveCislo) {
        this.medzicislo = prveCislo;
        this.pamat = 0;
        this.mrcStlacene = false;
        this.operand = 0;
    }
    
    public void setOperand(double operand) {
        this.operand = operand;
    }

    public void scitaj() {
        this.medzicislo += this.operand;
        this.mrcStlacene = false;
    }

    public void odcitaj() {
        this.medzicislo -= this.operand;
        this.mrcStlacene = false;
    }

    public void vynasob() {
        this.medzicislo *= this.operand;
        this.mrcStlacene = false;
    }

    public void vydel() {
        this.medzicislo /= this.operand;
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
        this.operand = this.pamat;
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
            this.operand = this.pamat;
            this.mrcStlacene = true;
        }
    }
}
