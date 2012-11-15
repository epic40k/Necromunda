package necromunda;

public class Devotee extends Fighter {
	public static FighterProfile getTemplateProfile() {
		return new DevoteeProfile();
	}
	
	public Devotee(String name, FighterProfile profile, Gang ownGang) {
		super(name, profile, ownGang);
		setCost(25);
	}

	@Override
	public boolean isReliable() {
		return false;
	}
}
