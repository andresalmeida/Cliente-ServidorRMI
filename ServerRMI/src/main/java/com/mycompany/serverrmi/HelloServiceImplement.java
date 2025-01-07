package com.mycompany.serverrmi;

import shared.IHelloService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImplement extends UnicastRemoteObject implements IHelloService{

    public HelloServiceImplement() throws RemoteException {
        super();    
    }
    
    @Override
    public String sayHello(String name) throws RemoteException{
        return "Hello, "+name+" bienvenido!";
    }
    
}
