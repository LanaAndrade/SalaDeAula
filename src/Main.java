import Classes.Aluno;

import static Enums.Matricula.MATRICULADO;
import static Enums.Matricula.FORMADO;
import static Enums.Matricula.DESISTENTE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setId(2);
        aluno.setDataNascimento("02-02-2002");
        aluno.setNome("Ana");
        aluno.setCpf("200.002.200-02");
        aluno.setMatricula(MATRICULADO);

        aluno.listarInfo();
    }
}