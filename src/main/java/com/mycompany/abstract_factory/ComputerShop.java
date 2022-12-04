package com.mycompany.abstract_factory;

public class ComputerShop 
{
    MachineFactory category;
    
    ComputerShop(MachineFactory ctgr) {
        category = ctgr;
    }
    
    public void AssembleMachine() 
    {
        Processor cpu = category.GetProcessor();
        HardDisk hdd = category.GetHardDisk();
        Monitor monitor = category.GetMonitor();
        
        cpu.PerformOperation();
        hdd.StoreData();
        monitor.DisplayPicture();
    }
}
