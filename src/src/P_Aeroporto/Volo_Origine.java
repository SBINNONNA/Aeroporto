package P_Aeroporto;

public class Volo_Origine extends Volo {
    private Gate imbarco;

    public Volo_Origine(Gate imbarco) {
        super();
        this.imbarco = imbarco;
    }
    public void setImbarco(Gate imbarco) {
        this.imbarco = imbarco;
    }
    public Gate getImbarco() {
        return imbarco;
    }


    public Volo_Origine(Volo v) {
        super();

        v.setA_Volo_Origine("NAPOLI");
    }

}
