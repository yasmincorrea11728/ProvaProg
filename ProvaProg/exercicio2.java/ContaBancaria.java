package exercicio2;

public abstract class ContaBancaria {
    
    private String conta;
    private int numConta;
    private float saldo;

    public ContaBancaria(String conta, int numConta, float saldo) {
        this.conta = conta;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(float saque) {
        if (saque > this.saldo) {
            System.out.println("Sem saldo!");
            
        } else {
            this.saldo -= saque;
        }
    }

    public void depositar(float deposito) {
        this.saldo += deposito;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Conta = " + conta + "\nNumConta = " + numConta + "\nSaldo = " + saldo;
    }
}
