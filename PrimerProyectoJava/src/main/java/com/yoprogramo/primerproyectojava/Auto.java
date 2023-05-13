package com.yoprogramo.primerproyectojava;

public class Auto {
    int id;
    String patente;
    int cant_puertas;
    String color;
    boolean caja_manual;

    public Auto() {
    }

    public Auto(int id, String patente, int cant_puertas, String color, boolean caja_manual) {
        this.id = id;
        this.patente = patente;
        this.cant_puertas = cant_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
    }
    
    
    public void encender() {
        System.out.println("Estoy encendiendo");   
    }
    public void apagar() {
        System.out.println("Estoy apagando");
    }
    public void acelerar(double km) {
        System.out.println("Estoy acelerando" + km + "km");
    }
    public void frenar(double km) {
        System.out.println("Estoy frenando" + km + "km");
    }
}
