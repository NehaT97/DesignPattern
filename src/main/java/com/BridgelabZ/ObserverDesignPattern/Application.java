package com.BridgelabZ.ObserverDesignPattern;

public class Application {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		Observer observer = new Observer();
		subject.register(observer);
		
		OtherObserver otherObserver = new OtherObserver();
		subject.register(otherObserver);
		
		ThirdObserver thirdObserver = new ThirdObserver();
		subject.register(thirdObserver);
		
		Data data = new Data();
		data.floatData = 2.5f;
		data.intData = 10;
		data.stringData = "Neha";
		
		subject.update(data);
		subject.unRegister(thirdObserver);
		subject.update(data);
		
	}

}
