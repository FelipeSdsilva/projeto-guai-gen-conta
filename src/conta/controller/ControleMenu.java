package conta.controller;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static view.MenuView.finalMenu;
import static view.MenuView.menuInicial;

public class ControleMenu {
    public static void escolhadoMenu() {
        ContaController contas = new ContaController();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCriar Contas\n");

        ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
        contas.cadastrar(cc1);

        ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
        contas.cadastrar(cc2);

        ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
        contas.cadastrar(cp1);

        ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
        contas.cadastrar(cp2);


        int op, num, numDest, agen, tipo, aniver;
        String titular;
        float saldo, limite, valor;

        while (true) {
            menuInicial();
            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite valores inteiros! ");
                sc.nextLine();
                op = 0;
            }


            if (op == 9) {
                finalMenu();
                sc.close();
            }

            switch (op) {
                case 1 -> {

                    System.out.println("1 - Criar conta");

                    System.out.print("Digite o Numero da Agência: ");
                    agen = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o Nome do Titular: ");
                    titular = sc.nextLine();
                    do {
                        System.out.print("Digite o Tipo da Conta (1-CC ou 2-CP): ");
                        tipo = sc.nextInt();
                    } while (tipo < 1 && tipo > 2);

                    System.out.print("Digite o Saldo da Conta (R$): ");
                    saldo = sc.nextFloat();

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Digite o Limite de Crédito (R$): ");
                            limite = sc.nextFloat();
                            contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agen, tipo, titular, saldo, limite));
                        }
                        case 2 -> {
                            System.out.println("Digite o dia do Aniversario da Conta: ");
                            aniver = sc.nextInt();
                            contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agen, tipo, titular, saldo, aniver));
                        }
                    }
                    keyPress();
                }
                case 2 -> {
                    System.out.println("2 - Listar todas as Contas");
                    contas.listarTodas();
                    keyPress();
                }
                case 3 -> {
                    System.out.println("3 - Buscar Conta por Numero");

                    System.out.print("Digite o número da conta: ");
                    num = sc.nextInt();
                    contas.procurarPorNumero(num);
                    keyPress();
                }
                case 4 -> {
                    System.out.println("4 - Atualizar Dados da Conta");
                    System.out.println("Digite o número da conta: ");
                    num = sc.nextInt();

                    if (contas.buscarNaCollection(num) != null) {

                        System.out.println("Digite o Numero da Agência: ");
                        agen = sc.nextInt();
                        System.out.println("Digite o Nome do Titular: ");
                        sc.skip("\\R?");
                        titular = sc.nextLine();

                        System.out.println("Digite o Saldo da Conta (R$): ");
                        saldo = sc.nextFloat();

                        tipo = contas.retornaTipo(num);

                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Digite o Limite de Crédito (R$): ");
                                limite = sc.nextFloat();
                                contas.atualizar(new ContaCorrente(num, agen, tipo, titular, saldo, limite));
                            }
                            case 2 -> {
                                System.out.println("Digite o dia do Aniversario da Conta: ");
                                aniver = sc.nextInt();
                                contas.atualizar(new ContaPoupanca(num, agen, tipo, titular, saldo, aniver));
                            }
                            default -> {
                                System.out.println("Tipo de conta inválido!");
                            }
                        }

                    } else
                        System.out.println("\nConta não encontrada!");


                    keyPress();
                }
                case 5 -> {
                    System.out.println("5 - Apagar Conta");
                    System.out.print("Digite o número da conta: ");
                    num = sc.nextInt();
                    contas.deletar(num);
                    keyPress();
                }
                case 6 -> {
                    System.out.println("6 - Sacar");
                    System.out.print("Digite o número da conta: ");
                    num = sc.nextInt();
                    do {
                        System.out.print("Digite o valor do saque (R$): ");
                        valor = sc.nextFloat();
                    } while (valor <= 0);

                    contas.sacar(num, valor);

                    keyPress();
                }
                case 7 -> {
                    System.out.println("7 - Depositar");
                    System.out.print("Digite o número da conta: ");
                    num = sc.nextInt();

                    do {
                        System.out.print("Digite o valor do saque (R$): ");
                        valor = sc.nextFloat();
                    } while (valor <= 0);

                    contas.depositar(num, valor);
                    keyPress();
                }
                case 8 -> {
                    System.out.println("8 - Transferir valores entre Contas");

                    System.out.print("Digite o número da conta de origem: ");
                    num = sc.nextInt();
                    System.out.print("Digite o número da conta destino: ");
                    numDest = sc.nextInt();

                    do {
                        System.out.print("Digite o valor da transferência (R$): ");
                        valor = sc.nextFloat();
                    } while (valor <= 0);

                    contas.transferir(num, numDest, valor);
                    keyPress();
                }
                default -> {
                    System.out.println("Opção invalida!");
                    keyPress();
                }
            }
        }
    }

    public static void keyPress() {
        try {
            System.out.println(Cores.TEXT_RESET);
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}
