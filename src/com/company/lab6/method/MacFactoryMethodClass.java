package com.company.lab6.method;

public class MacFactoryMethodClass extends FactoryMethodClass{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
