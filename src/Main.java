import java.util.Date;

public class Main {
    public static void main(String[] args){

        // Criando um voo
        Voo voo1 = new Voo(new Date(), "10:00", "12:00", "São Paulo", "Rio de Janeiro", 5);
        voo1.cadastrarVoo();

        // Criando um passageiro
        Passageiro passageiro1 = new Passageiro("João Silva", "123456789", "987654321");
        passageiro1.cadastrarPassageiro();

        // Criando uma reserva
        Reserva reserva1 = new Reserva(new Date(), passageiro1, voo1);
        reserva1.reservarVoo();

        // Emitindo um bilhete
        Bilhete bilhete1 = new Bilhete("BIL123", new Date(), reserva1);
        bilhete1.emitirBilhete();

        // Cancelando a reserva
        reserva1.cancelarReserva();

    }
}