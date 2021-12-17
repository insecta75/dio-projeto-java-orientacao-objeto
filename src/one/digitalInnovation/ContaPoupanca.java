package one.digitalInnovation;

public class ContaPoupanca extends Conta {

    public ContaPoupanca (String nomeBanco, int numeroAgencia, int numeroConta, String nomeCliente, double limite) {
        super(nomeBanco, numeroAgencia, numeroConta, nomeCliente, limite);
    }

    public void imprimirExtrato() {
        System.out.println("\n### Extrato da Conta Poupanca ###");
        super.imprimirInfoConta();
    }

}
