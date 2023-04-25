package br.com.weatherAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.weatherAPI.model.DTO.WheaterDTO;
import br.com.weatherAPI.model.DTO.WheaterDetalharDTO;
import br.com.weatherAPI.service.ClimaService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/tempo")
public class WeatherController {
	@Autowired
	private ClimaService serv;
	
	@GetMapping("/{latitude}/{longitude}")
	public ResponseEntity<WheaterDTO> getClimaPorCoordenadas(@PathVariable String latitude, @PathVariable String longitude) {
		return ResponseEntity.ok(serv.getClimaLL(latitude, longitude));
	}
	
	@GetMapping
	public ResponseEntity<List<WheaterDetalharDTO>> getClimaPorCidade(@PathParam(value = "key") String key, @PathParam(value = "cidade") String cidade){
		return ResponseEntity.ok(serv.getClimaCidade(cidade, key).stream().map(WheaterDetalharDTO::new).toList());
	}
}
