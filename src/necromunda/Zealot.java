package necromunda;

public class Zealot extends Fighter {
	public static FighterProfile getTemplateProfile() {
		return new GangerProfile();
	}
	
	public Zealot(String name, FighterProfile profile, Gang ownGang) {
		super(name, profile, ownGang);
		setCost(60);
	}
}