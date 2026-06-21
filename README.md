#  Sistema Distribuido de Gestión articulos de aseo

##  Descripción General

Este proyecto corresponde al desarrollo de un sistema distribuido basado en una arquitectura de microservicios, implementado utilizando **Spring Boot**, **Spring Data JPA** y **MySQL**.

---

##  Integrantes del Equipo

- **Matías Contreras** – Desarrollo Backend y Diseño de Arquitectura.
- **Krishna Contreras** – Desarrollo Backend
---

## Arquitectura del Sistema

###  Servicio de Finanzas (`service_finanzas`)

**Objetivo:** Gestionar los recursos económicos de la organización.

###  Servicio de Inventario (`service_inventario`)

**Objetivo:** Administrar el stock de productos y controlar su distribución en bodegas.

###  Servicio de Promociones (`service_promociones`)

**Objetivo:** Gestionar descuentos, promociones y programas de fidelización.

###  Servicio de Soporte (`service_soportes`)

**Objetivo:** Gestionar incidencias técnicas y solicitudes de soporte.

###  Servicio de Proveedores (`service_proveedores`)

**Objetivo:** Administrar la relación con proveedores y el abastecimiento de productos.

### Servicio de Ventas (`service_ventas`)

**Objetivo:** Gestionar el proceso de venta y los métodos de pago.

---

## Tecnologías Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- MySQL
- Postman
- Visual Studio Code

---

##  Estructura Requerida para Cada Microservicio

### 1. `pom.xml`

Incluye dependencias de:

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- MySQL Driver
- Spring Boot Starter Validation
- Lombok

### 2. `application.properties`

Contiene:

- Puerto de ejecución.
- Configuración de base de datos.


### 3. `script.sql`

Contiene:

- Estructura de tablas (DDL).
- Datos iniciales (DML).
- Scripts de prueba.

---

## Instrucciones de Ejecución

1. Ejecutar MySQL.
2. Crear las bases de datos necesarias.
3. Abrir el proyecto en Visual Studio Code.
4. Actualizar dependencias Maven.
5. Verificar los archivos `application.properties`.
6. Ejecutar cada clase `Application.java`.
7. Probar los endpoints utilizando Postman.

---

##  Resultado Esperado

Cada microservicio se ejecutará de forma independiente exponiendo sus endpoints REST y permitiendo realizar operaciones CRUD sobre las entidades del sistema
