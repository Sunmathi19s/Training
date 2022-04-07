package com.training.model;

import com.training.ifaces.Conditional;
import com.training.utils.ObjectFactory;

public class NewObjectFactory extends ObjectFactory {
	

	@Override
	public Conditional getConditional(int key) {
		
		Conditional obj = null;
		
		if(key==3) {
			obj = new Prinicipal("engg");
		}else {
			obj=super.getConditional(key);
		}
		// TODO Auto-generated method stub
		return obj;
	}

}
