package br.com.weatherAPI.model.DTO;

import br.com.weatherAPI.model.CurrentWeather;
import br.com.weatherAPI.model.Hourly;
import br.com.weatherAPI.model.HourlyUnits;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WheaterDTO {
	private Double latitude;
	private Double longitude;
	private Double elevation;
	private Double generationtime_ms;
	private Integer utc_offset_seconds;
	
	private String timezone;
	private String timezone_abbreviation;
	
	private Hourly hourly;
	private HourlyUnits hourly_units;
	private CurrentWeather current_weather;
}
