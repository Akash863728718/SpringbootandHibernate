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
@Table(name="prodtab1")
public class Product {
	
	@Id
	@Column(name="pid")
 private Integer prodId;
	
	@Column(name="pcode")
 private String prodCode;
	
	@Column(name="pcost")
 private Double prodCost;
	
}
