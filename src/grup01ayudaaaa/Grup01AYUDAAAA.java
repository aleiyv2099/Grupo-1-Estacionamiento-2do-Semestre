package grup01ayudaaaa;

import java.util.Scanner;

public class Grup01AYUDAAAA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad máxima del estacionamiento: ");
        int capacidadMaxima = scanner.nextInt();
        Estacionamiento estacionamiento = new Estacionamiento(capacidadMaxima);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    ingresarVehiculo(scanner, estacionamiento);
                    break;
                case 2:
                    estacionamiento.mostrarVehiculosActivos();
                    break;
                case 3:
                    estacionamiento.mostrarVehiculosRetirados();
                    break;
                case 4:
                    buscarVehiculo(scanner, estacionamiento);
                    break;
                case 5:
                    retirarVehiculo(scanner, estacionamiento);
                    break;
                case 6:
                    cobrarTiempo(scanner, estacionamiento);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n----- MENÚ ESTACIONAMIENTO -----");
        System.out.println("1. Ingresar vehículo");
        System.out.println("2. Mostrar vehículos activos");
        System.out.println("3. Mostrar vehículos retirados");
        System.out.println("4. Buscar vehículo por placa");
        System.out.println("5. Retirar vehículo");
        System.out.println("6. Cobrar tiempo de estacionamiento");
        System.out.println("7. Salir");
        System.out.print("Ingrese la opción deseada: ");
    }

    private static void ingresarVehiculo(Scanner scanner, Estacionamiento estacionamiento) {
        System.out.println("Ingrese los datos del vehículo:");
        System.out.print("Placa: ");
        String placa = scanner.next();
        System.out.print("Hora de ingreso: ");
        double horaIngreso = scanner.nextDouble();
        System.out.print("Tipo de vehículo (1: Automóvil, 2: Camioneta, 3: Moto): ");
        int tipoVehiculo = scanner.nextInt();

        Vehiculo vehiculo;
        switch (tipoVehiculo) {
            case 1:
                vehiculo = crearAutomovil(scanner, placa, horaIngreso);
                break;
            case 2:
                vehiculo = crearCamioneta(scanner, placa, horaIngreso);
                break;
            case 3:
                vehiculo = crearMoto(scanner, placa, horaIngreso);
                break;
            default:
                System.out.println("Opción inválida. No se ingresó ningún vehículo.");
                return;
        }

        estacionamiento.ingresarVehiculo(vehiculo);
    }

    private static Automovil crearAutomovil(Scanner scanner, String placa, double horaIngreso) {
        System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Modelo: ");
        String modelo = scanner.next();
        System.out.print("Año: ");
        int anho = scanner.nextInt();
        System.out.print("Color: ");
        String color = scanner.next();
        return new Automovil(placa, horaIngreso, marca, modelo, anho, color);
    }

    private static Camioneta crearCamioneta(Scanner scanner, String placa, double horaIngreso) {
        System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Modelo: ");
        String modelo = scanner.next();
        System.out.print("Año: ");
        int anho = scanner.nextInt();
        System.out.print("Color: ");
        String color = scanner.next();
        return new Camioneta(placa, horaIngreso, marca, modelo, anho, color);
    }

    private static Moto crearMoto(Scanner scanner, String placa, double horaIngreso) {
        System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Modelo: ");
        String modelo = scanner.next();
        System.out.print("Año: ");
        int anho = scanner.nextInt();
        System.out.print("Color: ");
        String color = scanner.next();
        System.out.print("Cilindrada (cc): ");
        int cilindrada = scanner.nextInt();
        return new Moto(placa, horaIngreso, marca, modelo, anho, color, cilindrada);
    }

    private static void buscarVehiculo(Scanner scanner, Estacionamiento estacionamiento) {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.next();
        estacionamiento.buscarVehiculo(placa);
    }

    private static void retirarVehiculo(Scanner scanner, Estacionamiento estacionamiento) {
        System.out.print("Ingrese la placa del vehículo a retirar: ");
        String placa = scanner.next();
        estacionamiento.retirarVehiculo(placa);
    }

    private static void cobrarTiempo(Scanner scanner, Estacionamiento estacionamiento) {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.next();
        System.out.print("Ingrese la hora de salida: ");
        double horaSalida = scanner.nextDouble();
        double costo = estacionamiento.cobrarTiempo(placa, horaSalida);
        if (costo > 0.0) {
            System.out.println("El costo por el tiempo de estacionamiento es: $" + costo);
        }
    }
}
