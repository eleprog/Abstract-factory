package com.mycompany.abstract_factory;

public abstract class MachineFactory 
{
    public abstract Processor GetProcessor();
    public abstract HardDisk GetHardDisk();
    public abstract Monitor GetMonitor();
}
