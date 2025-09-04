package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("notebook",1000,0.3,true);
        Produto p2 = new Produto("ipad",5000,0.5,true);
        Produto p3 = new Produto("livro",100,0.2,true);
        Produto p4 = new Produto("pc",2000,0.1,false);

        List<Produto> listaProdutos = Arrays.asList(p1,p2,p3,p4);

        listaProdutos.stream()
                .filter(d -> d.desconto >=0.3)
                .filter(f -> f.freteGratis)
                .map(p -> "produto com superdesconto: " + p.nome)
                .forEach(System.out::println);


    }
}
