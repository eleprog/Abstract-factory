package com.mycompany.abstract_factory;

public class CheapProcessor implements Processor 
{
    @Override
    public void PerformOperation() {
        System.out.println("Cheap processor");
    }   
}
