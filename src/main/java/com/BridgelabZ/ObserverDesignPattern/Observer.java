package com.BridgelabZ.ObserverDesignPattern;

public class Observer implements IObserver{

	public void onDataReceived(Data data) {
		System.out.println("Data Received From Subject " + data);	
	}
}
