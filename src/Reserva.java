import java.util.Date;

public class Reserva {
    private Date dataReserva;
    private String status;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(Date dataReserva, Passageiro passageiro, Voo voo) {
        this.dataReserva = dataReserva;
        this.passageiro = passageiro;
        this.voo = voo;
        this.status = "pendente";
    }

    public void reservarVoo() {
        if (voo.verificarDisponibilidade()) {
            voo.adicionarReserva(this);
            status = "confirmada";
            passageiro.adicionarReserva(this);
            System.out.println("Reserva confirmada com sucesso!");
        } else {
            System.out.println("Não há assentos disponíveis.");
        }
    }

    public void cancelarReserva() {
        if (status.equals("confirmada")) {
            status = "cancelada";
            voo.adicionarReserva(this);
            System.out.println("Reserva cancelada com sucesso!");
        } else {
            System.out.println("A reserva não pode ser cancelada.");
        }
    }

    public String getStatus() {
        return status;
    }

}