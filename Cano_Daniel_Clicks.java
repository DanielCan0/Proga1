import java.util.Scanner;

public class Cano_Daniel_Clicks {

    public static void main(String[] args) {
        // Costos y clics
        int clics1 = 60;
        double costo1 = 0.30;
        int clics2 = 100;
        double costo2 = 0.25;
        int clics3 = 20;
        double costo3 = 0.80;

        // Cálculo del costo total
        double costoTotal = (clics1 * costo1) + (clics2 * costo2) + (clics3 * costo3);
        int totalClics = clics1 + clics2 + clics3;

        // Cálculo del costo promedio por clic
        double costoPromedio = costoTotal / totalClics;

        // Calcular el ISV
        double ISV = costoTotal * 0.16;
        double totalConISV = costoTotal + ISV;

        // Mostrar resultados
        System.out.println("Costo promedio por clic: $" + String.format("%.2f", costoPromedio));
        System.out.println("Costo total incluyendo ISV: $" + String.format("%.2f", totalConISV));

        // Permitir al usuario ingresar un total y calcular el total + ISV
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total para calcular el total + ISV: ");
        double totalUsuario = scanner.nextDouble();
        double totalUsuarioConISV = totalUsuario + (totalUsuario * 0.16);
        System.out.println("Total incluyendo ISV: $" + String.format("%.2f", totalUsuarioConISV));
        scanner.close();
    }
}
