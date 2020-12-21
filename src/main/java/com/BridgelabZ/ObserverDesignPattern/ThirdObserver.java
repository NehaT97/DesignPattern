package com.BridgelabZ.ObserverDesignPattern;

public class ThirdObserver implements IObserver {

	@Override
	public void onDataReceived(Data data) {
		System.out.println("Third Observer receiving data from Subject " + data);	
		
	}

}
