package com.stefanini.pokemon.entities;


//@Entity
//@Table(name = "Usuario", schema = "pokemon")
public class Usuario extends EntityBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	@Id
//	@Column
	private Long id;
	
//	@Column
	private String email;
	
//	@Column
	private String senha;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
