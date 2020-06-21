package resistencia;

import java.util.Scanner;

/**
* @author Jocelyn Casteletti
**/
public class resistencia {

   public static void main(String[] args) {

       Scanner res = new Scanner(System.in);

       double res1 = 0;
       double res2 = 0;
       double res3 = 0; /* int res1, res2, res3 =0;*/

       System.out.println("Ingrese resistencia numero 1: ");
       res1 = res.nextInt();

       if (res1 <= 0) {
           System.out.println("Las resistencias no son distintas a cero. ");
           System.out.println("Reingrese el valor nuevamente ");
           res1 = res.nextInt();
       }

       System.out.println("Ingrese resistencia numero 2: ");
       res2 = res.nextInt();
       if (res2 <= 0) {
           System.out.println("Las resistencias no son distintas a cero. ");
           System.out.println("Reingrese el valor nuevamente ");
           res2 = res.nextInt();
       } else if (res2 == res1) {
           System.out.println("La resistencia dos no debe ser igual a la anterior ");
           System.out.println("Reingrese el valor nuevamente ");
           res2 = res.nextInt();
       }

       System.out.println("Ingrese resistencia numero 3: ");
       res3 = res.nextInt();
       if (res3 <= 0) {
           System.out.println("Las resistencias no son distintas a cero. ");
           System.out.println("Reingrese el valor nuevamente ");
           res3 = res.nextInt();
       } else if (res3 == res1 || res3 == res2) {
           System.out.println("La resistencia tres no debe ser igual a la anterior ");
           System.out.println("Reingrese el valor nuevamente ");
           res3 = res.nextInt();
       }

       double restotal = 1 / ((1 / res1) + (1 / res2) + (1 / res3));
       System.out.println("La resistencia total es de: " + restotal);

   }
}

