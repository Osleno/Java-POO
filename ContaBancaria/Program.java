package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;
 
    public class Program {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

        ContaCorrente clientecomum = new ContaCorrente();
            System.out.println("Digite o valor que deseja depositar.");
            clientecomum.depositar(sc.nextDouble());
            
            System.out.println("Digite o valor que deseja sacar.");
            clientecomum.sacar(sc.nextDouble());
            
            System.out.printf(String.format("(Cliente Comun) Saldo final R$ %.2f%n", clientecomum.getSaldo()));


        ContaEspecial clienteespecial = new ContaEspecial();
            System.out.println("Digite o valor desejado para depositar.");
            clienteespecial.depositar(sc.nextDouble());
            
            System.out.println("Digite o valor que deseja sacar.");
            clienteespecial.sacar(sc.nextDouble());
            
            System.out.printf(String.format("(Cliente Especial) Saldo final R$ %.2f", clienteespecial.getSaldo()));
        
            sc.close();
    }     
}