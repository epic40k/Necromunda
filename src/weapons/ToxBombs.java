package weapons;

import necromunda.Necromunda;
import necromunda.Utils;

public class ToxBombs extends Grenades {
	public ToxBombs() {
		setName("Tox Bombs");
		setCost(20);
	}
	
	@Override
	public void addAmmunitions() {
		getAmmunitions().add(new ToxBombAmmunition());
	}
	
	private class ToxBombAmmunition extends GrenadesAmmunition {
		/**
		 * 
		 */
		private static final long serialVersionUID = -8643038092601488833L;

		public ToxBombAmmunition() {
			setName("Tox Bombs");
			setStrength(4);
			setDamage(1);
			setArmorSaveModification(0);
			setRangeShortLowerBound(0);
			setRangeShortUpperBound(0);
			setRangeLongLowerBound(0);
			setRangeLongUpperBound(0);
			setHitRollModificationShort(0);
			setHitRollModificationLong(0);
			setAmmoRoll(0);
			setCost(0);
			
			setTemplated(true);
			setTemplatePersistent(true);
			setTemplateRadius(1.5f);
			
			int hitroll = Utils.rollD6();
			
			isHitRoll(hitroll);
		}
		
		@Override
		public boolean isTemplateToBeRemoved() {
				return false;
		}

		public void isHitRoll(int hitRoll) {
			if (hitRoll >= 4) {
				setStrength(4);
				setDamage(1);
			}
			else
			{
				setStrength(0);
				setDamage(0);
			}
		}
	}
}
