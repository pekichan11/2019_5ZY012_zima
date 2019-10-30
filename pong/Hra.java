public class Hra {
    private Pad lavy;
    private Pad pravy;
    
    public Hra() {
        this.lavy = new Pad(false);
        this.pravy = new Pad(true);
    }
    
    public void posunDole() {
        this.lavy.posunDole();
    }
    
    public void posunHore() {
        this.lavy.posunHore();
    }
    
    public void posunVlavo() {
        this.pravy.posunHore();
    }
    
    public void posunVpravo() {
        this.pravy.posunDole();
    }
}
