import java.util.ArrayList;
import Number.Utils;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> lista = new ArrayList<>();
        lista.add(3.0);
        lista.add(3.0);
        lista.add(7.0);
        lista.add(8.0);
        lista.add(9.0);
        lista.add(1.0);
        lista.add(9.0);
        lista.add(5.0);
        lista.add(6.0);
        lista.add(4.0);
        lista.add(4.0);
        lista.add(3.0);

        double media = Utils.CalcularMedia(lista);
        System.out.println("A média é: " + media);

        double mediana = Utils.CalcularMediana(lista);
        System.out.println("A mediana é " + mediana);

        ArrayList<Double> modas = Utils.CalcularModa(lista);
        for (Double moda : modas) {
            System.out.println("A moda é " + moda);
        }

        System.out.println("A lista em ordem crescente é ");
        ArrayList<Double> crescente = Utils.OrdenarLista(lista,true);
        System.out.println(crescente);

        System.out.println("A lista em ordem decrescente é ");
        ArrayList<Double> decrescente =  Utils.OrdenarLista(lista,false);
        System.out.println(decrescente);
    }
}
