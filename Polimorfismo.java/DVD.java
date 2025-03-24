class DVD extends ItemBiblioteca {
    private int duracao;

    public DVD(String titulo, int anoPublic, int numCopias, int duracao) {
        super(titulo, anoPublic, numCopias);
        this.duracao = duracao;
    }
    
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 3.0;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Duração: " + duracao + " min";
    }
}