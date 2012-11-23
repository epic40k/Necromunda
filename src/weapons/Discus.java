package weapons;

public class Discus extends RangeCombatWeapon {
	public Discus() {
		setName("Discus");
		setRangeCombatWeaponType(RangeCombatWeaponType.SCALY);
		setCost(6);
	}
	
	@Override
	public void addAmmunitions() {
		getAmmunitions().add(new DiscusAmmunition());		
	}
	
	private class DiscusAmmunition extends Ammunition {
		/**
		 * 
		 */
		private static final long serialVersionUID = 2336366512318817020L;

		public DiscusAmmunition() {
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
