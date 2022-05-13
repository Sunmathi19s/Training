package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
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
@Table(name = "shanma_Insurance_Master")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "insurance_type",length =10,
                   discriminatorType = DiscriminatorType.STRING)

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
