class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, int anoPublic, int numCopias, String autor) {
        super(titulo, anoPublic, numCopias);
        this.autor = autor;
    }
    
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 2.0;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}