package com.training;
import com.training.utils.ObjectFactory;
import com.training.ifaces.Conditional;
import com.training.model.NewObjectFactory;

public class Application {

	public static void main(String[] args) {
		ObjectFactory factory = new NewObjectFactory();
		Conditional profObj =factory.getConditional(1);
		Conditional studObj =factory.getConditional(2);
		Conditional principalObj =factory.getConditional(3);
		
		System.out.println("Allowance:=" +factory.getValue(profObj,"chennai"));
		System.out.println("Allowance:=" +factory.getValue(studObj,"30"));
		System.out.println("Allowance:=" +factory.getValue(principalObj,"engg"));
		System.out.println("Allowance:=" +factory.getValue(principalObj,"rural"));
		
	}

}