package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * objeto que maneja los tipo de usuarios en el sistema
 * @author Ardys CPN
 * @version 1.0
 * @updated 06-nov.-2021 8:49:54 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoUsuario {

	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descripcion;

	@OneToMany(mappedBy = "tipoUsuario", cascade = CascadeType.ALL)
	private List<Usuario> usuarios = new ArrayList<>();

}//end TipoUsuario