public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(String conta, int numConta, float saldo, double limite) {
        super(conta, numConta, saldo);
        this.limite = limite;
    }
     
    
    public void sacar(float saque) {
        if (this.saldo - saque < -(this.limite)) {
            System.out.println("Limite máximo.");   

        } else {
            this.saldo -= saque;
        }
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nLimite = " + limite;
    }
}