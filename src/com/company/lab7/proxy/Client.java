package com.company.lab7.proxy;

public class Client {
    public Client() {
        Proxy proxy = new Proxy(new Service());
        proxy.operation();
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
