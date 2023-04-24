package br.com.weatherAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.weatherAPI.model.DTO.WhaterDTO;
import br.com.weatherAPI.service.ClimaService;

@RestController
@RequestMapping("/tempo")
public class WeatherController {
	@Autowired
	private ClimaService serv;
	
	@GetMapping("/{latitude}/{longitude}")
	public ResponseEntity<WhaterDTO> getClimaPorCidade(@PathVariable String latitude, @PathVariable String longitude) {
		return ResponseEntity.ok(serv.getClimaLL(latitude, longitude));
	}
}
