import P_Aeroporto.Volo;
import P_Aeroporto.VoloDestinazione;
import P_Aeroporto.Volo_Origine;

public class Main {
    public static void main(String[] args) {
    Volo v = new Volo();
    VoloDestinazione v1 = new VoloDestinazione(v);
    System.out.println(v.getA_Volo_Destinazione());
    }
}