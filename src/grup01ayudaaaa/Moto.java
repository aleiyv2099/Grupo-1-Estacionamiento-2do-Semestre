package grup01ayudaaaa;

public class Moto extends Vehiculo {
    private static final double TARIFA_POR_HORA = 1.0;

    private String marca;
    private String modelo;
    private int anho;
    private String color;
    private int cilindrada;

    public Moto(String placa, double horaIngreso, String marca, String modelo, int anho, String color, int cilindrada) {
        super(placa, horaIngreso);
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnho() { return anho; }
    public String getColor() { return color; }
    public int getCilindrada() { return cilindrada; }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo de vehículo: Moto Gasolina");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Hora de ingreso: " + getHoraIngreso());
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anho);
        System.out.println("Color: " + color);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Estado: " + getEstado());
    }

    @Override
    public double calcularCosto(double tiempoTranscurrido) {
        return tiempoTranscurrido * TARIFA_POR_HORA;
    }
}
