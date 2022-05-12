package com.example.demo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="shanma_speaker121")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Speaker {
	
	@Id
	@Column(name ="speaker_id")
	int id;
	
	@Column(name ="speaker_name")
	String firstname;
	
	@Column(name = "speaker_qualification")
	int qualification;

}



