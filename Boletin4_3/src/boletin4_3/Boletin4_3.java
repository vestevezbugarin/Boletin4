package boletin4_3;

import java.util.Scanner;

public class Boletin4_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce o radio: ");
        double radio = teclado.nextDouble();

        Circulo newCirculo = new Circulo(radio);

        System.out.println("A area do circulo é: " + newCirculo.calcArea());
        System.out.println("A lonxitude do circulo é: " + newCirculo.calcLonxitude());
    }

}
