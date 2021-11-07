package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * contiene los medios de pagos que va a manejar la aplicacion.
 * 1 = efectivo
 * 2 = tarjeta debito/credito
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:49 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedioPago {
	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	@OneToMany(mappedBy = "medioPago")
	private List<PagosContrato> pagosContrato = new ArrayList<>();
}//end MedioPago