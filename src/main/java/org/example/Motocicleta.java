package org.example;

public class Motocicleta extends Vehiculo{
    private int cilindrada;
    public Motocicleta(String marca, int año, double precio, int capacidadEstanque, int cilindrada) {
        super(marca, año, precio, capacidadEstanque);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public void ImprimirDatos() {
    }
    @Override
    public void VaciarEstanque(int litros){
}
}