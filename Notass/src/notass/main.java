/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notass;
import java.util.Scanner;
/**
 *
 * @author SANTIAGO CARDOZO
 */
public class main {
     public static void main(String[] args) {   
         Scanner oki = new Scanner(System.in);
         
         System.out.println("Ingrese el numero de estudiantes; ");
          int Estu = oki.nextInt();
          int []Nota = new int [Estu];
          for (int i = 0; i< Estu; i++){
              System.out.println("Ingrese la nota del estudiante " + (i + 1));
              Nota[i] = oki.nextInt();
          }
          Notass jiu = new Notass(Estu,Nota);
          jiu.calprom();
          jiu.mayor();
          System.out.println("El promedio de las notas es : " +jiu.getProm());
          System.out.println("El total de estudiantes que pasaron son : " +jiu.getAlta());
          System.out.println("El total de estudiantes que perdienron son : " +jiu.getBaja());
     }
}
