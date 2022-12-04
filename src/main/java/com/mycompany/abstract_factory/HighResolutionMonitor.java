package com.mycompany.abstract_factory;

public class HighResolutionMonitor implements Monitor
{
    @Override
    public void DisplayPicture() {
        System.out.println("High resolution monitor");
    }   
}
