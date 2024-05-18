import java.util.ArrayList;
import java.lang.Math;

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
        double median = numeros.get(numeros.size() / 2);
        if (numeros.size() % 2 == 0) {
            even = false;
        } else {
            even = true;
        }

        if (!even) {
            return median;
        } else {
            double plusOne = (Math.ceil(median));
            double minusOne = (Math.floor(median));
            return (plusOne + minusOne) / 2;
        }

    }

    double CalcularModa(ArrayList<Double> numeros) {

    }

    double OrdenarLista(ArrayList<Double> numeros, boolean crescente) {

    }

}



