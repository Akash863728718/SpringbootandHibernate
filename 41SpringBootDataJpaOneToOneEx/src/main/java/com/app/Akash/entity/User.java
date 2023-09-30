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
@Table(name="usertab")
public class User {

	@Id
	@Column(name="uid")
	private Integer userId;
	
	@Column(name="uname")
	private String userName;
	
	@Column(name="upwd")
	private String userPwd;
	
	/*
	@ManyToOne
	@JoinColumn(name="pidFk",unique=true)
	private Profile pob; 
	*/
	
	@OneToOne
	@JoinColumn(name="pidFK")
	private Profile pob; // HAS-A relation
}
