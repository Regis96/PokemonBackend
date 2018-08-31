package com.stefanini.pokemon.api.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.stefanini.pokemon.api.PokemonApi;

@ApplicationPath("/resource")
public class JaxrsActivator extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		
		classes.add(PokemonApi.class);
		
		return classes ;
	}
	
}
