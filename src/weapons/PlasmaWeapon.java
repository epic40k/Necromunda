package weapons;

import necromunda.Necromunda;

public abstract class PlasmaWeapon extends RangeCombatWeapon {
	protected int turnCounter = 0;
	
	@Override
	public void reset() {
		super.reset();
		
		if (turnCounter > 0) {
			turnCounter--;
		}
		
		if (turnCounter == 0) {
			setEnabled(true);
		}
		else {
			setEnabled(false);
		}
	}
}
