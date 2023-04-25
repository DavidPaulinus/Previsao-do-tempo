package br.com.weatherAPI.model.DTO;

import java.util.List;

import br.com.weatherAPI.model.Results;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CoordenadasDTO {
	private List<Results> data;
}
