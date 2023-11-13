package com.gameScene;

import java.util.ArrayList;
import java.util.List;

class Group implements Renderable {
    private List<Character> characters;

    private Group(GroupBuilder builder) {
        this.characters = builder.characters;
    }

    @Override
    public String render() {
        StringBuilder groupInfo = new StringBuilder("Group:\n");
        for (Character character : characters) {
            groupInfo.append("   - ").append(character.render()).append("\n");
        }
        return groupInfo.toString();
    }

    List<Character> getCharacters() {
        return characters;
    }

    // Builder class for Group
    static class GroupBuilder {
        private List<Character> characters;

        GroupBuilder() {
            this.characters = new ArrayList<>();
        }

        GroupBuilder addCharacter(Character character) {
            this.characters.add(character);
            return this;
        }

        Group build() {
            return new Group(this);
        }
    }
}