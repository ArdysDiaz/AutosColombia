package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * se registran todos los movimientos que realiza un vehiculo con un contrato
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:50 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movimiento {

	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numero_contrato")
	private Contrato contrato;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_movimiento")
	private TipoMovimiento tipoMovimiento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_registro")
	private Usuario usuario;

	private LocalDate fechaMovimiento;

}//end Movimientos