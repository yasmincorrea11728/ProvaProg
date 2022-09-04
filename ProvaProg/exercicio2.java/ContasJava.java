package exercicio2;

public class ContasJava {
    public static void main(String[] args) {
        
        ContaPoupanca p = new ContaPoupanca("Poupança", 1, 500, 1000);

        p.sacar(987);
        System.out.println(p.saldo);

        p.depositar(1876);
        System.out.println("\n" + p.saldo);

        p.calcularNovoSaldo(0.1);
        System.out.println("\n" + p.saldo);

        System.out.println("\n" + p);

        ContaEspecial e = new ContaEspecial("Especial", 2, 1000, 2000);

        e.sacar(3570);
        System.out.println("\n" + e.saldo);

        e.depositar(560);
        System.out.println("\n" + e.saldo);

        System.out.println("\n" + e);
    }
}
