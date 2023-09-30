package com.app.Akash.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="projecttab")
public class Project {

	@Id
	@Column(name="proid")
	private Integer projectId;
	
	@Column(name="proname")
	private String projectName;
	
	@Column(name="proadmin")
	private String projectAdmin;
	
	@OneToMany
	@JoinColumn(name="modIdFK")
	private List< Module> pob; //HAS-A relation
}
