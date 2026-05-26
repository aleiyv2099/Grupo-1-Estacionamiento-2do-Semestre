package grup01ayudaaaa;

import java.util.ArrayList;
import java.util.List;

public class Estacionamiento {
    private List<Vehiculo> vehiculos;
    private int capacidadMaxima;

    public Estacionamiento(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.vehiculos = new ArrayList<>();
    }

    public void ingresarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() < capacidadMaxima) {
            vehiculos.add(vehiculo);
            System.out.println("Vehículo ingresado correctamente.");
        } else {
            System.out.println("El estacionamiento está lleno. No se puede ingresar el vehículo.");
        }
    }

    public void mostrarVehiculosActivos() {
        boolean hayActivos = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getEstado().equals(Vehiculo.ESTADO_ACTIVO)) {
                if (!hayActivos) {
                    System.out.println("Vehículos activos en el estacionamiento:");
                    hayActivos = true;
                }
                vehiculo.mostrarDatos();
                System.out.println("------------------------------");
            }
        }
        if (!hayActivos) {
            System.out.println("No hay vehículos activos en el estacionamiento.");
        }
    }

    public void mostrarVehiculosRetirados() {
        boolean hayRetirados = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getEstado().equals(Vehiculo.ESTADO_RETIRADO)) {
                if (!hayRetirados) {
                    System.out.println("Vehículos retirados del estacionamiento:");
                    hayRetirados = true;
                }
                vehiculo.mostrarDatos();
                System.out.println("------------------------------");
            }
        }
        if (!hayRetirados) {
            System.out.println("No hay vehículos retirados del estacionamiento.");
        }
    }

    public void buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                vehiculo.mostrarDatos();
                return;
            }
        }
        System.out.println("No se encontró ningún vehículo con la placa especificada.");
    }

    public void retirarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                if (vehiculo.getEstado().equals(Vehiculo.ESTADO_RETIRADO)) {
                    System.out.println("El vehículo ya fue retirado anteriormente.");
                    return;
                }
                vehiculo.setEstado(Vehiculo.ESTADO_RETIRADO);
                vehiculo.mostrarDatos();
                System.out.println("Vehículo retirado del estacionamiento.");
                return;
            }
        }
        System.out.println("No se encontró ningún vehículo con la placa especificada.");
    }

    public double cobrarTiempo(String placa, double horaSalida) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                double tiempoTranscurrido = horaSalida - vehiculo.getHoraIngreso();
                return vehiculo.calcularCosto(tiempoTranscurrido);
            }
        }
        System.out.println("No se encontró ningún vehículo con la placa especificada.");
        return 0.0;
    }
}
