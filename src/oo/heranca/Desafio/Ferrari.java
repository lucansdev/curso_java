package oo.heranca.Desafio;

public class Ferrari extends Carro {

    public Ferrari(int velocidade_maxima){
        super(velocidade_maxima);
    }

    public void acelerar(){
        super.velocidadeAtual += 15;

    }

}
