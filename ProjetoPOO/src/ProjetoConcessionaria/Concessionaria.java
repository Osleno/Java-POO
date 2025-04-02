package ProjetoConcessionaria;

public class Concessionaria implements Financiamento{
    private String modelo;
    private String marca;
    private double valor;
    private double entrada;
    private boolean consultaCpf;
    private Clientes comprador;

    public Concessionaria(String modelo, String marca, double valor, Clientes comprador) {
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.entrada = 0;
        this.consultaCpf = false;
        this.comprador = comprador; 
    }

    public String ficha() {
        return "Modelo Carro: " + modelo + "\nMarca: " + marca + "\nValor: " + valor + "\nEntrada " + entrada + "\nConsulta: " + consultaCpf + 
                "\nComprador: " + comprador.getNome() + "\nCPF: " + comprador.getCpf() + "\nIdade: " + comprador.getIdade() + 
                "\nSexo: " + comprador.getSexo();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public boolean isconsultacpf() {
        return consultaCpf;
    }

    public void setConsultaCpf(boolean consultaCpf) {
        this.consultaCpf = consultaCpf;
    }

    public Clientes getComprador() {
        return comprador;
    }

    public void setComprador(Clientes comprador) {
        this.comprador = comprador;
    }

    @Override
    public void consulta() {
        this.consultaCpf = true;
    }

    @Override
    public void consultado() {
        this.consultaCpf = false;
        System.out.println("Financiamento não aprovado!");
    }

    @Override
    public void valorMin() {
        double valorr = getValor();
        double porcentagem = 30;
        double resultado = (valorr * porcentagem) / 100; 
        if (this.entrada < resultado) {
            this.entrada =  0;
            System.out.println("O valor da entrada é de 30% o minimo é " + resultado);
        } 
    }

    @Override
    public void valorEntrada(double a) {
       this.entrada = a;
       if (this.entrada > this.valor) {
        this.entrada = this.valor;
        System.out.println("Pago a vista!");
       } else {
        this.entrada = a;
       }
    }
}
