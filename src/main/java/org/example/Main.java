package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Automovil auto = new Automovil("Toyota", 2010, 20000.0, 50, 4);
            auto.ImprimirDatos();
            auto.CargarEstanque(40);
            auto.VaciarEstanque(20);
            double impuestoAuto = auto.calcularImpuesto();
            System.out.println("Impuesto a pagar por el automóvil: " + impuestoAuto);
            auto.ModificarAño(2015);
            auto.ImprimirDatos();

            Motocicleta moto = new Motocicleta("Harley-Davidson", 2022, 15000.0, 20, 750);
            moto.ImprimirDatos();
            moto.CargarEstanque(15);
            moto.VaciarEstanque(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
 }
}