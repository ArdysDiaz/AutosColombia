package com.iudigital.autoscolombia.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:55 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne
	@JoinColumn(name = "dni_tercero")
	private Tercero tercero;

	@JsonIgnore
	private String password;
	
	private String user;

	@OneToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_usuario")
	private TipoUsuario tipoUsuario;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Vehiculo> vehiculos = new ArrayList<>();

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Movimiento> movimientos = new ArrayList<>();

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<PagosContrato> pagosContratos = new ArrayList<>();

}//end Usuario