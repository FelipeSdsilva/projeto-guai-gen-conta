package view;

public class MenuView {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
    public static final String TEXT_RESET = "\u001B[0m";

    public static void menuInicial() {
        System.out.print("""
                              
                \033[0;100m\u001B[31m*****************************************************  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|               BANCO DO BRAZIL COM Z               |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m*****************************************************  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|           1 - Criar Conta                         |  \u001B[0m
                \033[0;100m\u001B[31m|           2 - Listar todas as Contas              |  \u001B[0m
                \033[0;100m\u001B[31m|           3 - Buscar Conta por Numero             |  \u001B[0m
                \033[0;100m\u001B[31m|           4 - Atualizar Dados da Conta            |  \u001B[0m
                \033[0;100m\u001B[31m|           5 - Apagar Conta                        |  \u001B[0m
                \033[0;100m\u001B[31m|           6 - Sacar                               |  \u001B[0m
                \033[0;100m\u001B[31m|           6 - Sacar                               |  \u001B[0m
                \033[0;100m\u001B[31m|           6 - Sacar                               |  \u001B[0m
                \033[0;100m\u001B[31m|           7 - Depositar                           |  \u001B[0m
                \033[0;100m\u001B[31m|           8 - Transferir valores entre Contas     |  \u001B[0m
                \033[0;100m\u001B[31m|           9 - Sair                                |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m*****************************************************  \u001B[0m
                Entre com a opção desejada: """);
    }

    public static void menuConta() {
        System.out.print("""
                            
                \033[0;100m\u001B[31m*****************************************************  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|               BANCO DO BRAZIL COM Z               |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m*****************************************************  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|           Qual tipo de conta você quer            |  \u001B[0m
                \033[0;100m\u001B[31m|                      Criar ?                      |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|               1 - Conta corrente                  |  \u001B[0m
                \033[0;100m\u001B[31m|               2 - Conta poupança                  |  \u001B[0m
                \033[0;100m\u001B[31m|               0 - voltar ao menu anterior         |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m*****************************************************  \u001B[0m
                \033[0;100m\u001B[31mEntre com a opção desejada: """);
    }

    public static void finalMenu() {
        System.out.print("""
                \033[0;100m\u001B[31m*****************************************************  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|               BANCO DO BRAZIL COM Z               |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m*****************************************************  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |  \u001B[0m
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m|                                                   |
                \033[0;100m\u001B[31m*****************************************************
                """);
    }

}
