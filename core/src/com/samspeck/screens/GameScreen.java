package com.samspeck.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Screen;
import com.samspeck.logic.GameRenderer;
import com.samspeck.logic.GameWorld;

public class GameScreen implements Screen {
    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen() {
        System.out.println("GameScreen Attached");
        world = new GameWorld(); // initialize world
        renderer = new GameRenderer(world); // initialize renderer
    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("GameScreen - resizing");
    }

    @Override
    public void show() {
        System.out.println("GameScreen - show called");
    }

    @Override
    public void hide() {
        System.out.println("GameScreen - hide called");
    }

    @Override
    public void pause() {
        System.out.println("GameScreen - pause called");
    }

    @Override
    public void resume() {
        System.out.println("GameScreen - resume called");
    }

    @Override
    public void dispose() {
        // Leave blank
    }
}
