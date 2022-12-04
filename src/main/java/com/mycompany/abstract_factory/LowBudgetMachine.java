package com.mycompany.abstract_factory;

public class LowBudgetMachine extends MachineFactory 
{
    @Override
    public Processor GetProcessor() {
        return new CheapProcessor();
    }

    @Override
    public HardDisk GetHardDisk() {
        return new CheapHardDisk();
    }

    @Override
    public Monitor GetMonitor() {
        return new LowResolutionMonitor();
    }  
}
