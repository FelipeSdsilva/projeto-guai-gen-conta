package conta.model;

public abstract class Conta {
    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    public Conta() {
    }

    public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(float valor) {
        if (this.getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    public void depositar(float valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void visualizar() {
        String tipo = "";

        switch (this.tipo) {
            case 1 -> tipo = "Conta Corrente";
            case 2 -> tipo = "Conta Poupança";
        }

        System.out.printf("""
                                
                \033[0;100m\u001B[31m*********************************************************** \u001B[0m
                \033[0;100m\u001B[31m|                      Dados da Conta:                    | \u001B[0m
                \033[0;100m\u001B[31m*********************************************************** \u001B[0m
                \033[0;100m\u001B[31m|                                                           \u001B[0m
                \033[0;100m\u001B[31m|Numero da Conta: %d                                        \u001B[0m
                \033[0;100m\u001B[31m|Agência: %d                                                \u001B[0m
                \033[0;100m\u001B[31m|Tipo da Conta: %d                                          \u001B[0m
                \033[0;100m\u001B[31m|Titular: %s                                                \u001B[0m
                \033[0;100m\u001B[31m|Saldo:  %.2f                                               \u001B[0m
                """, this.numero, this.agencia, this.tipo, this.titular, this.saldo);
    }
}
