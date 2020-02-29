package com.mibanco.tarjetasdigitales.repository;

import java.util.List;

import com.mibanco.tarjetasdigitales.model.Tarjeta;

public interface TarjetaRepository {
	/**
	 * Metodo para crear una tarjeta nueva
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	/**
	 * Metodo para obtener todas las tarjetas
	 * @return
	 */
	List<Tarjeta> obtenerTodas();

}
