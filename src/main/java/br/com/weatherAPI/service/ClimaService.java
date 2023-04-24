package br.com.weatherAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.weatherAPI.model.DTO.WhaterDTO;
import br.com.weatherAPI.service.util.WeatherAPI;

@Service
public class ClimaService {
	@Autowired
	private WeatherAPI api;

	public WhaterDTO getClimaLL(String latitude, String longitude) {
		return api.getClimaLL(latitude, longitude);
	}
	
}
