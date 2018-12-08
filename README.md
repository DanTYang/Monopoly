# Monopoly
This is a repository for replicating Monopoly in Java.

## Motivation
Monopoly is a reasonably complex board game, we wanted to challenge our CS knowledge and create Monopoly in a variety of languages including **Python**, **JavaScript**, and **Java**.

## How Does It Work?
Monopoly uses a large while loop and a set of Queues (Players, Community Chest Cards, and Chance Cards) and arrays (Property and Ownership for each player).

  ### Setup Phase
Monopoly first starts by first prompting the number of players and their names. It then takes in these responses, assigns everyone a random roll, assigns them with the starting amount of cash, transforms these values as a Player object, and places it in a Queue.

  ### Game Phase
Monopoly then starts the game by entiring a while loop which continues to loop until there is one player left. It first extracts the player from the queue and assigns the player the sum of two random values to mimic a dice roll. From there, the player is then moved the distance of the roll. From here the Player can have two set paths, one where the player lands is a property and one where the property isn't. 

## The Setup
We've fragmented our application into classes that replicate Monopoly gameplay features. As of now, we've only completed these classes in **Java**, but we intend on replicating the behavior in other languages.

- ⛔️`Card.java`
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

#### Dice Roller

(c) 2018 Dan Yang, Su Min Kim, Sam Olagun, Yen Lu
