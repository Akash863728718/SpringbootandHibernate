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
@Table(name="stndtab")
public class Student {

	@Id
	@Column(name="stdId")
	private String StudentId;
	@Column(name="stdname")
	private String studentName;
	@Column(name="stdbranch")
	private String studentBranch;
	
	
	
	
}
