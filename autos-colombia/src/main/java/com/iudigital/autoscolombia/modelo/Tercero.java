package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:53 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tercero {

	@Id()
	private long dni;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private LocalDate fechaNacimiento;

}//end Tercero