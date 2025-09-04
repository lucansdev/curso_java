package oo.heranca.Desafio;

public class Carro {
    final private int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;

    Carro(int velocidade_maxima){
        VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    public void acelerar(){
        if (velocidadeAtual + 5 == VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 5;
        }
    }

    public void freiar(){
        if (velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
    }

    public int mostrarVelocidade(){
        return velocidadeAtual;
    }

    public int mostrarVelocidadeFinal(){
        return VELOCIDADE_MAXIMA;
    }
}
