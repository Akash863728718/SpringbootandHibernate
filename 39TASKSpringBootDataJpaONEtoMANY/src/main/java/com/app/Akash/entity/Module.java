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
@Table(name="moduletab")
public class Module {

	@Id
	@Column(name="mid")
	private Integer modId;
	@Column(name="mname")
	private String modName;
	@Column(name="mfeature")
	private String modFeature;
}
