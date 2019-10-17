public class Cislica {
    private Segment segmentA;
    private Segment segmentG;
    private Segment segmentD;
    private Segment segmentF;
    private Segment segmentE;
    private Segment segmentB;
    private Segment segmentC;
    
    public Cislica(int x, int y, int dlzkaSegmentu) {
        this.segmentA = new Segment(x + 5, y, dlzkaSegmentu, true);
        this.segmentG = new Segment(x + 5, y + dlzkaSegmentu + 5, dlzkaSegmentu, true);
        this.segmentD = new Segment(x + 5, y + 2 * dlzkaSegmentu + 10, dlzkaSegmentu, true);
        this.segmentF = new Segment(x, y + 5, dlzkaSegmentu, false);
        this.segmentE = new Segment(x, y + dlzkaSegmentu + 10, dlzkaSegmentu, false);
        this.segmentB = new Segment(x + dlzkaSegmentu + 5, y + 5, dlzkaSegmentu, false);
        this.segmentC = new Segment(x + dlzkaSegmentu + 5, y + dlzkaSegmentu + 10, dlzkaSegmentu, false);
    }
    
    public void zobraz(int cislica) {
        
    }
}
