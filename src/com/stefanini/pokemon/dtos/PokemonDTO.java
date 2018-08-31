package com.stefanini.pokemon.dtos;

import java.io.Serializable;

public class PokemonDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private Integer vida;
	private Integer ataque;
	private Integer defesa;
	private Integer level;
	private TipoPokemonDTO tipoPokemon;
	private TipoPokemonDTO tipoPokemonSecundario;
	
	
	public TipoPokemonDTO getTipoPokemon() {
		return tipoPokemon;
	}
	public void setTipoPokemon(TipoPokemonDTO tipoPokemon) {
		this.tipoPokemon = tipoPokemon;
	}
	public TipoPokemonDTO getTipoPokemonSecundario() {
		return tipoPokemonSecundario;
	}
	public void setTipoPokemonSecundario(TipoPokemonDTO tipoPokemonSecundario) {
		this.tipoPokemonSecundario = tipoPokemonSecundario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getVida() {
		return vida;
	}
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	public Integer getAtaque() {
		return ataque;
	}
	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}
	public Integer getDefesa() {
		return defesa;
	}
	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	
}
