package com.stefanini.pokemon.entities;

import java.util.List;

//@Entity
//@Table(name = "Pokemon", schema = "pokemon")
public class Pokemon extends EntityBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	@Id
//	@Column
	private Long id;
	
//	@Column
	private String nome;
	
//	@Column
	private Integer vida;
	
//	@Column
	private Integer ataque;
	
//	@Column
	private Integer defesa;
	
//	@Column
	private Integer level;
	
//	@ManyToMany(mappedBy = "pokemons")
	private List<Treinador> treinadores;
	
//	@ManyToOne
//	@JoinColumn(name="tipoPokemon")
	private TipoPokemon tipoPokemon;
	
//	@ManyToOne
//	@JoinColumn(name="tipoPokemonSecundario")
	private TipoPokemon tipoPokemonSecundario;
	
	
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
