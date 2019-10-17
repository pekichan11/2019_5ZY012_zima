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
        switch (cislica) {
            case 0:
                this.segmentA.setSvieti(true);
                this.segmentB.setSvieti(true);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(true);
                this.segmentE.setSvieti(true);
                this.segmentF.setSvieti(true);
                this.segmentG.setSvieti(false);
                break;
            case 1:
                this.segmentA.setSvieti(false);
                this.segmentB.setSvieti(true);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(false);
                this.segmentE.setSvieti(false);
                this.segmentF.setSvieti(false);
                this.segmentG.setSvieti(false);
                break;
            case 2:
                this.segmentA.setSvieti(true);
                this.segmentB.setSvieti(true);
                this.segmentC.setSvieti(false);
                this.segmentD.setSvieti(true);
                this.segmentE.setSvieti(true);
                this.segmentF.setSvieti(false);
                this.segmentG.setSvieti(true);
                break;
            case 3:
                this.segmentA.setSvieti(true);
                this.segmentB.setSvieti(true);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(true);
                this.segmentE.setSvieti(false);
                this.segmentF.setSvieti(false);
                this.segmentG.setSvieti(true);
                break;
            case 4:
                this.segmentA.setSvieti(false);
                this.segmentB.setSvieti(true);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(false);
                this.segmentE.setSvieti(false);
                this.segmentF.setSvieti(true);
                this.segmentG.setSvieti(true);
                break;
            case 5:
                this.segmentA.setSvieti(true);
                this.segmentB.setSvieti(false);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(true);
                this.segmentE.setSvieti(false);
                this.segmentF.setSvieti(true);
                this.segmentG.setSvieti(true);
                break;
            case 6:
                this.segmentA.setSvieti(true);
                this.segmentB.setSvieti(false);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(true);
                this.segmentE.setSvieti(true);
                this.segmentF.setSvieti(true);
                this.segmentG.setSvieti(true);
                break;
            case 7:
                this.segmentA.setSvieti(true);
                this.segmentB.setSvieti(true);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(false);
                this.segmentE.setSvieti(false);
                this.segmentF.setSvieti(false);
                this.segmentG.setSvieti(false);
                break;
            case 8:
                this.segmentA.setSvieti(true);
                this.segmentB.setSvieti(true);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(true);
                this.segmentE.setSvieti(true);
                this.segmentF.setSvieti(true);
                this.segmentG.setSvieti(true);
                break;
            case 9:
                this.segmentA.setSvieti(true);
                this.segmentB.setSvieti(true);
                this.segmentC.setSvieti(true);
                this.segmentD.setSvieti(true);
                this.segmentE.setSvieti(false);
                this.segmentF.setSvieti(true);
                this.segmentG.setSvieti(true);
                break;
        }
    }
}
