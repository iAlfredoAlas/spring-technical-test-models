package com.example.spring.technical.test.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "order_detail", schema = "shopping")
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = -951036318238488003L;

	@Id
	@GeneratedValue(generator = "order_detail_sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "order_detail_sequence", sequenceName = "order_detail_sequence", schema = "shopping", allocationSize = 1)
	@Column(name = "id_order_detail")
	private Long id;
	
	@Basic(optional = false)
	@Column(name = "quantity")
	private int quantity;
	
	@Basic(optional = false)
	@Column(name = "price")
	private BigDecimal price;
	
	@Basic(optional = false)
	@Column(name = "id_product")
	private Integer idProduct;
	
	@Basic(optional = false)
	@Column(name = "name_product")
	private String nameProduct;
	
	@Basic(optional = false)
	@Column(name = "description_product")
	private String descriptionProduct;
	
	@Basic(optional = false)
	@Column(name = "product_image")
	private String productImage;
	
	@JoinColumn(name = "id", referencedColumnName = "id_order", foreignKey = @ForeignKey(name = "FK_order_detail_order"))
	@ManyToOne(optional = false, targetEntity = Order.class)
	private Order idOrder;
	
}
