package weapons;

public class Handbow extends RangeCombatWeapon {
	public Handbow() {
		setName("Handbow");
		setRangeCombatWeaponType(RangeCombatWeaponType.BASIC);
		setMoveOrFire(true);
		setCost(5);
	}
	
	@Override
	public void addAmmunitions() {
		getAmmunitions().add(new HandbowAmmunition());		
	}
	
	private class HandbowAmmunition extends Ammunition {
		/**
		 * 
		 */
		private static final long serialVersionUID = -5788816572713667106L;

		public HandbowAmmunition() {
			setStrength(4);
			setDamage(1);
			setArmorSaveModification(-1);
			setRangeShortLowerBound(0);
			setRangeShortUpperBound(8);
			setRangeLongLowerBound(8);
			setRangeLongUpperBound(16);
			setHitRollModificationShort(0);
			setHitRollModificationLong(-1);
			setAmmoRoll(4);
			setCost(0);
		}
	}
}
