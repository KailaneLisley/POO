import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //Atributos
    private String nome;
    private String email;
    private int pontos;
    private List<String> recompensasResgatadas;
		
		// Construtor da classe 
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pontos = 0;
        this.recompensasResgatadas = new ArrayList<>();
    }
    
    // Método para acumular pontos ao realizar uma compra
    public void realizarCompra(double valor) {
        this.pontos += (int) (valor * 10);
    }
		
		// Verifica se o cliente tem pontos suficientes para resgatar uma recompensa
    public boolean temPontosSuficientes(int custo) {
        return this.pontos >= custo;
    }
		
		//Reduz pontos do cliente ao resgatar uma recompensa
    public void gastarPontos(int custo) {
        if (temPontosSuficientes(custo)) {
            this.pontos -= custo;
        }
    }
		
		// Adiciona uma recompensa resgatada à lista do cliente
    public void adicionarRecompensa(String descricao) {
        recompensasResgatadas.add(descricao);
    }

		// Exibe as recompensas resgatadas pelo cliente
    public void exibirRecompensas() {
        System.out.println("Recompensas de " + nome + ": " + recompensasResgatadas);
    }
		
		//Retorna os pontos do cliente
    public int getPontos() {
        return pontos;
    }
		
		//Retorna os nome do cliente
    public String getNome() {
        return nome;
    }
}