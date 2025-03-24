public abstract class ItemBiblioteca {
    protected String titulo;
    protected int anoPublic;
    protected int numCopias;

    public ItemBiblioteca(String titulo, int anoPublic, int numCopias) {
        this.titulo = titulo;
        this.anoPublic = anoPublic;
        this.numCopias = numCopias;
    }
    public abstract double calcularMulta(int diasAtraso);

    @Override
    public String toString() {
        return "Título: " + titulo + ", Ano: " + anoPublic + ", Cópias: " + numCopias;
    }
}