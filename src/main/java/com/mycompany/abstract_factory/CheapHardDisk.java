package com.mycompany.abstract_factory;

public class CheapHardDisk implements HardDisk
{
    @Override
    public void StoreData() {
        System.out.println("Cheap HDD");
    }   
}
