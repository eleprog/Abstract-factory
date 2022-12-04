package com.mycompany.abstract_factory;

public class HighBudgetMachine extends MachineFactory 
{
    @Override
    public Processor GetProcessor() {
        return new ExpensiveProcessor();
    }

    @Override
    public HardDisk GetHardDisk() {
        return new ExpensiveHardDisk();
    }

    @Override
    public Monitor GetMonitor() {
        return new HighResolutionMonitor();
    }
}
