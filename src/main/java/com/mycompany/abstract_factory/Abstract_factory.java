package com.mycompany.abstract_factory;

public class Abstract_factory 
{
    public static void main(String[] args) 
    {
        MachineFactory factory = new HighBudgetMachine();
        ComputerShop shop = new ComputerShop(factory);
        shop.AssembleMachine();
        
        factory = new LowBudgetMachine();
        shop = new ComputerShop(factory);
        shop.AssembleMachine();
        
    }
}
