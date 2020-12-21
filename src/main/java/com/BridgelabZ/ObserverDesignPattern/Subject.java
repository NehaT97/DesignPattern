package com.BridgelabZ.ObserverDesignPattern;

import java.util.List;
import java.util.ArrayList;

public class Subject implements IObservable {
	List<IObserver> observers = new ArrayList<IObserver>();

	@Override
	public void register(IObserver observer) {
		observers.add(observer);		
	}
	
	@Override
	public void unRegister(IObserver observer) {
		observers.remove(observer);
	}
	
	@Override
	public void update(Data data) {
		for(IObserver observer : observers) {
			observer.onDataReceived(data);
		}
	}

}
