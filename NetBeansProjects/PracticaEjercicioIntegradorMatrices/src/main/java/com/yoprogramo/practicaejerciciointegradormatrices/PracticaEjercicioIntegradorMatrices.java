package com.yoprogramo.practicaejerciciointegradormatrices;

import java.util.Scanner;

public class PracticaEjercicioIntegradorMatrices {

    public static void main(String[] args) {
        Double matriz[][]= new Double [4][4];
        Scanner teclado = new Scanner (System.in);
        Double suma = 0.0;
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la calificación del alumno n°"+ f);
                matriz[f][c] = teclado.nextDouble();
                suma = matriz[f][c];
            }
            matriz[f][3]=  suma/3;
            suma = 0.0;
        }
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno" + f + "son:");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota n°" + c + " " + matriz[f][c]);
            }
            System.out.println("El promedio del alumno" + f + "es: " + matriz[f][3]);
        }
    }
}
