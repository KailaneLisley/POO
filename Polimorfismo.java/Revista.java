class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublic, int numCopias, int edicao) {
        super(titulo, anoPublic, numCopias);
        this.edicao = edicao;
    }
    
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.5;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Edição: " + edicao;
    }
}