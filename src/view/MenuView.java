package view;

public class MenuView {

    public static void menuInicial() {
        System.out.print("""
                              
                ***************************************************** 
                |                                                   | 
                |               BANCO DO BRAZIL COM Z               | 
                |                                                   | 
                ***************************************************** 
                |                                                   | 
                |           1 - Criar Conta                         | 
                |           2 - Listar todas as Contas              | 
                |           3 - Buscar Conta por Numero             | 
                |           4 - Atualizar Dados da Conta            | 
                |           5 - Apagar Conta                        | 
                |           6 - Sacar                               | 
                |           7 - Depositar                           | 
                |           8 - Transferir valores entre Contas     | 
                |           9 - Sair                                | 
                |                                                   | 
                ***************************************************** 
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
                ***************************************************** 
                |                                                   | 
                |               BANCO DO BRAZIL COM Z               | 
                |                                                   | 
                ***************************************************** 
                |                                                   | 
                |                                                   | 
                |                                                   | 
                |                                                   | 
                |             Banco do Brazil com Z                 | 
                |            O seu futuro começa aqui!              | 
                |                                                   | 
                |                                                   | 
                |                                                   | 
                |                                                   | 
                |                                                   | 
                |                                                   | 
                ***************************************************** """);

    }

}
