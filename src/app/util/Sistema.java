package app.util;

import app.model.Seminario;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private boolean rodando = true;
    private ArrayList<Seminario> seminarios = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    private Seminario s = new Seminario();

    public void gerenciarSeminarios(){
        while (rodando){
            exibirMenu();
        }
    }

    public void exibirMenu(){
        System.out.println("--- GERENCIADOR DE SEMINÁRIOS ---");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar seminário");
        System.out.println("2 - Listar seminários cadastrados");
        System.out.println("3 - Sair");

        int opcao = obterOpcao();

        switch (opcao){
            case 1 -> {
                s.criarSeminario(input);
                continueOperation();
            }
            case 2 -> {
                s.listarSeminario();
            }
            case 3 -> {
                rodando = false;
                System.out.println("Encerrando programa...");
            }

        }
    }

    private int obterOpcao(){
         while (!input.hasNextInt()){
             System.out.println("Opção inváliida. Tente novamente.");
             input.nextLine();
         }
         int opcao = input.nextInt();
         input.nextLine();

         return opcao;
    }

    private void continueOperation(){
        String response = "";
        System.out.println("Deseja fazer outra operação ? (s/n): ");
        response = input.nextLine().toLowerCase();
        if (!response.equals("s")){
            rodando = false;
            System.out.println("Encerrando programa...");
        }
    }
}
