package com.company;

public class miAuto {
    public  static void main(String[] args) {
        Coche miCoche = new  Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

}

class Coche {
    public int puertas = 0;
    public void AgregarPuerta() {
        this.puertas++;
    }
}
