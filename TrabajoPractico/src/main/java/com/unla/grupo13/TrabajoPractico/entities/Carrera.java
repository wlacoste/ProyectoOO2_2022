package com.unla.grupo13.TrabajoPractico.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor 
@Entity
@Table(name = "carrera")
public class Carrera extends EntityBase{
	
	@Column (name="nombre")
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departamento_id", nullable = false)
	private Departamento departamento;
	
	public Carrera(boolean softDelete, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion,String nombre, Departamento departamento) {
		super(softDelete, fechaCreacion, fechaModificacion);
		// TODO Auto-generated constructor stub
		
		this.nombre=nombre;
		this.departamento=departamento;
	}
	
		
}
