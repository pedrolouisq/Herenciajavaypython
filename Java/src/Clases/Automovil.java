package Clases;

public class Automovil extends Vehiculo {
    String marca;
    String modelo;
    double precio;

    public Automovil(String fechaFabricacion, String numeroChasis, String numeroMotor,
                     String marca, String modelo, double precio) {
        super(fechaFabricacion, numeroChasis, numeroMotor);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarDatos() {
        System.out.println("=== Información del Automóvil ===");
        System.out.println("Fecha de fabricación: " + getFechaFabricacion());
        System.out.println("Número de chasis: " + getNumeroChasis());
        System.out.println("Número de motor: " + getNumeroMotor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
    }
}
