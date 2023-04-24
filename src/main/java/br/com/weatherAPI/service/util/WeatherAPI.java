package br.com.weatherAPI.service.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.weatherAPI.model.DTO.WhaterDTO;

@FeignClient(name = "weather", url = "https://api.open-meteo.com")
public interface WeatherAPI {
	String latitude = "";
	String longitude ="";
	
	String mapping = "/v1/forecast?latitude={latitude}&longitude={longitude}&hourly=temperature_2m,relativehumidity_2m&current_weather=true";
	
	@GetMapping(mapping)
	WhaterDTO getClimaLL(@PathVariable(value = "latitude") String latitude, @PathVariable(value = "longitude") String longitude);
}
