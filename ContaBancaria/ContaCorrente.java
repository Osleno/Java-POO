package ContaBancaria;
public class ContaCorrente {
    protected double saldo;
    
    public ContaCorrente() {
        this.saldo = 0.00;
    }
    
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
     }

    public double getSaldo() {
        return saldo;
    }
        
    public void depositar(double quantia) {
        saldo += quantia;
        System.out.printf("Deposito de R$ %.2f realizado com sucesso.\n", quantia);
    }
    
    
    public double calcularTaxa(double quantia) {
      return quantia * 0.005;
    }

    public void sacar(double quantia) {
        double taxa = calcularTaxa(quantia);
        double debitoTotal = quantia + taxa;
        
        if(quantia > saldo) {
            System.out.println("Saldo insuficiente");
        }else {
            saldo -= debitoTotal;
            System.out.println(String.format("Saque de R$ %.2f realizado com sucesso.\nImposto sobre a transação R$ %.2f", quantia, taxa));
        }
    }
}