package com.training;
import com.training.model.Insurance;
import com.training.model.VechileInsurance;
import com.training.model.LifeInsurance;
import com.training.model.HealthInsurance1;

public class Application {
	public static void printPremium(Insurance object) {
		System.out.println("Premium="+object.calculatePremium());
	}
	
	
		

	public static void main(String[] args) {
		
		VechileInsurance car = new VechileInsurance (1010,"ramesh","car",2019);
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(2020,"shalini",45);
		printPremium(life);
		
		String[] illness = {"bp","sugar","ent","thyroid"};
		HealthInsurance1 health = new HealthInsurance1(3030,"viky",illness);
		printPremium(health);
	

}
}