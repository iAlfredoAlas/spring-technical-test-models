package com.example.spring.technical.test.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.example.spring.technical.test.models.utils.PaymentMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "payment", schema = "shopping")
public class Payment implements Serializable {

	private static final long serialVersionUID = -3647983985609859322L;

	@Id
	@GeneratedValue(generator = "payment_sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "payment_sequence", sequenceName = "payment_sequence", schema = "shopping", allocationSize = 1)
	@Column(name = "id_payment")
	private Long id;
	
	@Basic(optional = false)	
	@Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;
	
	@Basic(optional = false)
	@Column(name = "total_amount")
	private BigDecimal totalAmount;
	
	@Basic(optional = false)
	@Column(name = "payment_date")
	private LocalDate paymentDate;
	
}
