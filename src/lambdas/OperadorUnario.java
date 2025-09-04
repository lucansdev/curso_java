package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n+ 2;
        UnaryOperator<Integer> vezesDois = n -> n*2;

        int resultado = maisDois.andThen(vezesDois).apply(0);

        System.out.println(resultado);

    }
}
