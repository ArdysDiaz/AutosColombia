package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:56 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo {

	@Id()
	private String placa;
	@Column(length = 20)
	private String color;
	@Column(length = 20)
	private String marca;
	@Column(length = 30)
	private String modelo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_registro")
	private Usuario usuario;

	@OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
	private List<Novedades> novedades = new ArrayList<>();

}//end Vehiculo