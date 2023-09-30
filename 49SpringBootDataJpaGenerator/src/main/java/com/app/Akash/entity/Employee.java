package com.app.Akash.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(generator ="testgen")
	@GenericGenerator(name="testgen",strategy="com.app.Akash.generator.MyCustGen")
	@Column(name="eid")
	private String empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="esal")
	private Double empSal;
	
	@Column(name="edept")
	private String empDept;

}
