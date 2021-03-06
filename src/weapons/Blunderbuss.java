package weapons;

public class Blunderbuss extends RangeCombatWeapon {
	public Blunderbuss() {
		setName("Blunderbuss");
		setRangeCombatWeaponType(RangeCombatWeaponType.BASIC);
		setCost(7);
	}
	
	@Override
	public void addAmmunitions() {
		getAmmunitions().add(new BlunderbussAmmunition());		
	}
	
	private class BlunderbussAmmunition extends Ammunition {
		/**
		 * 
		 */
		private static final long serialVersionUID = 4255282968724446029L;

		public BlunderbussAmmunition() {
			setStrength(3);
			setDamage(1);
			setArmorSaveModification(0);
			setRangeShortLowerBound(0);
			setRangeShortUpperBound(6);
			setRangeLongLowerBound(6);
			setRangeLongUpperBound(9);
			setHitRollModificationShort(+3);
			setHitRollModificationLong(-1);
			setAmmoRoll(6);
			setCost(0);
		}
	}
}
