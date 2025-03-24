public class Recompensa {
    //Atributos
private String descricao;
private int custoEmPontos;
    
    // Construtor da classe 
public Recompensa(String descricao, int custoEmPontos) {
    this.descricao = descricao;
    this.custoEmPontos = custoEmPontos;
}
    //Retorna valor em pontos da recompensa
public int getCustoEmPontos() {
    return custoEmPontos;
}
    //Retorna descrição da recompensa
public String getDescricao() {
    return descricao;
}
}