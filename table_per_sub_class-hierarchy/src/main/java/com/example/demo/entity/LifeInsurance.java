package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue(value = "LIFE")

public class LifeInsurance extends Insurance{
	
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "profile")
	private String profile;
	
	public LifeInsurance(int policyNumber, String policyHolder, int age, String profile) {
		super(policyNumber, policyHolder);
		this.age = age;
		this.profile = profile;
	}
	
	
}
