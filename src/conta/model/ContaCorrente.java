package conta.model;

public class ContaCorrente extends Conta {
    private float limite;
    public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float v) {
        super(numero, agencia, tipo, titular, saldo);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor) {
        if (this.getSaldo() + this.getLimite() <  valor){
            System.out.println("Saldo Insuficiente!");
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Limite de Crédito: " + this.limite);
    }
}
