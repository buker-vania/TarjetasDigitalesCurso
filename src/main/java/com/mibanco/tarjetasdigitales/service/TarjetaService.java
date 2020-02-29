package com.mibanco.tarjetasdigitales.service;

import java.util.List;

import javax.jws.WebService;

import com.mibanco.tarjetasdigitales.model.Tarjeta;
@WebService
public interface TarjetaService {
	
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
