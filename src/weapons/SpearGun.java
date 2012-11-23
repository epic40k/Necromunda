package weapons;

import necromunda.Utils;

public class SpearGun extends RangeCombatWeapon {
	public SpearGun() {
		setName("Spear Gun");
		setRangeCombatWeaponType(RangeCombatWeaponType.SCALY);
		setCost(55);
	}
	
	@Override
	public void addAmmunitions() {
		getAmmunitions().add(new SpearGunAmmunition());		
	}
	
	private class SpearGunAmmunition extends Ammunition {
		/**
		 * 
		 */
		private static final long serialVersionUID = 4853307144118031256L;

		public SpearGunAmmunition() {
		
			setStrength(6);
			setDamage(1);
			setArmorSaveModification(-3);
			setRangeShortLowerBound(0);
			setRangeShortUpperBound(12);
			setRangeLongLowerBound(12);
			setRangeLongUpperBound(24);
			setHitRollModificationShort(0);
			setHitRollModificationLong(-1);
			setAmmoRoll(6);
			setCost(0);
		}
		
		@Override
		public String getDamageText() {
			return "D3";
		}
		
		@Override
		public int getDamage() {
			int damage = Utils.rollD(3);

			return damage;
		}
	}
}