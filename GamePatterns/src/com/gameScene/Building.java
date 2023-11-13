package com.gameScene;

class Building implements Renderable {
    private String material;
    private Position position;
    private Size size;

    private Building(BuildingBuilder builder) {
        this.material = builder.material;
        this.position = builder.position;
        this.size = builder.size;
    }

    @Override
    public String render() {
        return "Building (" + material + ") at (" + position.x + ", " + position.y + ")";
    }

    // Builder class for Building
    static class BuildingBuilder {
        private String material;
        private Position position;
        private Size size;

        BuildingBuilder(String material) {
            this.material = material;
            this.position = new Position(0, 0);
            this.size = new Size(1, 1); // Default size
        }

        BuildingBuilder position(int x, int y) {
            this.position = new Position(x, y);
            return this;
        }

        BuildingBuilder size(int width, int length) {
            this.size = new Size(width, length);
            return this;
        }

        Building build() {
            return new Building(this);
        }
    }
}
