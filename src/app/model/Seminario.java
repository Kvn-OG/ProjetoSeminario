package app.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Seminario {
    private String titulo;
    private Professor professor;
    private Local local;
    private ArrayList<Aluno> alunos = new ArrayList<>();


    public void print() {
        System.out.println("--- SEMINÁRIO ADICIONADO ---");
        System.out.printf("%-14s | %-14s%n", "Seminário", getTitulo());
        System.out.printf("%-14s | %-14s%n%-15s| %-15s%n", "Professor(a)", professor.getNome(), "Especialidade", professor.getEspecialidade());
        if (alunos.isEmpty()) {
            System.out.println("\nNenhum aluno foi cadastrado.\n");
        } else {
            System.out.printf("%n%-14s | %-14s%n", "ALUNO", "IDADE");
            for (Aluno aluno : alunos) {
                if (aluno != null)
                    System.out.printf("%-14s | %-14d%n", aluno.getNome(), aluno.getIdade());
            }
        }

        if (local != null) {
            System.out.printf("%n%-14s | %-14s%n", "Local", local.getEndereco());
        }
    }

    public void criarSeminario(Scanner input){
        System.out.println("--- PREENCHA AS INFORMAÇÕES ---");
        System.out.println("Digite o título do seminário: ");
        setTitulo(input.nextLine());
        System.out.println("Digite o nome do professor(a) responsável: ");
        String nome = input.nextLine();
        System.out.println("Digite a escpecialidade do professor(a): ");
        String especialidade = input.nextLine();
        setProfessor(new Professor(nome, especialidade));
        System.out.println("Digite o local: ");
        String local = input.nextLine();
        setLocal(new Local(local));

        adicionarAluno(input);

        print();

    }

    public void adicionarAluno(Scanner input){
        char resposta;

        do {
            System.out.println("Deseja adicionar algum aluno ? (s/n)");
            resposta = input.next().toLowerCase().charAt(0);
            input.nextLine();

            if (resposta == 's') {
                System.out.println("Digite o nome do aluno: ");
                String nome = input.nextLine();
                System.out.println("Digite a idade do aluno: ");
                int idade = input.nextInt();
                input.nextLine();

                Aluno aluno = new Aluno(nome, idade);
                alunos.add(aluno);
            }
        } while (resposta == 's');
    }

    public void listarSeminario(){
        print();
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
