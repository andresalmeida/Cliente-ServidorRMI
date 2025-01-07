# Proyecto RMI en Java: Client-Server Hello Service

Este proyecto implementa una aplicación cliente-servidor utilizando Java RMI (Remote Method Invocation). El cliente se conecta a un servidor remoto y realiza una llamada al método `sayHello` para recibir un saludo personalizado.

## Descripción

El servidor ofrece un servicio remoto que permite que los clientes invocan el método `sayHello` pasando un nombre como parámetro. El servidor responde con un saludo personalizado con el nombre recibido.

### Componentes del Proyecto:

- **Cliente**: Se conecta al servidor RMI para invocar el método remoto.
- **Servidor RMI**: Proporciona el servicio remoto y responde a las solicitudes del cliente.
- **Interfaz compartida**: Define el contrato entre el cliente y el servidor, especificando el método remoto disponible.

## Estructura del Proyecto

- **Cliente**:
  - `Client.java`: El archivo principal que ejecuta el cliente, se conecta al servidor y llama al método remoto `sayHello`.
  - **shared**:
    - `IHelloService.java`: La interfaz remota que define el contrato de los métodos disponibles para el cliente y el servidor.

- **Servidor**:
  - `HelloServiceImplement.java`: Implementa la interfaz remota `IHelloService` y proporciona la funcionalidad del servicio remoto.
  - `ServerRMI.java`: El archivo principal que configura el servidor RMI, registra el servicio remoto y espera las solicitudes de los clientes.

## Requisitos

Para ejecutar este proyecto, necesitas tener lo siguiente:

- **Java 17 o superior**.
- **Apache NetBeans** o cualquier IDE compatible con proyectos Java.
- **JDK instalado** y configurado en tu máquina.

## Instrucciones de Uso

1. **Configura el servidor**:
   - Abre y ejecuta `ServerRMI.java` en tu entorno de desarrollo. El servidor escuchará en el puerto 1099 para recibir solicitudes.
   
   ```bash
   java com.mycompany.serverrmi.ServerRMI
   ```
2. **Configura el cliente**:
   - Abre y ejecuta `Client.java`. Este se conectará al servidor en `rmi://localhost/HelloService` y llamará al método `sayHello`.
     
   ```bash
   java com.mycompany.client.Client
   ```
3. **Resultado esperado**:
   - Cuando el cliente se ejecute correctamente, debería ver un mensaje similar a este en la consola:
     
   ```bash
   Respuesta del servidor: Hello, Andrés bienvenido!
   ```
## Puertos

El servidor RMI está configurado para escuchar en el puerto 1099 por defecto. Puedes verificar que está corriendo con el siguiente comando en tu terminal:

```bash
lsof -i :1099
```
## Posibles Errores
  - **Problema de Conexión**: Si el cliente no puede conectarse al servidor, asegúrate de que el servidor está corriendo en el puerto correcto y que no hay ningún firewall bloqueando la conexión.
  - `java.rmi.ConnectException`: Asegúrate de que tanto el cliente como el servidor estén usando la misma interfaz IHelloService.

## Licencia
Este proyecto está licenciado bajo la licencia MIT.

¡Gracias por revisar este proyecto! Si tienes alguna pregunta o sugerencia, no dudes en abrir un **Issue** o **Pull Request**.
