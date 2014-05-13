package com.samspeck.logic;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameRenderer {
    private GameWorld world;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    public GameRenderer(GameWorld world) {
        this.world = world;

        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);

        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render() {
        System.out.println("GameRenderer - render");

                /*
         * 2. We draw the Filled rectangle
         */

        // Tells shapeRenderer to begin drawing filled shapes
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        // Chooses RGB Color of 87, 109, 120 at full opacity
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        // Draws the rectangle from myWorld (Using ShapeType.Filled)
        shapeRenderer.rect(world.getRect().x, world.getRect().y,
                world.getRect().width, world.getRect().height);

        // Tells the shapeRenderer to finish rendering
        // We MUST do this every time.
        shapeRenderer.end();

        /*
         * 3. We draw the rectangle's outline
         */

        // Tells shapeRenderer to draw an outline of the following shapes
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);

        // Chooses RGB Color of 255, 109, 120 at full opacity
        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        // Draws the rectangle from myWorld (Using ShapeType.Line)
        shapeRenderer.rect(world.getRect().x, world.getRect().y,
                world.getRect().width, world.getRect().height);

        shapeRenderer.end();
    }
}
