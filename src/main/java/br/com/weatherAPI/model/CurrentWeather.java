package br.com.weatherAPI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CurrentWeather {
	private String time;
	private Double temperature;
	private Integer weathercode;
	private Double windspeed;
	private Double winddirection;
}
