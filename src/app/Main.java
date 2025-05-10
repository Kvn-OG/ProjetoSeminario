package app;

import app.model.Seminario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Seminario s = new Seminario();
        Scanner input = new Scanner(System.in);

        s.criarSeminario(input);
    }
}
