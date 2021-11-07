package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:51 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Novedades {

	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "placa_vehiculo")
	private Vehiculo vehiculo;

	private String descripcion;
	private LocalDate fechaNovedad;


}//end Novedades