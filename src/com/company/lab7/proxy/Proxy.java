package com.company.lab7.proxy;

import java.util.Scanner;

public class Proxy implements ServiceInterface{
    private final Service service;
    private final int accessCode = 90359328;


    public Proxy(Service service) {
        this.service = service;
    }

    public boolean checkAccess(int accessCode) {
        return accessCode == this.accessCode;
    }

    @Override
    public void operation() {
        if (checkAccess(requestAccessCode()))
            service.operation();
        else
            System.err.println("Wrong access code!");
    }

    public int requestAccessCode() {
        System.out.print("Enter the access code: ");
        return new Scanner(System.in).nextInt();
    }
}
