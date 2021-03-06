# Monopoly
This is a repository for replicating Monopoly in Java.

## Motivation
Monopoly is a reasonably complex board game, we wanted to challenge our CS knowledge and create Monopoly in a variety of languages including **Python**, **JavaScript**, and **Java**.

## How Does It Work?
Monopoly uses a large while loop and a set of Queues (Players, Community Chest Cards, and Chance Cards) and arrays (Property and Ownership for each player).

### Setup Phase
Monopoly first starts by first prompting the number of players and their names. It then takes in these responses, assigns everyone a random roll, assigns them with the starting amount of cash, transforms these values as a Player object, and places it in a Queue.

### Game Phase
Monopoly then starts the game by entiring a while loop which continues to loop until there is one player left. It first extracts the player from the queue. It first checks if the player is bankrupt and removes them from the queue if they are and loops to the beginning again. After checking that the player does not have negative balance and not bankrupt, it then assigns the player the sum of two random values to mimic a dice roll. From there, the player is then moved the distance of the roll. From here the Player can have two set paths, one where the player lands is a property and one where the property isn't. If the player lands on a property, the player is then prompted to bid the property or buy it. If the player landed on a place which is not a property, then the attribute of that card is then intiated. Afterwords, the player then can decide to place a house on a property, trade with another player, or even mortgage a property then own. When the player is done with their actions, the player is then inserted back into the queue of players at the end nad loops back to the beginning.

### Victory Phase
After there is one player left, the victor is decided and displayed.

## The Setup
We've fragmented our application into classes that replicate Monopoly gameplay features. As of now, we've only completed these classes in **Java**, but we intend on replicating the behavior in other languages.

- ⛔️`Card.java`(Is not fully integraded within the loop)
  - ✅ `CommunityChests.java`
  - ✅ `Chance.java`
- ✅ `DiceRoller.java`
- ✅ `Player.java`
- ✅ `Property.java`
- ✅ `Trade.java`

### Card
This is an abstract class for `CommunityChest.java` and `DiceRoller.java`.

#### Community Chests
Manually adds all of the Community Chest Cards, their names, their descriptions, and assigns each an index value for lookup and card implementation.

#### Chance
Manually adds all of the Chance Cards, their names, their descriptions, and assigns each an index value for lookup and card implementation.

#### Dice Roller
This implements two dices being thrown, and implements methods that returns the randomized value and rerolling the dice.

#### Player
This implements the struture of each player, such as the name of the player, their balance, their position, their state (Bankruptcy and if they are in jail), and the properties they own

#### Property
This implements the structure of all 40 properties of monopoly, such as the name of the property, their position on the board, their atributes, and the family (which color) they belong to.

#### Trade
This implements the exchange of valuables (Properties and cash) players after the intial movement of the player is done.

(c) 2018 Dan Yang, Su Min Kim, Sam Olagun, Yen Lu
