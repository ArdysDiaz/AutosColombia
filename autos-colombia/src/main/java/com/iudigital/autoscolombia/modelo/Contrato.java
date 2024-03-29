package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:47 a. m.
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Contrato {


	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroContrato;

	@OneToOne
	@JoinColumn(name = "placa_vehiculo")
	private Vehiculo vehiculo;

	@OneToOne
	@JoinColumn(name = "id_celda")
	private Celda celda;

	@OneToOne
	@JoinColumn(name = "id_usuario_registro")
	private Usuario usuario;

	private LocalDate fechaInicio;
	private LocalDate fechaTerminacion;

	@OneToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;

	@OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
	private List<Movimiento> movimientos = new ArrayList<>();

	@OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
	private List<PagosContrato> pagosContrato = new ArrayList<>();

}//end Contrato