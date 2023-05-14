package com.yoprogramo.practicaejerciciointegrador1;

import java.util.Scanner;

public class PracticaEjercicioIntegrador1 {

    public static void main(String[] args) {
        int vector[] = new int [15];
        
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese un número");
            vector[i]= teclado.nextInt();
        }
        int cont=0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] ==3) {
              cont = cont + 1;  
            }
        }
        System.out.println("La cantidad de números 3 es " + cont);
    }
}
