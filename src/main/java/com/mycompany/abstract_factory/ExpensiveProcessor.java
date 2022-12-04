package com.mycompany.abstract_factory;

public class ExpensiveProcessor implements Processor
{
    @Override
    public void PerformOperation() {
        System.out.println("Expensive processor");
    }   
}
