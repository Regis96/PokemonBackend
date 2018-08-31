package com.stefanini.pokemon.parsers;

import com.stefanini.pokemon.dtos.TreinadorDTO;
import com.stefanini.pokemon.entities.Treinador;

public class TreinadorParserDTO extends AbstractParser<TreinadorDTO, Treinador> {

	@Override
	TreinadorDTO toDTO(Treinador entity) {
		TreinadorDTO dto = new TreinadorDTO();
		//implementar parse
		return dto;
	}

	@Override
	Treinador toEntity(TreinadorDTO dto) {
		Treinador treinador = new Treinador();
		//implementar parse
		return treinador;
	}

}
