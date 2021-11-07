package com.iudigital.autoscolombia.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 1 = Entrada
 * 2 = Salida
 * @author Ardys CPN
 * @version 1.0
 * @created 06-nov.-2021 8:49:54 a. m.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoMovimiento {

	@Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descripcion;

	@OneToMany(mappedBy = "tipoMovimiento")
	private List<Movimiento> movimientos = new ArrayList<>();
}//end TipoMovimiento