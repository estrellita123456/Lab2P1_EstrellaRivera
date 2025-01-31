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
        int salir;
        System.out.println("---Menu de opciones:---");
        System.out.println("1) Descomposicion de factores");
        System.out.println("2) Numero mas alejado");
        System.out.println("3) Complemento de binario");
        System.out.println("4) Salir");
        System.out.println("Elija una opcion:");
        n = scanner.nextInt();
        if (n == 1) {
            do {
                System.out.println("Descomponer factores");
                System.out.println("Ingresar un numero entero:");
                int num = scanner.nextInt();
                System.out.println("Numero Ingresado:");
                System.out.println(num);
                int cont = 2;
                System.out.print("Los factores son: 1");
                do {
                    if (num % cont == 0) {
                        System.out.print(cont);
                        num = num / cont;
                    } else {
                        cont++;
                    }
                } while (num != 1);
                System.out.println("");
                System.out.println("Para volver a ejecutar ingrese 1");
                salir = scanner.nextInt();
            } while (salir == 1);
        }
        if (n == 2) {
            System.out.println("Numero mas alejado");
            System.out.println("Ingrese numero 1:");
            int n1 = scanner.nextInt();
            System.out.println("Ingrese numero 2:");
            int n2 = scanner.nextInt();
            System.out.println("Ingrese numero 3:");
            int n3 = scanner.nextInt();
            int dis1 = n2-n3;
            int dis2 = n3-n1;
            int dis3 = n1-n2;
            
            if (dis1 > dis2) {
            if  (dis1>dis3){
                    System.out.println("El numero mas alejado es:" + dis1); 
                    
                    if (dis2 > dis3) {
            if  (dis2>dis1){
                    System.out.println("El numero mas alejado es:" + dis2); 
                    if (dis3 > dis2) {
            if  (dis3>dis1){
                    System.out.println("El numero mas alejado es:" + dis3); 
                    }}
            }
                    }
            }
            }
                    
            
        } else {
            

            System.out.println("");
            System.out.println("");
            System.out.println("Para volver a ejecutar ingrese 1");
        }
        if (n == 3) {
            do {
                System.out.println("Ingrese un numero binario:");
                int nbin = scanner.nextInt();
                System.out.println("El complemento de " + (nbin) + "es:");
                System.out.println(nbin);
            } while (true);

        }
    }

}
