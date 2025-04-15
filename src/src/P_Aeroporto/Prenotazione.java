package P_Aeroporto;

public class Prenotazione {
    private int numero;
    private String posto;
    private StatoPrenotazione stato;

 public Prenotazione(int numero, String posto, StatoPrenotazione stato) {
     this.numero = numero;
     this.posto = posto;
     this.stato = stato;
 }
 public void setNumero(int numero) {
     this.numero = numero;
 }
 public int getNumero() {
     return numero;
 }
 public void setPosto(String posto) {
     this.posto = posto;
 }
 public String getPosto() {
     return posto;
 }
 public void setStato(StatoPrenotazione stato) {
     this.stato = stato;
 }
 public StatoPrenotazione getStato() {
     return stato;
 }









    public void checkIn() {

    }


}
