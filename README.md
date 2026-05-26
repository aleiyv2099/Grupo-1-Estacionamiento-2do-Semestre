# Sistema de Estacionamiento — Grup01

Sistema de gestión de parqueadero desarrollado en **Java** con arquitectura orientada a objetos. Permite registrar el ingreso y salida de vehículos, calcular tarifas por tiempo y consultar el estado del estacionamiento desde la consola.

---

## Tecnologías utilizadas

[![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Apache Ant](https://img.shields.io/badge/Apache_Ant-BUILD-A81C7D?logo=apache-ant&logoColor=white)](https://ant.apache.org/)
[![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?logo=apache-netbeans-ide&logoColor=white)](https://netbeans.apache.org/)

---

## Funcionalidades

- **Ingresar vehículo** — registra placa, hora de ingreso y datos del vehículo (marca, modelo, año, color)
- **Mostrar vehículos activos** — lista todos los vehículos que aún están en el parqueadero
- **Mostrar vehículos retirados** — lista los vehículos que ya salieron
- **Buscar vehículo por placa** — muestra los datos de un vehículo específico
- **Retirar vehículo** — marca un vehículo como retirado
- **Cobrar tiempo** — calcula el costo según el tipo de vehículo y el tiempo transcurrido

---

## Tipos de vehículo y tarifas

| Tipo       | Tarifa por hora |
|------------|-----------------|
| Automóvil  | $1.75           |
| Camioneta  | $2.25           |
| Moto       | $1.00           |

---

## Estructura del proyecto

```
src/
└── grup01ayudaaaa/
    ├── Vehiculo.java          # Clase abstracta base — define contrato de vehículo
    ├── Automovil.java         # Vehículo de gasolina (tarifa $1.75/h)
    ├── Camioneta.java         # Vehículo diésel (tarifa $2.25/h)
    ├── Moto.java              # Motocicleta de gasolina (tarifa $1.00/h)
    ├── Estacionamiento.java   # Lógica de negocio del parqueadero
    └── Grup01AYUDAAAA.java    # Punto de entrada — menú de consola
```

---

## Jerarquía de clases

```
Vehiculo (abstracta)
├── Automovil   — 1.75 $/hora
├── Camioneta   — 2.25 $/hora
└── Moto        — 1.00 $/hora
```

Cada subclase implementa `mostrarDatos()` y `calcularCosto(tiempoTranscurrido)`. La tarifa por hora está definida como constante privada en cada clase (`TARIFA_POR_HORA`).

---

## Requisitos

- **Java JDK 17** o superior
- **NetBeans IDE** (para abrir y compilar el proyecto directamente)
- Sin dependencias externas — usa únicamente la biblioteca estándar de Java

---

## Instalación y ejecución

### Con NetBeans IDE
1. Clona el repositorio:
   ```bash
   git clone <url-del-repositorio>
   ```
2. Abre NetBeans → **File → Open Project** → selecciona la carpeta del proyecto.
3. Presiona **F6** o el botón ▶ para ejecutar.

### Con Ant (línea de comandos)
```bash
ant run
```

---

## Uso del menú

Al iniciar el programa se solicita la capacidad máxima del parqueadero. Luego se muestra el menú principal:

```
----- MENÚ ESTACIONAMIENTO -----
1. Ingresar vehículo
2. Mostrar vehículos activos
3. Mostrar vehículos retirados
4. Buscar vehículo por placa
5. Retirar vehículo
6. Cobrar tiempo de estacionamiento
7. Salir
```

La hora de ingreso y salida se ingresa como número decimal (por ejemplo: `8.5` = 8:30 AM). El costo se calcula como `(horaSalida - horaIngreso) × tarifaPorHora`.

---

## Autor

Proyecto desarrollado como práctica de programación orientada a objetos — Grupo 01.
