package weapons;

public class ScatterCannon extends RangeCombatWeapon {
	public ScatterCannon() {
		setName("Scatter Cannon");
		setRangeCombatWeaponType(RangeCombatWeaponType.SCALY);
		setCost(80);
	}
	
	@Override
	public void addAmmunitions() {
		getAmmunitions().add(new ScatterCannonAmmunition());		
	}
	
	private class ScatterCannonAmmunition extends Ammunition {
		/**
		 * 
		 */
		private static final long serialVersionUID = -6756834048188538689L;

		public ScatterCannonAmmunition() {
			setStrength(4);
			setDamage(1);
			setArmorSaveModification(-1);
			setRangeShortLowerBound(0);
			setRangeShortUpperBound(8);
			setRangeLongLowerBound(8);
			setRangeLongUpperBound(16);
			setHitRollModificationShort(+3);
			setHitRollModificationLong(+1);
			setAmmoRoll(6);
			setCost(0);
			
			setTemplated(true);
			setTemplateRadius(1.5f);
			
			setScattering(true);
		}
	}
}