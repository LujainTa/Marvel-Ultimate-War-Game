package model.effects;

import model.world.Champion;

public class SpeedUp extends Effect {

	public SpeedUp(int duration) {
		super("SpeedUp", duration, EffectType.BUFF);
	}

	public void apply(Champion c) {
		int speed = (int) (c.getSpeed() * 1.15);
		c.setSpeed(speed);

		int newMaxActionPointsPerTurn = c.getMaxActionPointsPerTurn() + 1;
		c.setMaxActionPointsPerTurn(newMaxActionPointsPerTurn);

		int newCurrentActionPointsPerTurn = c.getCurrentActionPoints() + 1;
		c.setCurrentActionPoints(newCurrentActionPointsPerTurn);
	}

	public void remove(Champion c) {
		int speed = (int) (c.getSpeed() / 1.15);
		c.setSpeed(speed);

		int newMaxActionPointsPerTurn = c.getMaxActionPointsPerTurn() - 1;
		c.setMaxActionPointsPerTurn(newMaxActionPointsPerTurn);

		int newCurrentActionPointsPerTurn = c.getCurrentActionPoints() - 1;
		c.setCurrentActionPoints(newCurrentActionPointsPerTurn);
	}
}
