package com.app.Akash.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prodtabs")
public class Product {

	@Id
	@Column(name="pib")
	private Integer prodId;
	@Column(name="pcode")
	private String prodCode;
	@Column(name="pcost")
	private Double prodCast;
	
	@Column(name="pimg",length=100000)
	@Lob @Basic(fetch = FetchType.LAZY)
	private byte[] prodImg;
	
	@Lob //CLOB
	@Column(name="pdsc")
	private char[] prodDesc;
	
	
}
