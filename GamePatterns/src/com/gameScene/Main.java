package com.gameScene;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        // Create characters using the Builder pattern
        Character human = new Character.CharacterBuilder("Human", 25)
                .position(1, 1)
                .build();

        Character elf = new Character.CharacterBuilder("Elf", 150)
                .position(3, 3)
                .build();

        // Create a group using the Builder pattern
        Group group = new Group.GroupBuilder()
                .addCharacter(human)
                .addCharacter(elf)
                .build();

        // Create buildings using the Builder pattern
        Building europeanHouse = new Building.BuildingBuilder("Concrete")
                .position(2, 2)
                .size(3, 3)
                .build();

        Building asianHouse = new Building.BuildingBuilder("Bamboo")
                .position(5, 5)
                .size(2, 2)
                .build();

        // Add objects to the game and render
        game.addCharacter(human);
        game.addGroup(group);
        game.addBuilding(europeanHouse);
        game.addBuilding(asianHouse);
    }
}