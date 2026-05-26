package grup01ayudaaaa;

public class Automovil extends Vehiculo {
    private static final double TARIFA_POR_HORA = 1.75;

    private String marca;
    private String modelo;
    private int anho;
    private String color;

    public Automovil(String placa, double horaIngreso, String marca, String modelo, int anho, String color) {
        super(placa, horaIngreso);
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.color = color;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnho() { return anho; }
    public String getColor() { return color; }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo de vehículo: Automóvil Gasolina");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Hora de ingreso: " + getHoraIngreso());
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anho);
        System.out.println("Color: " + color);
        System.out.println("Estado: " + getEstado());
    }

    @Override
    public double calcularCosto(double tiempoTranscurrido) {
        return tiempoTranscurrido * TARIFA_POR_HORA;
    }
}
