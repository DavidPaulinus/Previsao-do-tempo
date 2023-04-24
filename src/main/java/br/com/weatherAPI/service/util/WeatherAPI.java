package br.com.weatherAPI.service.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.weatherAPI.model.DTO.WhaterDTO;

@FeignClient(name = "weather", url = "https://api.open-meteo.com")
public interface WeatherAPI {
	
	@GetMapping("/v1/forecast?latitude=-23.533773&longitude=-46.625290&hourly=temperature_2m,relativehumidity_2m&current_weather=true")
	WhaterDTO getClima();
}
