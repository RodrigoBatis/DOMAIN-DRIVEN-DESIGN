package br.com.fiap.model;

public class Planeta {
	
	private String name, climate, terrain, population;

	public Planeta() {
		super();
	}

	public Planeta(String name, String climate, String terrain, String population) {
		super();
		this.name = name;
		this.climate = climate;
		this.terrain = terrain;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public String getClimate() {
		return climate;
	}

	public String getTerrain() {
		return terrain;
	}

	public String getPopulation() {
		return population;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Planeta [name=" + name + ", climate=" + climate + ", terrain=" + terrain + ", population=" + population
				+ "]";
	}
	
	
	
	
}
