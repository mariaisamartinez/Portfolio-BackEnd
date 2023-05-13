package com.yoprogramo.ejemplo;

public class Ejemplo {

    public static void main(String[] args) {
       Vehiculo vehiculo1 = new Vehiculo(2548, 4, "Renno", "Indefinido");
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(25, "AI 1521 25", 5, "rojo", true, 2558, 4, "chevrolet", "cruze");
        Moto moto1= new Moto(150, 2550, 2, "Yamaha", "YBR125");
        Camion camion1 = new Camion(8, true, 5260, 16, "Scania", "Optimus");
        
        Vehiculo vector[] = new Vehiculo[4];
        vector[0]= vehiculo1;
        vector[1]= auto1;
        vector[2]= moto1;
        vector[3]= camion1;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Registro Nº" + i + vector[i].getMarca());
        }
        
        
        
        
        /*System.out.println(auto2.toString());
        System.out.println(auto1.toString());
                
        
        auto2.encender();
        auto2.acelerar(60);
        auto2.frenar(60);
        auto2.apagar();
        
        System.out.println("El valor de mi id es" + auto2.getId());
        auto2.setId(3500);
        System.out.println("El nuevo valor de mi id es " + auto2.getId());
        
        System.out.println("El id del auto 1 es " + auto1.getId());
        System.out.println("El color del auto 1 es" + auto1.getColor());
        
        auto1.setColor("rojo");
        auto1.setPatente("AS 1452 11");
        auto1.setCaja_manual(true);
        auto1.setCant_puertas(3);
        auto1.setId(12574);
        
        System.out.println("El nuevo id del auto 1 es " + auto1.getId());
        System.out.println("El nuevo color del auto 1 es" + auto1.getColor());*/

    }
}
