package model.effects;

import model.world.Champion;

public class Silence extends Effect {

	public Silence(int duration) {
		super("Silence", duration, EffectType.DEBUFF);
	}

	public void apply(Champion c) {
		int newMaxActionPointsPerTurn = c.getMaxActionPointsPerTurn() + 2;
		c.setMaxActionPointsPerTurn(newMaxActionPointsPerTurn);

		int newCurrentActionPointsPerTurn = c.getCurrentActionPoints() + 2;
		c.setCurrentActionPoints(newCurrentActionPointsPerTurn);
	}

	public void remove(Champion c) {
		int newMaxActionPointsPerTurn = c.getMaxActionPointsPerTurn() - 2;
		c.setMaxActionPointsPerTurn(newMaxActionPointsPerTurn);

		int newCurrentActionPointsPerTurn = c.getCurrentActionPoints() - 2;
		c.setCurrentActionPoints(newCurrentActionPointsPerTurn);
	}
}
