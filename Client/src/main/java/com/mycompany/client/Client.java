package com.mycompany.client;

import shared.IHelloService; // Importa la interfaz compartida
import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            // Busca el servicio remoto registrado en el servidor
            IHelloService helloService = (IHelloService) Naming.lookup("rmi://localhost/HelloService");

            // Invoca el método remoto
            String response = helloService.sayHello("Andrés");
            System.out.println("Respuesta del servidor: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
