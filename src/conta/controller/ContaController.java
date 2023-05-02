package conta.controller;

import conta.model.Conta;
import conta.repository.ContaRepository;

import java.util.ArrayList;

public class ContaController implements ContaRepository {

    private ArrayList<Conta> listaContas = new ArrayList<>();
    int num = 0;

    @Override
    public void procurarPorNumero(int numero) {
        var conta = bucarNaCollection(numero);
        if (conta != null) conta.visualizar();
        else System.out.println("A conta número " + numero + " não foi encontrada!");
    }

    @Override
    public void listarTodas() {
        listaContas.forEach(conta -> conta.visualizar());
    }

    @Override
    public void cadastrar(Conta conta) {
        listaContas.add(conta);
        System.out.println("Conta número: " + conta.getNumero() + " foi criada com sucesso!");
    }

    @Override
    public void atualizar(Conta conta) {


    }

    @Override
    public void deletar(int numero) {
        var conta = bucarNaCollection(numero);
        if (conta != null) if (listaContas.remove(conta) == true) {
            System.out.println("A conta número " + numero + " foi deletada com sucesso!");
        } else System.out.println("A conta número " + numero + " não foi encontrada!");
    }

    @Override
    public void sacar(int numero, float valor) {
        var conta = bucarNaCollection(numero);

        if (conta != null) {
            if (conta.sacar(valor) == true) {
                System.out.println("O saque na Conta número: " + numero + " foi efetuado com sucesso!");
            }
        } else {
            System.out.println("A Conta número: " + numero + " não foi encontrada!");
        }
    }

    @Override
    public void depositar(int numero, float valor) {
        var conta = bucarNaCollection(numero);

        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Deposito na conta número: " + numero + " foi efetuado com sucesso!");
        } else {

        }
    }

    @Override
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {

    }

    public int gerarNumero() {
        return ++num;
    }

    public Conta bucarNaCollection(int num) {
        for (Conta conta : listaContas) {
            if (conta.getNumero() == num) return conta;
        }
        return null;
    }
}
