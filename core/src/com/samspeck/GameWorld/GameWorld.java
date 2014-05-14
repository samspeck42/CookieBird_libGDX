package com.samspeck.GameWorld;

import com.badlogic.gdx.math.Rectangle;
import com.samspeck.GameObjects.Bird;

public class GameWorld {
    private Rectangle rect = new Rectangle(0, 0, 17, 12);
    private Bird bird;

    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;
    }
}
