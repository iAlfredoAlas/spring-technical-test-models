package com.example.spring.technical.test.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "rol", schema = "administration")
@SQLDelete(sql = "UPDATE rol SET is_active = false WHERE id_rol=?")
public class Rol implements Serializable{

	private static final long serialVersionUID = 1304964625843656456L;
	
	@Id
	@GeneratedValue(generator = "rol_sequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "rol_sequence", sequenceName = "rol_sequence", schema = "administration", allocationSize = 1)
	@Column(name = "id_rol")
	private Long id;
	
	@Basic(optional = false)
	@Column(name = "rol_name")
	private String rolName;
	
	@Basic(optional = false)
	@Column(name = "is_active")
	private Boolean isRolActive = Boolean.TRUE;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "rolList", fetch = FetchType.EAGER)
    private List<User> userList = new ArrayList<>();

}
