package model.world;

import java.util.ArrayList;

public class Villain extends Champion {

	public Villain(String name, int maxHP, int mana, int maxActions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, mana, maxActions, speed, attackRange, attackDamage);
		super.setCurrentHP(maxHP);
	}

	public String toString2() {
		return "Type: Villain" + '\n' + super.toString2();
	}

	public void useLeaderAbility(ArrayList<Champion> targets) {
		int size = targets.size();

		for (int i = 0; i < size; i++) {
			targets.get(i).setCondition(Condition.KNOCKEDOUT);
			targets.get(i).setCurrentHP(0);
		}
	}

}
