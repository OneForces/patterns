package com.company.lab7.proxy;

public class Service implements ServiceInterface{
    @Override
    public void operation() {
        System.out.println( this.getClass().getSimpleName() + ": doing something special");
    }
}
