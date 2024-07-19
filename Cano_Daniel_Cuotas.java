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
public class Cano_Daniel_Cuotas {
    public static void main(String[] args) {
    Scanner lea=new Scanner(System.in).useDelimiter("\n");  
    
        System.out.println("Ingresar su nombre ");
        String nombre=lea.next();
        System.out.println("Ingresar el monto del prestamo: ");
        double prestamo=lea.nextDouble();
        System.out.println("Ingresar plazos a pagar: ");
        int plazos=lea.nextInt();
        System.out.println("Ingresar el interes establecido: ");
        double interes=lea.nextDouble();
        System.out.println("Ingresar la comision por cuota: ");
        double comision=lea.nextDouble();
        System.out.println("Ingrsar el porcentaje de seguro mensual aplicado a la cuota: ");
        double seguro=lea.nextDouble();
        
        double interesmensual=prestamo*interes;
        double seguromensual=seguro*prestamo;
        double cuotamensual=(prestamo/plazos)+interes+comision+seguro;
        double totalpagar=cuotamensual*plazos;
        
        
       
        System.out.println("----- Cuotas Mensuales -----");
        System.out.println("Cuota de Pago Mensual: "+cuotamensual);
        System.out.println("Total a pagar: "+totalpagar+"Lps.");
        System.out.println("-----------------------------");
        
    }
    
}
