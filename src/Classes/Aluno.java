package Classes;

import java.util.Date;

public class Aluno {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private String dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String nome;
    private String cpf;

    public void setMatricula(Enum matricula) {
        Matricula = matricula;
    }

    private Enum Matricula;

    public Enum getMatricula() {
        return Matricula;
    }

    public void listarInfo(){
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Matricula: " + Matricula);
    }
}
