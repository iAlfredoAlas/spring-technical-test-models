package com.example.spring.technical.test.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user", schema = "administration")
@SQLDelete(sql = "UPDATE user SET is_active = false WHERE id_user=?")
public class User implements Serializable {

	private static final long serialVersionUID = -7134335233251280617L;

	@Id
	@GeneratedValue(generator = "user_sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", schema = "administration", allocationSize = 1)
	@Column(name = "id_user")
	private Long id;
	
	@Basic(optional = false)
	@Column(name = "rol_name")
	String rolName;
	
	@Basic(optional = false)
	@Column(name = "user_name")
	String userName;
	
	@Basic(optional = false)
	@Column(name = "name")
	String name;
	
	@Basic(optional = false)
	@Column(name = "password")
	String password;
	
	@Basic(optional = false)
	@Column(name = "email")
	String email;
	
	@Basic(optional = false)
	@Column(name = "is_active")
	Boolean isUserActive = Boolean.TRUE;
	
}
