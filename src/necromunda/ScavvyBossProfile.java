package necromunda;

public class ScavvyBossProfile extends FighterProfile {
	public ScavvyBossProfile() {
		super(4, 4, 3, 3, 3, 1, 4, 1, 7);
	//}
	
	/////Scavvy follower generation
	
	//public void GenerateScavvyFollowers()
	//{
		//If the model added is a Scavvy Boss then generate his wasteland followers.
		//The code is placed here so that it only runs once when the Boss has been added to the roster 
		//and doesn't overwrite his stats.
			
		//BasedModelImage image = (BasedModelImage)GangGenerationPanel.fighterImageSpinner.getModel().getValue();
			
		//if (image.getFighterType() == Fighter.Type.SCAVVY_LEADER) {
				
			int die3 = Utils.rollD(3);
				
			switch (die3) {
				case 1:	
					int newDie3 = Utils.rollD(3);
						
					switch (newDie3) {
						case 1:
							GenerateThreeZombies();
							break;
						case 2:
							GenerateFourZombies();
							break;
						case 3:
							GenerateFiveZombies();
							break;
					}
					break;
				case 2:
					int newerDie3 = Utils.rollD(3);
						
					switch (newerDie3) {
						case 1:
							GenerateTwoDogs();
							break;
						case 2:
							GenerateThreeDogs();
							break;
						case 3:
							GenerateFourDogs();
							break;
					}
					break;
				case 3:
					int newestDie3 = Utils.rollD(3);
						
					switch (newestDie3) {
						case 1:
							GenerateGhoul();
							break;
						case 2:
							GenerateTwoGhouls();
							break;
						case 3:
							GenerateThreeGhouls();
							break;
					}
					break;
			}
		}
	//}	
	
	////Scavvy Zombies
		
	public void GenerateThreeZombies() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage zombieImage01 = new BasedModelImage(basePath + "ScavvyZombie01.png", 21, 154, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage02 = new BasedModelImage(basePath + "ScavvyZombie02.png", 0, 160, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage03 = new BasedModelImage(basePath + "ScavvyZombie03.png", 0, 160, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		
		Fighter zombie01 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie02 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie03 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		
		FighterProfile zombieProfile01 = zombie01.getProfile();
		FighterProfile zombieProfile02 = zombie02.getProfile();
		FighterProfile zombieProfile03 = zombie03.getProfile();
		
		zombieProfile01.setMovement(zombieProfile01.getMovement());
		zombieProfile01.setWeaponSkill(zombieProfile01.getWeaponSkill());
		zombieProfile01.setBallisticSkill(zombieProfile01.getBallisticSkill());
		zombieProfile01.setStrength(zombieProfile01.getStrength());
		zombieProfile01.setToughness(zombieProfile01.getToughness());
		zombieProfile01.setWounds(zombieProfile01.getWounds());
		zombieProfile01.setInitiative(zombieProfile01.getInitiative());
		zombieProfile01.setAttacks(zombieProfile01.getAttacks());
		zombieProfile01.setLeadership(zombieProfile01.getLeadership());
		
		zombieProfile02.setMovement(zombieProfile02.getMovement());
		zombieProfile02.setWeaponSkill(zombieProfile02.getWeaponSkill());
		zombieProfile02.setBallisticSkill(zombieProfile02.getBallisticSkill());
		zombieProfile02.setStrength(zombieProfile02.getStrength());
		zombieProfile02.setToughness(zombieProfile02.getToughness());
		zombieProfile02.setWounds(zombieProfile02.getWounds());
		zombieProfile02.setInitiative(zombieProfile02.getInitiative());
		zombieProfile02.setAttacks(zombieProfile02.getAttacks());
		zombieProfile02.setLeadership(zombieProfile02.getLeadership());
		
		zombieProfile03.setMovement(zombieProfile03.getMovement());
		zombieProfile03.setWeaponSkill(zombieProfile03.getWeaponSkill());
		zombieProfile03.setBallisticSkill(zombieProfile03.getBallisticSkill());
		zombieProfile03.setStrength(zombieProfile03.getStrength());
		zombieProfile03.setToughness(zombieProfile03.getToughness());
		zombieProfile03.setWounds(zombieProfile03.getWounds());
		zombieProfile03.setInitiative(zombieProfile03.getInitiative());
		zombieProfile03.setAttacks(zombieProfile03.getAttacks());
		zombieProfile03.setLeadership(zombieProfile03.getLeadership());
		
		zombie01.setFighterImage(zombieImage01);
		zombie02.setFighterImage(zombieImage02);
		zombie03.setFighterImage(zombieImage03);
		
		selectedGang.addFighter(zombie01);
		selectedGang.addFighter(zombie02);
		selectedGang.addFighter(zombie03);
	}
	
	public void GenerateFourZombies() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage zombieImage01 = new BasedModelImage(basePath + "ScavvyZombie01.png", 21, 154, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage02 = new BasedModelImage(basePath + "ScavvyZombie02.png", 0, 160, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage03 = new BasedModelImage(basePath + "ScavvyZombie03.png", 0, 160, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage04 = new BasedModelImage(basePath + "ScavvyZombie01.png", 21, 154, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		
		Fighter zombie01 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie02 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie03 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie04 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		
		FighterProfile zombieProfile01 = zombie01.getProfile();
		FighterProfile zombieProfile02 = zombie02.getProfile();
		FighterProfile zombieProfile03 = zombie03.getProfile();
		FighterProfile zombieProfile04 = zombie04.getProfile();
		
		zombieProfile01.setMovement(zombieProfile01.getMovement());
		zombieProfile01.setWeaponSkill(zombieProfile01.getWeaponSkill());
		zombieProfile01.setBallisticSkill(zombieProfile01.getBallisticSkill());
		zombieProfile01.setStrength(zombieProfile01.getStrength());
		zombieProfile01.setToughness(zombieProfile01.getToughness());
		zombieProfile01.setWounds(zombieProfile01.getWounds());
		zombieProfile01.setInitiative(zombieProfile01.getInitiative());
		zombieProfile01.setAttacks(zombieProfile01.getAttacks());
		zombieProfile01.setLeadership(zombieProfile01.getLeadership());
		
		zombieProfile02.setMovement(zombieProfile02.getMovement());
		zombieProfile02.setWeaponSkill(zombieProfile02.getWeaponSkill());
		zombieProfile02.setBallisticSkill(zombieProfile02.getBallisticSkill());
		zombieProfile02.setStrength(zombieProfile02.getStrength());
		zombieProfile02.setToughness(zombieProfile02.getToughness());
		zombieProfile02.setWounds(zombieProfile02.getWounds());
		zombieProfile02.setInitiative(zombieProfile02.getInitiative());
		zombieProfile02.setAttacks(zombieProfile02.getAttacks());
		zombieProfile02.setLeadership(zombieProfile02.getLeadership());
		
		zombieProfile03.setMovement(zombieProfile03.getMovement());
		zombieProfile03.setWeaponSkill(zombieProfile03.getWeaponSkill());
		zombieProfile03.setBallisticSkill(zombieProfile03.getBallisticSkill());
		zombieProfile03.setStrength(zombieProfile03.getStrength());
		zombieProfile03.setToughness(zombieProfile03.getToughness());
		zombieProfile03.setWounds(zombieProfile03.getWounds());
		zombieProfile03.setInitiative(zombieProfile03.getInitiative());
		zombieProfile03.setAttacks(zombieProfile03.getAttacks());
		zombieProfile03.setLeadership(zombieProfile03.getLeadership());
		
		zombieProfile04.setMovement(zombieProfile04.getMovement());
		zombieProfile04.setWeaponSkill(zombieProfile04.getWeaponSkill());
		zombieProfile04.setBallisticSkill(zombieProfile04.getBallisticSkill());
		zombieProfile04.setStrength(zombieProfile04.getStrength());
		zombieProfile04.setToughness(zombieProfile04.getToughness());
		zombieProfile04.setWounds(zombieProfile04.getWounds());
		zombieProfile04.setInitiative(zombieProfile04.getInitiative());
		zombieProfile04.setAttacks(zombieProfile04.getAttacks());
		zombieProfile04.setLeadership(zombieProfile04.getLeadership());
		
		zombie01.setFighterImage(zombieImage01);
		zombie02.setFighterImage(zombieImage02);
		zombie03.setFighterImage(zombieImage03);
		zombie04.setFighterImage(zombieImage04);
		
		selectedGang.addFighter(zombie01);
		selectedGang.addFighter(zombie02);
		selectedGang.addFighter(zombie03);
		selectedGang.addFighter(zombie04);
	}
	
	public void GenerateFiveZombies() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage zombieImage01 = new BasedModelImage(basePath + "ScavvyZombie01.png", 21, 154, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage02 = new BasedModelImage(basePath + "ScavvyZombie02.png", 0, 160, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage03 = new BasedModelImage(basePath + "ScavvyZombie03.png", 0, 160, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage04 = new BasedModelImage(basePath + "ScavvyZombie01.png", 21, 154, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		BasedModelImage zombieImage05 = new BasedModelImage(basePath + "ScavvyZombie02.png", 0, 160, House.SCAVVIES, Fighter.Type.SCAVVY_ZOMBIE);
		
		Fighter zombie01 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie02 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie03 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie04 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		Fighter zombie05 = Fighter.createInstance(Fighter.Type.SCAVVY_ZOMBIE, "Scavvy Zombie", selectedGang);
		
		FighterProfile zombieProfile01 = zombie01.getProfile();
		FighterProfile zombieProfile02 = zombie02.getProfile();
		FighterProfile zombieProfile03 = zombie03.getProfile();
		FighterProfile zombieProfile04 = zombie04.getProfile();
		FighterProfile zombieProfile05 = zombie05.getProfile();
		
		zombieProfile01.setMovement(zombieProfile01.getMovement());
		zombieProfile01.setWeaponSkill(zombieProfile01.getWeaponSkill());
		zombieProfile01.setBallisticSkill(zombieProfile01.getBallisticSkill());
		zombieProfile01.setStrength(zombieProfile01.getStrength());
		zombieProfile01.setToughness(zombieProfile01.getToughness());
		zombieProfile01.setWounds(zombieProfile01.getWounds());
		zombieProfile01.setInitiative(zombieProfile01.getInitiative());
		zombieProfile01.setAttacks(zombieProfile01.getAttacks());
		zombieProfile01.setLeadership(zombieProfile01.getLeadership());
		
		zombieProfile02.setMovement(zombieProfile02.getMovement());
		zombieProfile02.setWeaponSkill(zombieProfile02.getWeaponSkill());
		zombieProfile02.setBallisticSkill(zombieProfile02.getBallisticSkill());
		zombieProfile02.setStrength(zombieProfile02.getStrength());
		zombieProfile02.setToughness(zombieProfile02.getToughness());
		zombieProfile02.setWounds(zombieProfile02.getWounds());
		zombieProfile02.setInitiative(zombieProfile02.getInitiative());
		zombieProfile02.setAttacks(zombieProfile02.getAttacks());
		zombieProfile02.setLeadership(zombieProfile02.getLeadership());
		
		zombieProfile03.setMovement(zombieProfile03.getMovement());
		zombieProfile03.setWeaponSkill(zombieProfile03.getWeaponSkill());
		zombieProfile03.setBallisticSkill(zombieProfile03.getBallisticSkill());
		zombieProfile03.setStrength(zombieProfile03.getStrength());
		zombieProfile03.setToughness(zombieProfile03.getToughness());
		zombieProfile03.setWounds(zombieProfile03.getWounds());
		zombieProfile03.setInitiative(zombieProfile03.getInitiative());
		zombieProfile03.setAttacks(zombieProfile03.getAttacks());
		zombieProfile03.setLeadership(zombieProfile03.getLeadership());
		
		zombieProfile04.setMovement(zombieProfile04.getMovement());
		zombieProfile04.setWeaponSkill(zombieProfile04.getWeaponSkill());
		zombieProfile04.setBallisticSkill(zombieProfile04.getBallisticSkill());
		zombieProfile04.setStrength(zombieProfile04.getStrength());
		zombieProfile04.setToughness(zombieProfile04.getToughness());
		zombieProfile04.setWounds(zombieProfile04.getWounds());
		zombieProfile04.setInitiative(zombieProfile04.getInitiative());
		zombieProfile04.setAttacks(zombieProfile04.getAttacks());
		zombieProfile04.setLeadership(zombieProfile04.getLeadership());
		
		zombieProfile05.setMovement(zombieProfile05.getMovement());
		zombieProfile05.setWeaponSkill(zombieProfile05.getWeaponSkill());
		zombieProfile05.setBallisticSkill(zombieProfile05.getBallisticSkill());
		zombieProfile05.setStrength(zombieProfile05.getStrength());
		zombieProfile05.setToughness(zombieProfile05.getToughness());
		zombieProfile05.setWounds(zombieProfile05.getWounds());
		zombieProfile05.setInitiative(zombieProfile05.getInitiative());
		zombieProfile05.setAttacks(zombieProfile05.getAttacks());
		zombieProfile05.setLeadership(zombieProfile05.getLeadership());
		
		zombie01.setFighterImage(zombieImage01);
		zombie02.setFighterImage(zombieImage02);
		zombie03.setFighterImage(zombieImage03);
		zombie04.setFighterImage(zombieImage04);
		zombie05.setFighterImage(zombieImage05);
		
		selectedGang.addFighter(zombie01);
		selectedGang.addFighter(zombie02);
		selectedGang.addFighter(zombie03);
		selectedGang.addFighter(zombie04);
		selectedGang.addFighter(zombie05);
	}
	
	//////Scavvy Dogs
	
	public void GenerateTwoDogs() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage dogImage01 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		BasedModelImage dogImage02 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		
		Fighter dog01 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		Fighter dog02 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		
		FighterProfile dogProfile01 = dog01.getProfile();
		FighterProfile dogProfile02 = dog02.getProfile();
		
		dogProfile01.setMovement(dogProfile01.getMovement());
		dogProfile01.setWeaponSkill(dogProfile01.getWeaponSkill());
		dogProfile01.setBallisticSkill(dogProfile01.getBallisticSkill());
		dogProfile01.setStrength(dogProfile01.getStrength());
		dogProfile01.setToughness(dogProfile01.getToughness());
		dogProfile01.setWounds(dogProfile01.getWounds());
		dogProfile01.setInitiative(dogProfile01.getInitiative());
		dogProfile01.setAttacks(dogProfile01.getAttacks());
		dogProfile01.setLeadership(dogProfile01.getLeadership());
		
		dogProfile02.setMovement(dogProfile02.getMovement());
		dogProfile02.setWeaponSkill(dogProfile02.getWeaponSkill());
		dogProfile02.setBallisticSkill(dogProfile02.getBallisticSkill());
		dogProfile02.setStrength(dogProfile02.getStrength());
		dogProfile02.setToughness(dogProfile02.getToughness());
		dogProfile02.setWounds(dogProfile02.getWounds());
		dogProfile02.setInitiative(dogProfile02.getInitiative());
		dogProfile02.setAttacks(dogProfile02.getAttacks());
		dogProfile02.setLeadership(dogProfile02.getLeadership());
		
		dog01.setFighterImage(dogImage01);
		dog02.setFighterImage(dogImage02);
		
		selectedGang.addFighter(dog01);
		selectedGang.addFighter(dog02);
	}
	
	public void GenerateThreeDogs() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage dogImage01 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		BasedModelImage dogImage02 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		BasedModelImage dogImage03 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		
		Fighter dog01 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		Fighter dog02 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		Fighter dog03 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		
		FighterProfile dogProfile01 = dog01.getProfile();
		FighterProfile dogProfile02 = dog02.getProfile();
		FighterProfile dogProfile03 = dog03.getProfile();
		
		dogProfile01.setMovement(dogProfile01.getMovement());
		dogProfile01.setWeaponSkill(dogProfile01.getWeaponSkill());
		dogProfile01.setBallisticSkill(dogProfile01.getBallisticSkill());
		dogProfile01.setStrength(dogProfile01.getStrength());
		dogProfile01.setToughness(dogProfile01.getToughness());
		dogProfile01.setWounds(dogProfile01.getWounds());
		dogProfile01.setInitiative(dogProfile01.getInitiative());
		dogProfile01.setAttacks(dogProfile01.getAttacks());
		dogProfile01.setLeadership(dogProfile01.getLeadership());
		
		dogProfile02.setMovement(dogProfile02.getMovement());
		dogProfile02.setWeaponSkill(dogProfile02.getWeaponSkill());
		dogProfile02.setBallisticSkill(dogProfile02.getBallisticSkill());
		dogProfile02.setStrength(dogProfile02.getStrength());
		dogProfile02.setToughness(dogProfile02.getToughness());
		dogProfile02.setWounds(dogProfile02.getWounds());
		dogProfile02.setInitiative(dogProfile02.getInitiative());
		dogProfile02.setAttacks(dogProfile02.getAttacks());
		dogProfile02.setLeadership(dogProfile02.getLeadership());
		
		dogProfile03.setMovement(dogProfile03.getMovement());
		dogProfile03.setWeaponSkill(dogProfile03.getWeaponSkill());
		dogProfile03.setBallisticSkill(dogProfile03.getBallisticSkill());
		dogProfile03.setStrength(dogProfile03.getStrength());
		dogProfile03.setToughness(dogProfile03.getToughness());
		dogProfile03.setWounds(dogProfile03.getWounds());
		dogProfile03.setInitiative(dogProfile03.getInitiative());
		dogProfile03.setAttacks(dogProfile03.getAttacks());
		dogProfile03.setLeadership(dogProfile03.getLeadership());
		
		dog01.setFighterImage(dogImage01);
		dog02.setFighterImage(dogImage02);
		dog03.setFighterImage(dogImage03);
		
		selectedGang.addFighter(dog01);
		selectedGang.addFighter(dog02);
		selectedGang.addFighter(dog03);
	}
	
	public void GenerateFourDogs() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage dogImage01 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		BasedModelImage dogImage02 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		BasedModelImage dogImage03 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		BasedModelImage dogImage04 = new BasedModelImage(basePath + "ScavvyDog01.png", 0, 192, House.SCAVVIES, Fighter.Type.SCAVVY_DOG);
		
		Fighter dog01 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		Fighter dog02 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		Fighter dog03 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		Fighter dog04 = Fighter.createInstance(Fighter.Type.SCAVVY_DOG, "Scavvy Dog", selectedGang);
		
		FighterProfile dogProfile01 = dog01.getProfile();
		FighterProfile dogProfile02 = dog02.getProfile();
		FighterProfile dogProfile03 = dog03.getProfile();
		FighterProfile dogProfile04 = dog04.getProfile();
		
		dogProfile01.setMovement(dogProfile01.getMovement());
		dogProfile01.setWeaponSkill(dogProfile01.getWeaponSkill());
		dogProfile01.setBallisticSkill(dogProfile01.getBallisticSkill());
		dogProfile01.setStrength(dogProfile01.getStrength());
		dogProfile01.setToughness(dogProfile01.getToughness());
		dogProfile01.setWounds(dogProfile01.getWounds());
		dogProfile01.setInitiative(dogProfile01.getInitiative());
		dogProfile01.setAttacks(dogProfile01.getAttacks());
		dogProfile01.setLeadership(dogProfile01.getLeadership());
		
		dogProfile02.setMovement(dogProfile02.getMovement());
		dogProfile02.setWeaponSkill(dogProfile02.getWeaponSkill());
		dogProfile02.setBallisticSkill(dogProfile02.getBallisticSkill());
		dogProfile02.setStrength(dogProfile02.getStrength());
		dogProfile02.setToughness(dogProfile02.getToughness());
		dogProfile02.setWounds(dogProfile02.getWounds());
		dogProfile02.setInitiative(dogProfile02.getInitiative());
		dogProfile02.setAttacks(dogProfile02.getAttacks());
		dogProfile02.setLeadership(dogProfile02.getLeadership());
		
		dogProfile03.setMovement(dogProfile03.getMovement());
		dogProfile03.setWeaponSkill(dogProfile03.getWeaponSkill());
		dogProfile03.setBallisticSkill(dogProfile03.getBallisticSkill());
		dogProfile03.setStrength(dogProfile03.getStrength());
		dogProfile03.setToughness(dogProfile03.getToughness());
		dogProfile03.setWounds(dogProfile03.getWounds());
		dogProfile03.setInitiative(dogProfile03.getInitiative());
		dogProfile03.setAttacks(dogProfile03.getAttacks());
		dogProfile03.setLeadership(dogProfile03.getLeadership());
		
		dogProfile04.setMovement(dogProfile04.getMovement());
		dogProfile04.setWeaponSkill(dogProfile04.getWeaponSkill());
		dogProfile04.setBallisticSkill(dogProfile04.getBallisticSkill());
		dogProfile04.setStrength(dogProfile04.getStrength());
		dogProfile04.setToughness(dogProfile04.getToughness());
		dogProfile04.setWounds(dogProfile04.getWounds());
		dogProfile04.setInitiative(dogProfile04.getInitiative());
		dogProfile04.setAttacks(dogProfile04.getAttacks());
		dogProfile04.setLeadership(dogProfile04.getLeadership());
		
		dog01.setFighterImage(dogImage01);
		dog02.setFighterImage(dogImage02);
		dog03.setFighterImage(dogImage03);
		dog04.setFighterImage(dogImage04);
		
		selectedGang.addFighter(dog01);
		selectedGang.addFighter(dog02);
		selectedGang.addFighter(dog03);
		selectedGang.addFighter(dog04);
	}
	
	//////Scavvy Ghouls
	
	public void GenerateGhoul() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage ghoulImage01 = new BasedModelImage(basePath + "ScavvyGhoul01.png", 17, 160, House.SCAVVIES, Fighter.Type.SCAVVY_GHOUL);
		
		Fighter ghoul01 = Fighter.createInstance(Fighter.Type.SCAVVY_GHOUL, "Scavvy Ghoul", selectedGang);

		FighterProfile ghoulProfile01 = ghoul01.getProfile();
		
		ghoulProfile01.setMovement(ghoulProfile01.getMovement());
		ghoulProfile01.setWeaponSkill(ghoulProfile01.getWeaponSkill());
		ghoulProfile01.setBallisticSkill(ghoulProfile01.getBallisticSkill());
		ghoulProfile01.setStrength(ghoulProfile01.getStrength());
		ghoulProfile01.setToughness(ghoulProfile01.getToughness());
		ghoulProfile01.setWounds(ghoulProfile01.getWounds());
		ghoulProfile01.setInitiative(ghoulProfile01.getInitiative());
		ghoulProfile01.setAttacks(ghoulProfile01.getAttacks());
		ghoulProfile01.setLeadership(ghoulProfile01.getLeadership());
		
		ghoul01.setFighterImage(ghoulImage01);
		
		selectedGang.addFighter(ghoul01);
	}
	
	public void GenerateTwoGhouls() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage ghoulImage01 = new BasedModelImage(basePath + "ScavvyGhoul01.png", 17, 160, House.SCAVVIES, Fighter.Type.SCAVVY_GHOUL);
		BasedModelImage ghoulImage02 = new BasedModelImage(basePath + "ScavvyGhoul02.png", 5, 163, House.SCAVVIES, Fighter.Type.SCAVVY_GHOUL);
		
		Fighter ghoul01 = Fighter.createInstance(Fighter.Type.SCAVVY_GHOUL, "Scavvy Ghoul", selectedGang);
		Fighter ghoul02 = Fighter.createInstance(Fighter.Type.SCAVVY_GHOUL, "Scavvy Ghoul", selectedGang);

		FighterProfile ghoulProfile01 = ghoul01.getProfile();
		FighterProfile ghoulProfile02 = ghoul02.getProfile();
		
		ghoulProfile01.setMovement(ghoulProfile01.getMovement());
		ghoulProfile01.setWeaponSkill(ghoulProfile01.getWeaponSkill());
		ghoulProfile01.setBallisticSkill(ghoulProfile01.getBallisticSkill());
		ghoulProfile01.setStrength(ghoulProfile01.getStrength());
		ghoulProfile01.setToughness(ghoulProfile01.getToughness());
		ghoulProfile01.setWounds(ghoulProfile01.getWounds());
		ghoulProfile01.setInitiative(ghoulProfile01.getInitiative());
		ghoulProfile01.setAttacks(ghoulProfile01.getAttacks());
		ghoulProfile01.setLeadership(ghoulProfile01.getLeadership());
		
		ghoulProfile02.setMovement(ghoulProfile02.getMovement());
		ghoulProfile02.setWeaponSkill(ghoulProfile02.getWeaponSkill());
		ghoulProfile02.setBallisticSkill(ghoulProfile02.getBallisticSkill());
		ghoulProfile02.setStrength(ghoulProfile02.getStrength());
		ghoulProfile02.setToughness(ghoulProfile02.getToughness());
		ghoulProfile02.setWounds(ghoulProfile02.getWounds());
		ghoulProfile02.setInitiative(ghoulProfile02.getInitiative());
		ghoulProfile02.setAttacks(ghoulProfile02.getAttacks());
		ghoulProfile02.setLeadership(ghoulProfile02.getLeadership());
		
		ghoul01.setFighterImage(ghoulImage01);
		ghoul02.setFighterImage(ghoulImage02);
		
		selectedGang.addFighter(ghoul01);
		selectedGang.addFighter(ghoul02);
	}
	
	public void GenerateThreeGhouls() {
		
		String basePath = "/Images/Textures/Fighters/";
		
		Gang selectedGang = (Gang)GangGenerationPanel.gangList.getSelectedValue();
		
		BasedModelImage ghoulImage01 = new BasedModelImage(basePath + "ScavvyGhoul01.png", 17, 160, House.SCAVVIES, Fighter.Type.SCAVVY_GHOUL);
		BasedModelImage ghoulImage02 = new BasedModelImage(basePath + "ScavvyGhoul02.png", 5, 163, House.SCAVVIES, Fighter.Type.SCAVVY_GHOUL);
		BasedModelImage ghoulImage03 = new BasedModelImage(basePath + "ScavvyGhoul03.png", 0, 160, House.SCAVVIES, Fighter.Type.SCAVVY_GHOUL);
		
		Fighter ghoul01 = Fighter.createInstance(Fighter.Type.SCAVVY_GHOUL, "Scavvy Ghoul", selectedGang);
		Fighter ghoul02 = Fighter.createInstance(Fighter.Type.SCAVVY_GHOUL, "Scavvy Ghoul", selectedGang);
		Fighter ghoul03 = Fighter.createInstance(Fighter.Type.SCAVVY_GHOUL, "Scavvy Ghoul", selectedGang);

		FighterProfile ghoulProfile01 = ghoul01.getProfile();
		FighterProfile ghoulProfile02 = ghoul02.getProfile();
		FighterProfile ghoulProfile03 = ghoul03.getProfile();
		
		ghoulProfile01.setMovement(ghoulProfile01.getMovement());
		ghoulProfile01.setWeaponSkill(ghoulProfile01.getWeaponSkill());
		ghoulProfile01.setBallisticSkill(ghoulProfile01.getBallisticSkill());
		ghoulProfile01.setStrength(ghoulProfile01.getStrength());
		ghoulProfile01.setToughness(ghoulProfile01.getToughness());
		ghoulProfile01.setWounds(ghoulProfile01.getWounds());
		ghoulProfile01.setInitiative(ghoulProfile01.getInitiative());
		ghoulProfile01.setAttacks(ghoulProfile01.getAttacks());
		ghoulProfile01.setLeadership(ghoulProfile01.getLeadership());
		
		ghoulProfile02.setMovement(ghoulProfile02.getMovement());
		ghoulProfile02.setWeaponSkill(ghoulProfile02.getWeaponSkill());
		ghoulProfile02.setBallisticSkill(ghoulProfile02.getBallisticSkill());
		ghoulProfile02.setStrength(ghoulProfile02.getStrength());
		ghoulProfile02.setToughness(ghoulProfile02.getToughness());
		ghoulProfile02.setWounds(ghoulProfile02.getWounds());
		ghoulProfile02.setInitiative(ghoulProfile02.getInitiative());
		ghoulProfile02.setAttacks(ghoulProfile02.getAttacks());
		ghoulProfile02.setLeadership(ghoulProfile02.getLeadership());

		ghoulProfile03.setMovement(ghoulProfile03.getMovement());
		ghoulProfile03.setWeaponSkill(ghoulProfile03.getWeaponSkill());
		ghoulProfile03.setBallisticSkill(ghoulProfile03.getBallisticSkill());
		ghoulProfile03.setStrength(ghoulProfile03.getStrength());
		ghoulProfile03.setToughness(ghoulProfile03.getToughness());
		ghoulProfile03.setWounds(ghoulProfile03.getWounds());
		ghoulProfile03.setInitiative(ghoulProfile03.getInitiative());
		ghoulProfile03.setAttacks(ghoulProfile03.getAttacks());
		ghoulProfile03.setLeadership(ghoulProfile03.getLeadership());
		
		ghoul01.setFighterImage(ghoulImage01);
		ghoul02.setFighterImage(ghoulImage02);
		ghoul03.setFighterImage(ghoulImage03);
		
		selectedGang.addFighter(ghoul01);
		selectedGang.addFighter(ghoul02);
		selectedGang.addFighter(ghoul03);
	}
}