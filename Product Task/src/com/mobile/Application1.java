package com.mobile;

import java.util.Set;
import java.util.TreeSet;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product ram = new Product(12,"powder",90);
		Product janu = new Product(13,"soap",98);
		Product ragu = new Product(14,"shampoo",59);
		Product shanu = new Product(15,"comb",89);
		Product dhamu = new Product(16,"washing powder",90);
		
		Set<Product> map = new TreeSet<>();
		map.add(ram);
		map.add(janu);
		map.add(ragu);
		map.add(shanu);
		map.add(dhamu);
	}

}
