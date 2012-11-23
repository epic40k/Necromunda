package weapons;

public class ThrowingAxe extends RangeCombatWeapon {
	public ThrowingAxe() {
		setName("Throwing Axe");
		setRangeCombatWeaponType(RangeCombatWeaponType.SCALY);
		setCost(6);
	}
	
	@Override
	public void addAmmunitions() {
		getAmmunitions().add(new ThrowingAxeAmmunition());		
	}
	
	private class ThrowingAxeAmmunition extends Ammunition {
		/**
		 * 
		 */
		private static final long serialVersionUID = -6541390889041081861L;

		public ThrowingAxeAmmunition() {
			setStrength(5);
			setDamage(1);
			setArmorSaveModification(-1);
			setRangeShortLowerBound(0);
			setRangeShortUpperBound(6);
			setRangeLongLowerBound(6);
			setRangeLongUpperBound(12);
			setHitRollModificationShort(0);
			setHitRollModificationLong(0);
			setAmmoRoll(6);
			setCost(0);
		}
	}
}
