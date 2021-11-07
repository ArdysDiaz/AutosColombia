package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 1 = Activo
 * 2 = Inactivo
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:48 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estado {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descripcion;

}//end Estados