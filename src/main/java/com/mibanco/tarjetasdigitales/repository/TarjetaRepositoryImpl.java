package com.mibanco.tarjetasdigitales.repository;

import java.util.ArrayList;
import java.util.List;

import com.mibanco.tarjetasdigitales.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository {

	private static List<Tarjeta> tarjetasDigitales = 
			new ArrayList<Tarjeta>();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println("Crear tarjeta:::::");
		tarjetasDigitales.add(tarjeta);
		return null;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		System.out.println("::: Obtener todas las tarjetas");
	return tarjetasDigitales;
	}

}
