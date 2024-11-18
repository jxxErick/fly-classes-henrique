import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voo {
    private Date data;
    private String horaPartida;
    private String horaChegada;
    private String origem;
    private String destino;
    private int numeroAssentosDisponiveis;
    private List<Reserva> reservas;

    public Voo(Date data, String horaPartida, String horaChegada, String origem, String destino, int numeroAssentosDisponiveis) {
        this.data = data;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.origem = origem;
        this.destino = destino;
        this.numeroAssentosDisponiveis = numeroAssentosDisponiveis;
        this.reservas = new ArrayList<>();
    }

    public void cadastrarVoo() {
        System.out.println("Voo cadastrado com sucesso!");
    }

    public void atualizarVoo(String novaHoraPartida, String novaHoraChegada, int novosAssentos) {
        this.horaPartida = novaHoraPartida;
        this.horaChegada = novaHoraChegada;
        this.numeroAssentosDisponiveis = novosAssentos;
        System.out.println("Voo atualizado com sucesso!");
    }

    public void cancelarVoo() {
        System.out.println("Voo cancelado.");
    }

    public boolean verificarDisponibilidade() {
        return numeroAssentosDisponiveis > 0;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        numeroAssentosDisponiveis--;
    }

    public int getNumeroAssentosDisponiveis() {
        return numeroAssentosDisponiveis;
    }

    public Date getData() {
        return data;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}