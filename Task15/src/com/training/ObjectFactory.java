package com.training;

public class ObjectFactory {
	public Automobile getObject(int key) {
		switch (key) {
		case 1:
			
			return new MarutiCar();
		case 2:
		    return new ToyotaCar();

		default:
			return null;
		}
		
	}
	public void printQuote(Automobile poly) {
		System.out.println("carcolor:"+poly.getColor());
		System.out.println("model:"+poly.getModel());
		System.out.println("price:"+poly.getPrice());
		System.out.println("showroomname :"+poly.showroomname());
	}

}
