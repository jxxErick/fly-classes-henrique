import java.util.Date;

public class Bilhete {
    private String numeroBilhete;
    private Date dataEmissao;
    private Reserva reserva;

    public Bilhete(String numeroBilhete, Date dataEmissao, Reserva reserva) {
        this.numeroBilhete = numeroBilhete;
        this.dataEmissao = dataEmissao;
        this.reserva = reserva;
    }

    public void emitirBilhete() {
        if (reserva.getStatus().equals("confirmada")) {
            System.out.println("Bilhete emitido com sucesso! Número: " + numeroBilhete);
        } else {
            System.out.println("A reserva não está confirmada.");
        }
    }

    public void cancelarBilhete() {
        System.out.println("Bilhete cancelado.");
    }

}