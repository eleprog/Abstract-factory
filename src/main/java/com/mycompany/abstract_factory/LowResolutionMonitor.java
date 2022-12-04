package com.mycompany.abstract_factory;

public class LowResolutionMonitor implements Monitor
{
    @Override
    public void DisplayPicture() {
        System.out.println("Low resolution monitor");
    }
    
}
