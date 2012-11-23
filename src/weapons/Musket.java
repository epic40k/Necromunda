package weapons;

public class Musket extends RangeCombatWeapon {
	public Musket() {
		setName("Musket");
		setRangeCombatWeaponType(RangeCombatWeaponType.BASIC);
		setMoveOrFire(true);
		setCost(5);
	}
	
	@Override
	public void addAmmunitions() {
		getAmmunitions().add(new MusketAmmunition());		
	}
	
	private class MusketAmmunition extends Ammunition {
		/**
		 * 
		 */
		private static final long serialVersionUID = 8294788094188254815L;

		public MusketAmmunition() {
			setStrength(3);
			setDamage(1);
			setArmorSaveModification(-1);
			setRangeShortLowerBound(0);
			setRangeShortUpperBound(12);
			setRangeLongLowerBound(12);
			setRangeLongUpperBound(24);
			setHitRollModificationShort(0);
			setHitRollModificationLong(-1);
			setAmmoRoll(6);
			setCost(0);
		}
	}
}
