/*Maythé Portales Barrios
 *A01411461 
* Ing. Industrial y de Sistemas
 * Problema 1
 */
package spp2.mportales.t01;
import java.util.Scanner;
/**
 *
 * @author may37
 */
public class SPP2MPortalesT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de promedio ITESM");
        Scanner teclado =new Scanner (System.in);
        double cal1, cal2, cal3, cal4, cal5, pro;
        int mat;
        String res;
        System.out.println("Introduce tu matrícula");
        mat =teclado.nextInt();
        System.out.println("Introduce tu calificación 1");
        cal1 = teclado.nextDouble();
        System.out.println("Introduce tu calificación 2");
        cal2 = teclado.nextDouble();
        System.out.println("Introduce tu calificación 3");
        cal3 =teclado.nextDouble();
        System.out.println("Introduce tu calificación 4");
        cal4 = teclado.nextDouble();
        System.out.println("Introduce tu calificación 5");
        cal5 = teclado.nextDouble();
        pro = (cal1+ cal2 + cal3 + cal4 + cal5)/5;
        if (pro>7.0){
            {
             res= "APROBADO";
                System.out.println("Eres: " +res);
            }
            } else if (pro<7.0){
            res= "REPROBADO";
            System.out.println("Eres: " +res);
         }
         System.out.println("Tu promedio es " +pro );
        }
        
              
        
    }
    

