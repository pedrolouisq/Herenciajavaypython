package Clases;

public class Vehiculo {
    String fechaFabricacion;
    String numeroChasis;
    String numeroMotor;

    public Vehiculo(String fechaFabricacion, String numeroChasis, String numeroMotor) {
        this.fechaFabricacion = fechaFabricacion;
        this.numeroChasis = numeroChasis;
        this.numeroMotor = numeroMotor;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }
}
