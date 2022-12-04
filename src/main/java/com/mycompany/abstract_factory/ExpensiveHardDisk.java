package com.mycompany.abstract_factory;

public class ExpensiveHardDisk implements HardDisk
{
    @Override
    public void StoreData() {
        System.out.println("Expensive HDD");
    }   
}
