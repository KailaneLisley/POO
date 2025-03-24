import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GerenciaFidelidade {
		//Atributo
    private List<Cliente> clientes;
		// Construtor da classe
    public GerenciaFidelidade() {
        this.clientes = new ArrayList<>();
    }
		// Método para cadastrar um novo cliente
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
		// Método para resgatar uma recompensa para um cliente
    public void resgatarRecompensa(Cliente cliente, Recompensa recompensa) {
        if (cliente.temPontosSuficientes(recompensa.getCustoEmPontos())) {
            cliente.gastarPontos(recompensa.getCustoEmPontos());
            cliente.adicionarRecompensa(recompensa.getDescricao());
        } else {
            System.out.println(cliente.getNome() + " não tem pontos suficientes.");
        }
    }
		// Exibe os clientes ordenados por pontuação (ranking)
    public void exibirClientes() {
        clientes.sort(Comparator.comparingInt(Cliente::getPontos).reversed());
        for (Cliente c : clientes) {
            System.out.println(c.getNome() + " | Pontos: " + c.getPontos());
        }
    }
}