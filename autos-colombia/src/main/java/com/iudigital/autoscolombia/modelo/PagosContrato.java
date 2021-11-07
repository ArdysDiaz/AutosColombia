package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:52 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagosContrato {

	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_contrato")
	private Contrato contrato;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_medio_pago")
	private MedioPago medioPago;

	private double valor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_registra")
	private Usuario usuario;

	private LocalDate fechaPago;

}//end PagosContrato