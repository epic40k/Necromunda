package necromunda;

public class Scaly extends Fighter {
	public static FighterProfile getTemplateProfile() {
		return new ScalyProfile();
	}
	
	public Scaly(String name, FighterProfile profile, Gang ownGang) {
		super(name, profile, ownGang);
		setCost(120);
	}
}
