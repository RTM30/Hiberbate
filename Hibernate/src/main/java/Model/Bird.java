package Model;

public class Bird {
	
	int id;
	
	private String species;
	private boolean canFly;
	private boolean laysEggs;
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isLaysEggs() {
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	
	

}
