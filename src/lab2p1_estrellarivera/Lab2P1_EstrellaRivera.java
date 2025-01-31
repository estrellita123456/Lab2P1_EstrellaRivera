/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_estrellarivera;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Lab2P1_EstrellaRivera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("---Menu de opciones:---"); 
        System.out.println("1) Descomposicion de factores");
        System.out.println("2) Numero mas alejado");
        System.out.println("3) Complemento de binario");
        System.out.println("4) Salir");
        System.out.println("Elija una opcion:");
        n= scanner.nextInt();
          if (n==1) {
              do {
                  System.out.println("Descomponer");
                  System.out.println("Ingrese un numero entero:"); 
                  int num = scanner.nextInt();
                  System.out.println("Numero ingresado:");
                  System.out.println(num);
                  System.out.println("Factores:");
                  
              } while (true);
          }
               if (n==2) {
              do {
                  System.out.println("Numero mas alejado");
                  System.out.println("Ingrese numero 1:"); 
                  int n1 = scanner.nextInt();
                  System.out.println(n1);
                  System.out.println("Ingrese numero 2:");
                  int n2 = scanner.nextInt();
                  System.out.println(n2);
                  System.out.println("Ingrese numero 2:");
                  int n3 = scanner.nextInt();
                  System.out.println(n3);
                  
                  
              } while (true);
   
                      
        }
    }
  
    
}
