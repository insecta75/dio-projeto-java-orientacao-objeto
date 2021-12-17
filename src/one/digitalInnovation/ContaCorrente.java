package one.digitalInnovation;

public class ContaCorrente extends Conta {

    public ContaCorrente (String nomeBanco, int numeroAgencia, int numeroConta, String nomeCliente, double limite) {
        super(nomeBanco, numeroAgencia, numeroConta, nomeCliente, limite);
    }

    public void imprimirExtrato() {
        System.out.println("\n### Extrato da Conta Corrente ###");
        super.imprimirInfoConta();
    }
}
