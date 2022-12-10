package com.bank.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private String id;
	private String name;
	private String category;
	private String commission;
	@Column(name="limit_movement")
	private String limitMovement;
	private Integer port;
}
