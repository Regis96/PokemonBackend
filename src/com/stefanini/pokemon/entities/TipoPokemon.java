package com.stefanini.pokemon.entities;

//@Entity
//@Table(name = "TipoPokemon", schema = "pokemon")
public class TipoPokemon extends EntityBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Id
//	@Column
	private Long id;
	
//	@Column
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
}
