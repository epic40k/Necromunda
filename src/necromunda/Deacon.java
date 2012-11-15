package necromunda;

public class Deacon extends Fighter {
	public static FighterProfile getTemplateProfile() {
		return new DeaconProfile();
	}
	
	public Deacon(String name, FighterProfile profile, Gang ownGang) {
		super(name, profile, ownGang);
		setCost(60);
	}
}
