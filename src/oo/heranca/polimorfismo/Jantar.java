package oo.heranca.polimorfismo;

public class Jantar {
    public static void main(String[] args) {


        Feijao item1 = new Feijao(0.2);
        Arroz item2 = new Arroz(0.1);

        Pessoa p1 = new Pessoa(70.0);

        p1.comer(item1);
        p1.comer(item2);

        System.out.println(p1.getPeso());


    }
}
