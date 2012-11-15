package necromunda;

public class Crusader extends Fighter {
	public static FighterProfile getTemplateProfile() {
		return new CrusaderProfile();
	}
	
	public Crusader(String name, FighterProfile profile, Gang ownGang) {
		super(name, profile, ownGang);
		setCost(50);
	}
}
