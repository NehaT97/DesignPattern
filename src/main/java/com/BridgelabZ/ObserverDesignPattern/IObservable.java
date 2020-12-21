package com.BridgelabZ.ObserverDesignPattern;

public interface IObservable {
	
	public void register(IObserver observer);
	public void unRegister(IObserver observer);
	public void update(Data data);

}
