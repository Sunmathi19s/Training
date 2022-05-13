package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "shanma_Insurance")
@Inheritance(strategy = InheritanceType.JOINED)

@Getter
@Setter
@ToString

@AllArgsConstructor
@NoArgsConstructor

public class Insurance {
	
	@Id
	@Column(name = "policy_Number")
	private int policyNumber;
	
	@Column(name = "policy_Holder_name",length = 30,nullable = false)
	private String policyHolder;


}
