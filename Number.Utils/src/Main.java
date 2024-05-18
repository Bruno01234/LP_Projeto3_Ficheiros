import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    double CalcularMedia(ArrayList<Double> numeros) {
        double soma = 0.0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma / numeros.size();
    }

    double CalcularMediana(ArrayList<Double> numeros) {
        boolean even;
        int median = numeros.size() / 2;
        ArrayList<Double> ordenados = new ArrayList(numeros);
        Collections.sort(ordenados);

        if (numeros.size() % 2 == 0) {
            even = false;
        } else {
            even = true;
        }

        if (!even) {
            return median;
        } else {
            return (ordenados.get(median - 1) + ordenados.get(median));
        }

    }

    double CalcularModa(ArrayList<Double> numeros) {

    }

    ArrayList<Double> OrdenarLista(ArrayList<Double> numeros, boolean crescente) {

        if (crescente) {
            Collections.sort(numeros);
        } else {
            Collections.sort(numeros, Collections.reverseOrder());
        }

        return numeros;

    }

}



