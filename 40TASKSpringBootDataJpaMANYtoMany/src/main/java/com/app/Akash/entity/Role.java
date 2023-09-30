package com.app.Akash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="rtab")
public class Role {

	@Id
	@Column(name="radmin")
	private String roleAdmin;
	
	@Column(name="rclerk")
	private String roleClerk;
	
	@Column(name="racc")
	private String roleAcc;
}
