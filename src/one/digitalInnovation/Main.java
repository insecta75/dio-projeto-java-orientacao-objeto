package one.digitalInnovation;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Itau", 1212, 13456, "Adriana Silva", 1200);
        ContaPoupanca cp = new ContaPoupanca("Bradesco", 165, 55434, "Andrea Alves", 1000);

        cc.depositar(1500.5);
        cc.imprimirExtrato();//Saldo Corrente: R$ 1500.5
        cc.transferir(550.5, cp);
        cc.sacar(900);
        cp.imprimirExtrato();//Saldo Poupanca: R$ 550.5
        cp.sacar(600);//Saque negado. Valor insuficiente.
        cc.imprimirExtrato();//Saldo Corrente: R$ 50.0
        cc.sacar(100);//Saque negado. Valor insuficiente.
        cc.imprimirExtrato();//Saldo Corrente: R$ 50.0
        cc.sacar(50);
        cc.imprimirExtrato();//Saldo Poupanca: R$ 0.0
        cc.sacar(50);//Saque negado. Conta zerada.
        cc.depositar(2000);
        cc.imprimirExtrato();//Saldo Corrente: R$ 2000.0
        cc.sacar(1500);//Saque negado. Ultrapassa limite.
        cc.transferir(1500, cp);//Transferencia negada. Ultrapassa limite.
        cc.imprimirExtrato();//Saldo Corrente: R$ 2000.0
    }
}
