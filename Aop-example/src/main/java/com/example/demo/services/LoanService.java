package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class LoanService {
	
	public double getInterestRate(int value) {
		if (value > 9000) {
			return 6.7;
		}else {
		
		return 4.5;
	}
	}
}
