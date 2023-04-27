package conta.controller;

import conta.model.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.MenuView.menuConta;
import static view.MenuView.menuInicial;

public class ControleMenu {
    public static void escolhadoMenu() {
        List<Conta> contas = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        int op;

        do {
            menuInicial();
            op = sc.nextInt();
            sc.nextLine();

            if (op == 9) {

                sc.close();
            }

            switch (op) {
                case 1 -> {
                    menuConta();
                }
                case 2 -> {
                    System.out.println("2 - Listar todas as Contas");
                }
                case 3 -> {
                    System.out.println("3 - Buscar Conta por Numero");
                }
                case 4 -> {
                    System.out.println("4 - Atualizar Dados da Conta");
                }
                case 5 -> {
                    System.out.println("5 - Apagar Conta");
                }
                case 6 -> {
                    System.out.println("6 - Sacar");
                }
                case 7 -> {
                    System.out.println("7 - Depositar");
                }
                case 8 -> {
                    System.out.println("8 - Transferir valores entre Contas");
                }
                default -> {
                    System.out.println("Opção invalida!");
                }
            }
        } while (true);


    }
}
