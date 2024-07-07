package com.techlabs.statedesignpattern.test;

import com.techlabs.statedesignpattern.model.OutOfStockState;
import com.techlabs.statedesignpattern.model.PaymentPendingState;
import com.techlabs.statedesignpattern.model.ProductSelectedState;
import com.techlabs.statedesignpattern.model.ReadyState;
import com.techlabs.statedesignpattern.model.VendingMachineContext;

public class TestState {

	public static void main(String[] args) {
		VendingMachineContext vendingMachine = new VendingMachineContext();

        
        vendingMachine.setState(new ReadyState());

        
        vendingMachine.request();

       
        vendingMachine.setState(new ProductSelectedState());

        vendingMachine.request();

        
        vendingMachine.setState(new PaymentPendingState());

        
        vendingMachine.request();

        
        vendingMachine.setState(new OutOfStockState());

        
        vendingMachine.request();

	}

}
