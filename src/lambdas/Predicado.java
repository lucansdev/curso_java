package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> prod.preco >= 750;

        Produto produto = new Produto("livro",751.0,0.0);
        System.out.println(isCaro.test(produto));

    }
}
