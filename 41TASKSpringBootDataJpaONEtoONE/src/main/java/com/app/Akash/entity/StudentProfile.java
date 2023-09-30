package com.app.Akash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stdprotab")
public class StudentProfile {

	@Id
	@Column(name="stdnum")
	private Double studentNumber;
	@Column(name="stdaddr")
	private String studentAddress;
	@Column(name="stdstrm")
	private String studentStream;
	
	
	@OneToOne
	@JoinColumn(name="stdidFK")
	private Student std; // HAS-A relation
}
