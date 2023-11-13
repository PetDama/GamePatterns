package com.gameScene;

class Character implements Renderable {
    private String type;
    private int age;
    private Position position;

    private Character(CharacterBuilder builder) {
        this.type = builder.type;
        this.age = builder.age;
        this.position = builder.position;
    }

    @Override
    public String render() {
        return "Character: " + type + " at (" + position.x + ", " + position.y + ")";
    }

    // Builder class for Character
    static class CharacterBuilder {
        private String type;
        private int age;
        private Position position;

        CharacterBuilder(String type, int age) {
            this.type = type;
            this.age = age;
            this.position = new Position(0, 0);
        }

        CharacterBuilder position(int x, int y) {
            this.position = new Position(x, y);
            return this;
        }

        Character build() {
            return new Character(this);
        }
    }
}
