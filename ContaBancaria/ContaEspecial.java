package ContaBancaria;
public class ContaEspecial extends ContaCorrente {
    @Override
    public double calcularTaxa(double quantia) {
            return quantia * 0.001;
    }
}

