package necromunda;

public class BountyHunterProfile extends FighterProfile {
	public BountyHunterProfile() {
		super(4, 4, 4, 3, 3, 2, 4, 1, 8);
		
		boolean rolledAlready = AdvanceRolls();
		
		if (rolledAlready == false){
			AdvanceRolls();
		}
	}
	
	private boolean AdvanceRolls()
	{
		int die6 = Utils.rollD6();
		
		switch (die6) {
			case 1:
				this.setWeaponSkill(this.weaponSkill+1);
				GangGenerationPanel.weaponSkillTextField.setText(String.valueOf(this.getWeaponSkill()));
				break;
			case 2:
				this.setBallisticSkill(this.ballisticSkill+1);
				GangGenerationPanel.ballisticSkillTextField.setText(String.valueOf(this.getBallisticSkill()));
				break;
			case 3:
				this.setInitiative(this.initiative+1);
				GangGenerationPanel.initiativeTextField.setText(String.valueOf(this.getInitiative()));
				break;
			case 4:
				this.setWeaponSkill(this.leadership+1);
				GangGenerationPanel.leadershipTextField.setText(String.valueOf(this.getLeadership()));
				break;
			case 5:
					
				int die2 = Utils.rollD(2);
					
				switch (die2) {
					case 1:
						this.setStrength(this.strength+1);
						GangGenerationPanel.strengthTextField.setText(String.valueOf(this.getStrength()));
						break;
					case 2:
						this.setToughness(this.toughness+1);
						GangGenerationPanel.toughnessTextField.setText(String.valueOf(this.getToughness()));
						break;
				}
				break;
			case 6:
					
				int newDie2 = Utils.rollD(2);
					
				switch (newDie2) {
					case 1:
						if (this.wounds==3) {
						this.setWounds(3);
						GangGenerationPanel.woundsTextField.setText(String.valueOf(this.getWounds()));
						}
						else {
						this.setWounds(this.wounds+1);
						GangGenerationPanel.woundsTextField.setText(String.valueOf(this.getWounds()));
						}
						break;
					case 2:
						this.setAttacks(this.attacks+1);
						GangGenerationPanel.attacksTextField.setText(String.valueOf(this.getAttacks()));
						break;
				}
				break;
		}
		boolean rolledAlready = true;
		return rolledAlready;
	}
}
