
package programacion12;
import java.util.Scanner;

/**
 *
 * @author dany8
 */

public class Cano_Daniel_Algebra {
    
    
    
    
    
    public static void main(String[] args) {
         Scanner lea = new Scanner(System.in);
          int opcion = 0;
         System.out.println("Menu:");
            System.out.println("1/2/3/4/5/6/7/8/9/10/11");
            System.out.println("A/B/C/D/E/F/G/H/I/J /K ");
            System.out.print("Elige una opcion: ");

            opcion = lea.nextInt();

            if (opcion == 1) {
                System.out.println("Has elegido la Opción 1.");
                System.out.print("a/b+c/d ");
        
                System.out.print("El valor de a ");
                double a = lea.nextDouble();
                System.out.print("El valor de b");
                double b = lea.nextDouble();
                System.out.print("El valor de c ");
                double c = lea.nextDouble();
                System.out.print("El valor de d ");
                double d = lea.nextDouble();
        
               double resultado1 =(((a)/(b)+(c)/(d)));
        
        System.out.print(resultado1);
            } else if (opcion == 5) {
                System.out.print("El valor de a ");
                double a = lea.nextDouble();
                System.out.print("El valor de b");
                double b = lea.nextDouble();
                System.out.print("El valor de c ");
                double c = lea.nextDouble();
                System.out.print("El valor de d ");
                double d = lea.nextDouble();
                System.out.print("El valor de e ");
                double e = lea.nextDouble();
                System.out.print("El valor de f ");
                double f = lea.nextDouble();
                System.out.print("El valor de g ");
                double g = lea.nextDouble();
                System.out.print("El valor de h ");
                double h = lea.nextDouble();    
                System.out.print("El valor de j ");
                double j = lea.nextDouble();    
                
                double resultado =((a*a)/(b-c)+(d-e/f-((g*h)/j)));
        
                System.out.print(resultado);
        
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            } else if (opcion == 9) {
               System.out.print("El valor de m ");
               double m = lea.nextDouble();
               System.out.print("El valor de n");
               double n = lea.nextDouble();
               System.out.print("El valor de o ");
               double o = lea.nextDouble();
               System.out.print("El valor de p ");
               double p = lea.nextDouble();
               System.out.print("El valor de r ");
               double r = lea.nextDouble();
               System.out.print("El valor de s ");
               double s = lea.nextDouble();
                
               double resultado =(((m+(n-p)/(p-(r/s)))));
        
                System.out.print(resultado);
               
                
                
                
                
                
                
                
            } else if (opcion == 2) {
              System.out.print("El valor de x ");
              double x = lea.nextDouble();
              System.out.print("El valor de y ");
              double y = lea.nextDouble();
             
        
              double resultado =((1/x-5)-(3*x*y/4));
        
              System.out.print(resultado);
              
              
              
              
            } else if (opcion == 6) {
               System.out.print("El valor de m ");
               double m = lea.nextDouble();
               System.out.print("El valor de n");
               double n = lea.nextDouble();
               System.out.print("El valor de p ");
               double p = lea.nextDouble();
              
                
               double resultado =((m/n)+p);
        
                System.out.print(resultado);
                
                
               
             } else if (opcion == 10) {
                 System.out.print("El valor de a ");
                double a = lea.nextDouble();
                System.out.print("El valor de b");
                double b = lea.nextDouble();
                System.out.print("El valor de c ");
                double c = lea.nextDouble();
                System.out.print("El valor de d ");
                double d = lea.nextDouble();
                System.out.print("El valor de e ");
                double e = lea.nextDouble();
                System.out.print("El valor de f ");
                double f = lea.nextDouble();
                System.out.print("El valor de g ");
                double g = lea.nextDouble();
                System.out.print("El valor de h ");
                double h = lea.nextDouble();    
                
                
                double resultado =((3*a+b)/c-(d+5*e)/f+(g/2*h));
        
                System.out.print(resultado);
                
               } else if (opcion == 3) {
                System.out.print("((a/b)+c)");
                System.out.print("El valor de a ");
                double a = lea.nextDouble();
                System.out.print("El valor de b");
                double b = lea.nextDouble();
                System.out.print("El valor de c ");
                double c = lea.nextDouble();
                

                
                double resultado =((a/b)+c);
        
                System.out.print(resultado);
                
                
        
              
              
               } else if (opcion == 7) {
                System.out.print("El valor de m ");
                double m = lea.nextDouble();
                System.out.print("El valor de n");
                double n = lea.nextDouble();
                System.out.print("El valor de p ");
                double p = lea.nextDouble();
                System.out.print("El valor de q ");
                double q = lea.nextDouble();
                
                
                

                
                double resultado =((m+(n/p-q)));
        
                System.out.print(resultado);
                
                
              
              } else if (opcion == 4) {
                System.out.print("(a+(b/c))");
                System.out.print("El valor de a ");
                double a = lea.nextDouble();
                System.out.print("El valor de b");
                double b = lea.nextDouble();
                System.out.print("El valor de c ");
                double c = lea.nextDouble();
                
                

                
                double resultado =((a+(b/c)));
        
                System.out.print(resultado);
                
               } else if (opcion == 8) {
                System.out.print("(a+(b/c))");
                System.out.print("El valor de a ");
                double a = lea.nextDouble();
                System.out.print("El valor de b");
                double b = lea.nextDouble();
                System.out.print("El valor de c ");
                double c = lea.nextDouble();
                System.out.print("El valor de d ");
                double d = lea.nextDouble();
                
                double resultado =(((a*a)/(b*b)))+((c*c)/(d*d));
        
                System.out.print(resultado);
                
                
              } else if (opcion == 11) {
                System.out.print("El valor de a ");
                double a = lea.nextDouble();
                System.out.print("El valor de b");
                double b = lea.nextDouble();
                System.out.print("El valor de x ");
                double x = lea.nextDouble();
                
                
                double resultado =(((a*a)+2*a*b+(b*b)/(4/x*x)+2));
        
                System.out.print(resultado);
                
                
              
              
              
              
              
              
              
                
            } else {
                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
            }
        }

 
        
   }
