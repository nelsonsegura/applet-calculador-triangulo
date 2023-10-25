package calculador_triangulo;

import java.util.Scanner;

/**
 *
 * @author caruso
 */
public class Calculador_triangulo {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba las medidas de los tres lados del triangulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        System.out.print("Escriba la altura del triangulo: ");
        double altura = scanner.nextDouble();

        int resultado;
        if (lado1 == lado2 && lado2 == lado3) {
            resultado = 1; // Equilatero
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            resultado = 2; // Isosceles
        } else {
            resultado = 3; // Escaleno
        }

        
        switch (resultado) {
            case 1:
                System.out.println("Este es  un triangulo equilatero.");
                break;
            case 2:
                System.out.println("Este es un triangulo isosceles.");
                break;
            case 3:
                System.out.println("Este es un triangulo escaleno.");
                break;
            default:
                System.out.println("No se pudo determinar que tipo de triangulo era");
        }

        
        // Calculo de las medidas en grados de los angulos

        double angulo1 = Math.acos((lado2 * lado2 + lado3 * lado3 - lado1 * lado1) / (2 * lado2 * lado3));
        double angulo2 = Math.acos((lado1 * lado1 + lado3 * lado3 - lado2 * lado2) / (2 * lado1 * lado3));
        double angulo3 = Math.acos((lado1 * lado1 + lado2 * lado2 - lado3 * lado3) / (2 * lado1 * lado2));

        // Redondeo de los angulos

        angulo1 = Math.round(Math.toDegrees(angulo1));
        angulo2 = Math.round(Math.toDegrees(angulo2));
        angulo3 = Math.round(Math.toDegrees(angulo3));

        // Impresión de los angulos

        System.out.println("angulo 1: " + angulo1 + " grados");
        System.out.println("angulo 2: " + angulo2 + " grados");
        System.out.println("angulo 3: " + angulo3 + " grados");
    }
}