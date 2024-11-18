import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private String documentoIdentidade;
    private String telefone;
    private List<Reserva> reservas;

    public Passageiro(String nome, String documentoIdentidade, String telefone) {
        this.nome = nome;
        this.documentoIdentidade = documentoIdentidade;
        this.telefone = telefone;
        this.reservas = new ArrayList<>();
    }

    public void cadastrarPassageiro() {
        System.out.println("Passageiro cadastrado com sucesso!");
    }

    public void atualizarInformacoes(String novoNome, String novoTelefone) {
        this.nome = novoNome;
        this.telefone = novoTelefone;
        System.out.println("Informações do passageiro atualizadas com sucesso!");
    }

    public void removerPassageiro() {
        System.out.println("Passageiro removido.");
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public String getNome() {
        return nome;
    }

    public String getDocumentoIdentidade() {
        return documentoIdentidade;
    }
}