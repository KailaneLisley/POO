public class GerenciarBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("POO - Programação Orientada a Objetos", 2025, 2, "Lucas Rodolfo");
        DVD dvd = new DVD("O Paradigma da POO", 2025, 3, 120);
        Revista revista = new Revista("Ciência da Computação", 2023, 7, 45);

        System.out.println(livro);
        System.out.println("Multa do Livro: R$ " + livro.calcularMulta(3));

        System.out.println(dvd);
        System.out.println("Multa do DVD: R$ " + dvd.calcularMulta(5));

        System.out.println(revista);
        System.out.println("Multa da Revista: R$ " + revista.calcularMulta(2));
    }
}