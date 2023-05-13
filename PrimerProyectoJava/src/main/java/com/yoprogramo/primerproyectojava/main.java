package com.yoprogramo.primerproyectojava;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(1, "AA 1100 00", 5, "rojo", true);
        
        auto2.encender();
        auto2.acelerar(60);
        auto2.frenar(60);
        auto2.apagar();
    }
    
}
