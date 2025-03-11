public class Main {
    public static void main(String[] args) {
		    //Atributos
        GerenciaFidelidade sistema = new GerenciaFidelidade();
				
				// Criando clientes
        Cliente cliente1 = new Cliente("João", "joao@email.com");
        Cliente cliente2 = new Cliente("Maria", "maria@email.com");
        Cliente cliente3 = new Cliente("Carlos", "carlos@email.com");
		
        // Cadastrando clientes no sistema
        sistema.cadastrarCliente(cliente1);
        sistema.cadastrarCliente(cliente2);
        sistema.cadastrarCliente(cliente3);

        // Simulando compras
        cliente1.realizarCompra(50.0);
        cliente2.realizarCompra(30.0);
        cliente3.realizarCompra(100.0);

        // Criando recompensas disponíveis
        Recompensa recompensa1 = new Recompensa("Café Grátis", 500);
        Recompensa recompensa2 = new Recompensa("Desconto de R$10", 300);
        
        // Tentando resgatar recompensas
        sistema.resgatarRecompensa(cliente1, recompensa1);
        sistema.resgatarRecompensa(cliente2, recompensa2);
        sistema.resgatarRecompensa(cliente3, recompensa1);

        // Exibindo recompensas resgatadas
        cliente1.exibirRecompensas();
        cliente2.exibirRecompensas();
        cliente3.exibirRecompensas();

        // Exibindo ranking de clientes
        sistema.exibirClientes();
    }
}