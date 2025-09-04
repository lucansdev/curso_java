package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto,Double> precoReal = valor -> (valor.preco * (1 - valor.desconto));
        UnaryOperator<Double> pagarImposto = valor -> valor>= 2500 ? (valor * (1.0 + 8.5)):valor;
        UnaryOperator<Double> frete = valor -> valor >= 3000? 100.0:50.0;
        Function<Double,String> formatarPreco = valor-> String.format("%.2f",valor);
        UnaryOperator<String> valorFinalFormatado = valor -> "R$" + valor;

        Produto p1 = new Produto("note",1000,0.15);

        String resultadoFinal = precoReal.andThen(pagarImposto).andThen(formatarPreco).andThen(valorFinalFormatado).apply(p1);

        double valorFrete = precoReal.andThen(pagarImposto).andThen(frete).apply(p1);

        System.out.println("valor a ser pago: "+ resultadoFinal + ". Valor do Frete: "+ valorFrete);



    }
}
