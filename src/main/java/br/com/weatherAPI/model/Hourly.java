package br.com.weatherAPI.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Hourly {
	private List<String> time;
	private List<Double> temperature_2m;
}
