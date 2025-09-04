package oo.heranca.Desafio;

public class Jogador {
    protected int x;
    protected int y;

    protected Jogador(){
    }

    public Boolean andar(Direcao direcao) {
        if (direcao == Direcao.NORTE) {
            y++;
            return true;
        }
        return false;
    }

    public boolean atacar(Jogador openente){

        return true;
    }
}
