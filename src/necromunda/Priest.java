package necromunda;

public class Priest extends Fighter {
	public static FighterProfile getTemplateProfile() {
		return new PriestProfile();
	}
	
	public Priest(String name, FighterProfile profile, Gang ownGang) {
		super(name, profile, ownGang);
		setCost(160);
	}
}