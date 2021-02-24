package com.company.lab5;
public class Singleton1 {
    private volatile Singleton1 instance;

    private Singleton1 getInstance() {
        if (instance == null) {
            return new Singleton1();
        }
        return instance;
    }

    private Singleton1() {}
}
