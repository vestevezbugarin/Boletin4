package boletin4_4;

import java.util.Scanner;

public class Boletin4_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce Kg de polvo:");
        float polvo = teclado.nextFloat();
        System.out.println("Introduce Kg de patacas:");
        float patacas = teclado.nextFloat();

        Calculo calc1 = new Calculo(polvo, patacas);

        //3 persoas = 2 kg de polbo , 1 de patacas.
        System.out.println("Poden comer: " + calc1.getClientes() + " clientes");

    }

}
