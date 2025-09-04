package streams;

public class Produto {
    final double preco;
    final double desconto;
    final String nome;
    final boolean freteGratis;

    public Produto(String nome,double preco,double desconto,boolean freteGratis){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }
}
