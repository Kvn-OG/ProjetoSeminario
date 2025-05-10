package app.util;

import app.model.Seminario;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private boolean rodando = true;
    private ArrayList<Seminario> seminarios = new ArrayList<>();
    Sistema sys = new Sistema();
    Scanner input = new Scanner(System.in);

    public void gerenciarSeminarios(){
        while (rodando){

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
}
