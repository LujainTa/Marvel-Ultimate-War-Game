# Marvel Ultimate War
A 2-player board game, each player has 3 champions with distinct superpower abilities.

# About
A 2D 2-player battle game. Each player selects three champions to form his team, which will compete against the other player's team. The players take turns fighting the champions of the other player. The turns will continue until one player has defeated all of the other player's champions, at which point he will be declared the winner of the battle. During the battle, each player will use his champions to attack the opposing champions using either normal attacks or special attacks/abilities.

# How To Play?
| MOVE  | KEY | ATTACK | KEY | CAST ABILITY | KEY | CAST ABILITY | KEY | LEADER ABILITY | KEY | END TURN | KEY |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| ⬆️ | W | ⬆️ | Y | ⬆️ | V | Single Target | K | Use Leader Ability | U | End Turn | E |
| ⬅️ | A | ⬅️ | G | ⬅️ | N | Self Target | Z |
| ➡️ | S | ➡️ | H | ➡️ | M | Surround | X |
| ⬇️ | D | ⬇️ | J | ⬇️ | B | Team Target | C |

# Main Menu:
![Scene 1](https://user-images.githubusercontent.com/67235119/174088079-61c2e121-ce83-4816-bfc5-10cb7d60b2d9.png)

# Enter Your Names:
![Scene 2](https://user-images.githubusercontent.com/67235119/174088579-07e757dd-aa08-4357-801c-b2490c6b83d3.png)

# Pick Your Champions:
![Scene 3](https://user-images.githubusercontent.com/67235119/174088706-280d39d6-edf0-4e35-8e6f-9f1b449fc99e.png)

# Picking Leaders:
![Scene 4](https://user-images.githubusercontent.com/67235119/174088872-771dc098-dd50-48f4-b812-562ee3873176.png)

# Board:
![Board](https://user-images.githubusercontent.com/67235119/174089048-8dce424b-d06f-410f-9190-5f053f83c509.png)

# Champions
Champions are the fighters that each player will form his team from. Each champion will have a certain type which influences how the champion deals damage to other types as well as how much damage it will receive from them. The available types are :-

- **Heroes**: they deal extra damage when attacking villains.
- **Villains**: they deal extra damage when attacking heroes.
- **Anti-Heroes**: when being attacked or attacking a hero or villain, the antihero will always act as the opposite type. If attacking an antihero, damage is calculated normally.

Each champion has the following attributes and characteristics:

- **Health points**: Represents the life of the champion. As long as the value of this attribute is bigger than zero, the champion will remain alive and can act in the game. Once the value of this attribute reaches zero, the champion is considered dead and hence, eliminated from the fight.
- **Mana**: a resource that a champion uses to use his abilities. Each time a player uses an ability, a certain amount of mana will be consumed. Once run out, the champion cannot use any of his abilities.
- **Normal attack damage**: The amount of damage that the champion will inflict upon the attacked champion while using a normal attack. This amount will be deducted from the attacked champion’s health points.
- **Normal attack range**: The maximum number of cells that the attacker’s normal attack can reach the attacked champion within. If the attacked champion is standing in distance greater than this range, the attacker can not use a normal attack on him.
  - Range is calculated by the Manhattan distance algorithm.
- **Speed**: Determines how fast the champion is. The faster the champion, the sooner he can carry out his actions before other champions.
- **Condition**: Represents the current ability/inability of the champion to act. The champion can be active (can do some actions), inactive (can not do any actions until he is back to active), or knocked out (defeated and can not do any action till the end of the game). Possible conditions are:
  - Active: Champion can move, attack and cast abilities
  - Inactive: Champion cannot be used by player, usually due to a 'Stun' effect. But once the effect is removed the player can move, attack, and cast abilities using this champion again
  - Rooted: Has 'Rooted' effect and thus cannot move. Can still attack and cast abilities
  - Knocked out: Champion has been killed, will be moved from the board and won't be usable anymore
- **Actions per turn**: A number representing how many actions a player can do with the champion during each of his turns. Each action will consume a certain amount of this number. Once it reaches zero, no more actions can be done by this champion during this turn. This attribute resets each time the turn goes to the champion. Possible actions that can be done by a champion during his turn:
  - Move to an empty cell.
  - Do a normal attack.
  - Cast an ability.
  - Use Leader Ability (only if champion is the player’s chosen leader)
  
# Abilities
These are special attacks that a champion can use. They are categorized under the following categories:-

- **Damaging abilities**: Abilities that deal damage to the opponent champion(s) or covers.
- **Healing abilities**: Abilities that restore health points to friendly champion(s).
- **Effect abilities**: Abilities that can empower or weaken their targets by applying different effects. These effects can last for multiple turns and will affect how the affected champion interacts or reacts to abilities or attacks.
  - **Example of some effects**: stun, weaken, embrace, shield, silence, disarm.

Abilities have different targets and ranges. Some abilities are single target abilities which affect only a single champion (or a cover in some cases) per use. Or can affect any champion standing in a certain area (area of effect). These areas can be directional (Horizontal or Vertical), or Circuilar (affect an area surrounding a central point). Finally, some abilities can affect all friendly or opposing champions.

Each ability requires a certain amount of action points to be present in the champion casting them as well as some mana. Also, each ability has a specific range of cells that the target needs to be present in it in order for the ability to affect it.

# Leader Abilities
At the beginning of the battle, each player promotes one of his champions to be the leader of his team. The leader will then receive a special ability based on his type that can be used only once per battle.
