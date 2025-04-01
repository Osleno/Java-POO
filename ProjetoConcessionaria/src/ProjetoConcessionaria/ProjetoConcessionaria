package ProjetoConcessionaria; 
public class ProjetoConcessionaria {
    public static void main(String[] args) {
        Clientes [] c = new Clientes[4];
        Concessionaria [] f = new Concessionaria[4];

        c [1] = new Clientes("Lucas Silva", "657.896.564-57", 21, "M");
        c [2] = new Clientes("João Alberto", "798.154.798-36", 36, "M");
        c [3] = new Clientes("Júlia Nascimento", "458.659.422-59", 22, "F");

        f [1] = new Concessionaria("Uno", "Fiat", 74000, c[2] );
        f [2] = new Concessionaria("Voyage", "Volkswagen", 88000, c[3]);
        f [3] = new Concessionaria("Golf", "Volkswagen",212000, c[1]);

        f[3].consulta();
        f[3].valorEntrada(63610);
        f[3].valorMin();
        System.out.println(f[3].ficha());
    }
}