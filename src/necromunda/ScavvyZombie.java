package necromunda;

import necromunda.Fighter.State;

public class ScavvyZombie extends Fighter {
	public static FighterProfile getTemplateProfile() {
		return new ScavvyZombieProfile();
	}
	
	public ScavvyZombie(String name, FighterProfile profile, Gang ownGang) {
		super(name, profile, ownGang);
		setCost(0);
		
		float zombieSpeed = (float)Utils.rollD6() + (float)Utils.rollD6();
				
		//ScavvyZombieProfile.setCurrentMovement(zombieSpeed);
	}
}
