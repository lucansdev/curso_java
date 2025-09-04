package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana","Bia","Bru","Gui");

        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\nMethod Reference #02");
        aprovados.forEach(Foreach::meuImprimir);


    }

    static void meuImprimir(String nome){
        System.out.println("oi! Meu nome é "+ nome);
    }
}
