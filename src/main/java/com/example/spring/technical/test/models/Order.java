package com.example.spring.technical.test.models;

import java.io.Serializable;
import java.time.LocalDate;

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
@Table(name = "order", schema = "shopping")
public class Order implements Serializable {

	private static final long serialVersionUID = -5807410317152821683L;

	@Id
	@GeneratedValue(generator = "order_sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", schema = "shopping", allocationSize = 1)
	@Column(name = "id_order")
	private Long id;

	@Basic(optional = false)
	@Column(name = "order_date")
	private LocalDate orderDate;

	@Basic(optional = false)
	@Column(name = "is_active")
	private Boolean isOrderActive = Boolean.TRUE;

	@JoinColumn(name = "id", referencedColumnName = "id_user", foreignKey = @ForeignKey(name = "FK_order_user"))
	@ManyToOne(optional = false, targetEntity = User.class)
	private User idUser;

	@JoinColumn(name = "id", referencedColumnName = "id_payment", foreignKey = @ForeignKey(name = "FK_order_payment"))
	@ManyToOne(optional = false, targetEntity = Payment.class)
	private Payment idPayment;

}
