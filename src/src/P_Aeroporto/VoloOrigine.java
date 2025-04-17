package P_Aeroporto;

public class VoloOrigine extends Volo {
    private Gate imbarco;

    public VoloOrigine(Gate imbarco, Volo v) {
        super();
        v.setA_Volo_Origine("NAPOLI");
        this.imbarco = imbarco;
    }
    public void setImbarco(Gate imbarco) {
        this.imbarco = imbarco;
    }
    public Gate getImbarco() {
        return imbarco;
    }




}
