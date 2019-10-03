public class Kalkulacka {
    private double medzicislo;
    
    public Kalkulacka(double prveCislo) {
        this.medzicislo = prveCislo;
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
}
