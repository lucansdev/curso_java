package oo.heranca.Desafio.Teste;

import oo.heranca.Desafio.Carro;
import oo.heranca.Desafio.Civic;
import oo.heranca.Desafio.Ferrari;

public class CarrosTeste {
    public static void main(String[] args) {

        Carro civic = new Civic(200);
        Ferrari SF90 = new Ferrari(300);

        civic.acelerar();
        SF90.acelerar();
        civic.acelerar();
        SF90.acelerar();
        civic.freiar();
        SF90.freiar();

        System.out.println("velocidade civic : " + civic.mostrarVelocidade());
        System.out.println("velocidade SF90 : " + SF90.mostrarVelocidade());

    }
}
