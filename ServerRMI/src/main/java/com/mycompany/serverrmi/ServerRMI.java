package com.mycompany.serverrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {

    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            
            HelloServiceImplement helloService = new HelloServiceImplement();
            
            Naming.rebind("HelloService", helloService);
            
            System.out.println("Servidor listo y escuchando en HelloService");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
