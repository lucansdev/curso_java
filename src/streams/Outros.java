package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("lucas",10);
        Aluno a2 = new Aluno("bruna",10);
        Aluno a3 = new Aluno("joao",5);
        Aluno a4 = new Aluno("doidin",2);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
    }
}
