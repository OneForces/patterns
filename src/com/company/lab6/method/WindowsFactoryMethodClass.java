package com.company.lab6.method;

public class WindowsFactoryMethodClass extends FactoryMethodClass{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
