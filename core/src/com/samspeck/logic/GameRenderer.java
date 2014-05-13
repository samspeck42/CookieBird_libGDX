package com.samspeck.logic;

public class GameRenderer {
    private GameWorld world;

    public GameRenderer(GameWorld world) {
        this.world = world;
    }

    public void render() {
        System.out.println("GameRenderer - render");
    }
}
