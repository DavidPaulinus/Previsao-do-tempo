package br.com.weatherAPI.model.DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WheaterDetalharDTO {
	private List<String> horaClima = new ArrayList<>();

	public WheaterDetalharDTO(WheaterDTO we) {
		var dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		var horaNow = LocalDateTime.now().getHour();
		
		var clima = we.getHourly().getTemperature_2m();
		var hourly_units = we.getHourly_units().getTemperature_2m();
		
		var hora = we.getHourly().getTime().stream()
											.filter(x -> x.getHour() >= horaNow
											&& x.getDayOfYear() == LocalDateTime.now().getDayOfYear())
											.map(x -> dtf.format(x)).toList();
		
		for(int i = 0, j = horaNow; i < hora.size(); i++, j++) {
			horaClima.add(hora.get(i) + " - " + clima.get(j) + hourly_units);
		}
	}
	
}
