# Parcial Final Web - Backend

## Santiago Castro Zuluaga 

### (Readme realizado con Chat GPT)

## Descripcion
Este proyecto es el backend para el parcial final de desarrollo web. Proporciona una API REST para la gestión de entidades.

## Requisitos

- Java 17
- Maven
- H2 Database (incluida)

## Instalación

1. Clona el repositorio:
    ```bash
    git clone https://github.com/Santag207/Parcial_Final_Web_Backend.git
    cd Parcial_Final_Web_Backend
    ```

2. Compila y ejecuta el proyecto:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Endpoints

- `GET /api/entities`: Lista todas las entidades.
- `GET /api/entities/{id}`: Obtiene una entidad por ID.
- `POST /api/entities`: Crea una nueva entidad.
- `PUT /api/entities/{id}`: Actualiza una entidad existente.
- `DELETE /api/entities/{id}`: Elimina una entidad (soft delete).

## Configuración de la Base de Datos

La aplicación utiliza H2 Database en memoria. La consola H2 está disponible en:
    ```
    http://localhost:8080/h2-console
    ```

Usa las siguientes credenciales para acceder:
- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
- Password: *(dejar en blanco)*

## Notas

- Asegúrate de tener Java y Maven correctamente instalados y configurados en tu PATH.
- La aplicación se ejecuta por defecto en `http://localhost:8080`.
