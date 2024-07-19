/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion12;
import java.util.Scanner;

/**
 *
 * @author rjl01
 */
public class Cano_Daniel_PlanillaEmpleado {
    public static void main(String[] args) {
        
        
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Nombre Completo ");
        String nombre=lea.next();
        
        System.out.println("Ingrese las horas laboradas en el mes ");
        double horas=lea.nextDouble();
        System.out.println("Ingrese la tarifa por hora ");
        double tarifa=lea.nextDouble();

        double SM= horas*tarifa;
        int SEM=4;
        double SS= SM/ SEM;
        
        System.out.println("Su salario semanal es de: "+SS+"$");
        
        System.out.println("------BoletaDeEmpleado------");
        System.out.println("Nombre: "+nombre);
        System.out.println ("\nHoras Trabajadas: "+horas+"h");
        System.out.println ("\nTarifa por Hora: "+tarifa+"$");
        System.out.println ("\nSalario Semanal: "+SS+"$");
        System.out.println("------ ------  ------ ------");
        
        
   
        
        
        
        
        
        
    }
    
}
