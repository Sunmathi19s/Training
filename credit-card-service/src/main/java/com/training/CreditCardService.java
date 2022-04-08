package com.training;

import java.util.Arrays;

public class CreditCardService<cardNumber> {
 private 	CreditCard[] cards;
 int i=0;
public char[] addCard;
	
	public CreditCardService() {
		super();
		this.cards = new CreditCard[5];
		// TODO Auto-generated constructor stub
	}
	
	public boolean addCard(CreditCard card) {
		boolean flag = false;
		if (i<5) {
			this.cards[i]=card;
			i++;
			flag = true;
		}
		
		return flag;
	}

	public CreditCard[] getCards() {
		return this.cards;
	}
	@Override
	public String toString() {
		return "CreditCardService [getCards()=" + Arrays.toString(getCards()) + "]";
	}

}
