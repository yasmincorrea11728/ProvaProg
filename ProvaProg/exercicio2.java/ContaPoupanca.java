public class ContaPoupanca extends ContaBancaria{

    private int diaDeRendimento;

    public ContaPoupanca(String conta, int numConta, float saldo, int diaDeRendimento ){
        super(conta, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }
    
    public void calcularNovoSaldo(double taxa) {
        this.saldo *= (1 + taxa / 100);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nDia De Redimento = " + diaDeRendimento;   
    }
}