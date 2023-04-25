package br.com.weatherAPI.service.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.weatherAPI.model.DTO.CoordenadasDTO;

@FeignClient(name = "coordenates", url = "http://api.positionstack.com/v1/")
public interface CoodernatesAPI {
	String mapping = "forward?access_key={key}&query={query}";

	@GetMapping(mapping)
	CoordenadasDTO getLugar(@PathVariable(value = "query") String query, @PathVariable(value = "key") String key);

}
