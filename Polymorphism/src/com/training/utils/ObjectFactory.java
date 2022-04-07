package com.training.utils;
import com.training.ifaces.*;

public class ObjectFactory {
	
	public Conditional getConditional(int key) {
		switch(key)
 {
		case 1:
			return new Professsor("phd");
		case 2:
			return new Student(89);
			default:
				return null;
		}
	}
	public double getValue(Conditional obj,Object value) {
		
		//here poly reference type is conditional but objects
		//are Student or professor or principal
		// at runtime test method in the respective objects is called
		//hence run time polumorphism
		
		boolean result = obj.test(value);
		double travelAllowance=1000;
		if(result) {
			travelAllowance=2000;
		}
		return travelAllowance;
		}
		
	}