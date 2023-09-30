package com.app.Akash.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	@ManyToMany
	@JoinTable(name="uroletab",
	joinColumns = @JoinColumn(name="uidfk"),
	inverseJoinColumns = @JoinColumn(name="ridfk") 
			)
	private List<Role> cobs;
	/*
	 * public User() {
	 * 
	 * }
	 */
}
