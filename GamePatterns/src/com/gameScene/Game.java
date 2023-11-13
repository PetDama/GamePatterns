package com.gameScene;

import java.util.List;

class Game {
    private Board board;

    Game() {
        this.board = new Board();
    }

    void addCharacter(Character character) {
        board.render(List.of(character));
    }

    void addGroup(Group group) {
        board.render(group.getCharacters());
    }

    void addBuilding(Building building) {
        board.renderB(List.of(building));
    }
}
