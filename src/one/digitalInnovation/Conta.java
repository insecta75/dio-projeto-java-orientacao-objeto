package one.digitalInnovation;

import lombok.Getter;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
public abstract class Conta {
    protected String nomeBanco;
    protected int numeroAgencia;
    protected int numeroConta;
    protected String nomeCliente;
    protected double saldoConta;
    protected double limite;

    public Conta(String nomeBanco, int numeroAgencia, int numeroConta, String nomeCliente, double limite) {
        this.nomeBanco = nomeBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.limite = limite;
    }

    public void depositar(double valor) { this.saldoConta += valor; }
    public void sacar(double valor) {
        if(this.saldoConta > 0 && this.saldoConta >= valor && this.limite > valor) {
            this.saldoConta -= valor;
        } else {
            System.out.println("\nSaque negado.");
        }
    }
    public void transferir(double valor, Conta contaDestino) {
        if(this.saldoConta > 0 && this.saldoConta >= valor && this.limite > valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("\nTransferencia negada.");
        }
    }
    protected void imprimirInfoConta() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agoraData = new Date();

        System.out.println("Data: " +formatoData.format(agoraData)+
                           "\nNome do Cliente: "+this.nomeCliente+
                           "\nNome do Banco: "+this.nomeBanco+
                           "\nNumero da Agencia: "+this.numeroAgencia+
                           "\nNumero da Conta: "+this.numeroConta);
        System.out.printf("Saldo: %.1f\n", this.saldoConta);
    }
}