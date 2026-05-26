package grup01ayudaaaa;

public abstract class Vehiculo {
    public static final String ESTADO_ACTIVO = "A";
    public static final String ESTADO_RETIRADO = "R";

    private String placa;
    private double horaIngreso;
    private String estado;

    public Vehiculo(String placa, double horaIngreso) {
        this.placa = placa;
        this.horaIngreso = horaIngreso;
        this.estado = ESTADO_ACTIVO;
    }

    public String getPlaca() {
        return placa;
    }

    public double getHoraIngreso() {
        return horaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract void mostrarDatos();

    public abstract double calcularCosto(double tiempoTranscurrido);
}
