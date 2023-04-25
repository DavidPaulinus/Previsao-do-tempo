package br.com.weatherAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.weatherAPI.model.DTO.WheaterDTO;
import br.com.weatherAPI.service.util.CoodernatesAPI;
import br.com.weatherAPI.service.util.WeatherAPI;

@Service
public class ClimaService {
	@Autowired
	private WeatherAPI api;
	@Autowired
	private CoodernatesAPI cApi;;

	public WheaterDTO getClimaLL(String latitude, String longitude) {
		return api.getClimaLL(latitude, longitude);
	}

	public List<WheaterDTO> getClimaCidade(String cidade, String key) {
		List<WheaterDTO> weather = new ArrayList<>();
		var local = cApi.getLugar(cidade, key);

		local.getData().forEach(x -> weather.add(getClimaLL(x.getLatitude().toString(), x.getLongitude().toString())));

		return weather;
	}

}
