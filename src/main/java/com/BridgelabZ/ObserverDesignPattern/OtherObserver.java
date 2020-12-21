package com.BridgelabZ.ObserverDesignPattern;

public class OtherObserver implements IObserver{

	public void onDataReceived(Data data) {
		System.out.println("Other Observer receiving data from Subject " +data);	
		
	}
}
