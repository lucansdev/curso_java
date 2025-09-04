package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir =
                valor -> System.out.println(valor.nome);

        Produto p1 = new Produto("celulite",1200.0,0.0);

        List<Produto> produtos = Arrays.asList(p1);

        produtos.forEach(imprimir);
    }
}
