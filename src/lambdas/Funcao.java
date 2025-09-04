package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer,String> parOuImpar =
                numero -> numero % 2 ==0 ? "par":"impar";

        Function<String,String> oResultadoE =
                valor -> "o resultado e: "+ valor;

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE).apply(32);

        System.out.println(resultadoFinal);

    }
}
