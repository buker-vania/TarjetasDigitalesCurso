package com.mibanco.tarjetasdigitales.service;

import java.util.List;

import javax.jws.WebService;

import com.mibanco.tarjetasdigitales.model.Tarjeta;
import com.mibanco.tarjetasdigitales.repository.TarjetaRepository;
import com.mibanco.tarjetasdigitales.repository.TarjetaRepositoryImpl;
@WebService(endpointInterface = "com.mibanco.tarjetasdigitales.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService {

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		
		return tarjetaRepository.obtenerTodas();
	}
}
