package VäxtHotell;

abstract class Växt implements BeräknaVätska {
    String namn;
    double längd;

    String vätskaTyp;

    //double vätskaVolym;

    public Växt(String namn, double längd){
        this.namn = namn;
        this.längd = längd;
    }

    public String getNamn() {
        return namn;
    }

    public String getVätska() { return vätskaTyp; }

    /*
    public double getVätskaVolym() {
        return vätskaVolym;
    }
*/
}
