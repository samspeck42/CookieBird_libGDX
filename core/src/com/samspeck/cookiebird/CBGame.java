package com.samspeck.cookiebird;

import Helpers.AssetLoader;
import com.badlogic.gdx.Game;
import com.samspeck.Screens.GameScreen;

public class CBGame extends Game {
    @Override
    public void create() {
        System.out.println("CBGame Created!");
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
