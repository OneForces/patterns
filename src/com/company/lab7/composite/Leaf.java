package com.company.lab7.composite;

public class Leaf implements Component {
    @Override
    public void execute() {
        System.out.println("Breaking and going nowhere");
    }
}
