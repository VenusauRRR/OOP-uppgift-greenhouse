package VäxtHotell;

//Arv och Interface
public class Palm extends Växt {
    //Inkapsulning och anrop Enum konstanter
    protected final VätskaTyp vät_typ = VätskaTyp.KRANVATTEN;

    public Palm(String namn, double längd){
        super(namn,längd);
        super.vätskaTyp = vät_typ.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        return vät_typ.volym*this.längd;
    }

}
