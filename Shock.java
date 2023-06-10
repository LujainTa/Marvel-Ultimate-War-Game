package model.effects;

import model.world.Champion;

public class Shock extends Effect {

	public Shock(int duration) {
		super("Shock", duration, EffectType.DEBUFF);
	}

	public void apply(Champion c) {
		int newSpeed = (int) (c.getSpeed() * 0.9);
		c.setSpeed(newSpeed);

		int newAttackDamage = (int) (c.getAttackDamage() * 0.9);
		c.setAttackDamage(newAttackDamage);

		int newMaxActionPointsPerTurn = c.getMaxActionPointsPerTurn() - 1;
		c.setMaxActionPointsPerTurn(newMaxActionPointsPerTurn);

		int newCurrentActionPointsPerTurn = c.getCurrentActionPoints() - 1;
		c.setCurrentActionPoints(newCurrentActionPointsPerTurn);
	}

	public void remove(Champion c) {
		int newSpeed = (int) (c.getSpeed() / 0.9);
		c.setSpeed(newSpeed);

		int newAttackDamage = (int) (c.getAttackDamage() / 0.9);
		c.setAttackDamage(newAttackDamage);

		int newMaxActionPointsPerTurn = c.getMaxActionPointsPerTurn() + 1;
		c.setMaxActionPointsPerTurn(newMaxActionPointsPerTurn);

		int newCurrentActionPointsPerTurn = c.getCurrentActionPoints() + 1;
		c.setCurrentActionPoints(newCurrentActionPointsPerTurn);
	}
}
