package excecao;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;

        try{
            imprimirNomeDoAluno(a1);

        }catch (Exception excecao){
            System.out.println("ocorreu um erro no momento" +
                    "de imprimir o nome do usuario");
        }

        try{
            System.out.println(7/0);
        }catch (ArithmeticException e){
            System.out.println("ocorreu o erro:" + e.getMessage());
        }


    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
