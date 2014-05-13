package com.samspeck.cookiebird;

import com.badlogic.gdx.Game;
import com.samspeck.Screens.GameScreen;

public class CBGame extends Game {
    @Override
    public void create() {
        System.out.println("CBGame Created!");
        setScreen(new GameScreen());
    }
}
