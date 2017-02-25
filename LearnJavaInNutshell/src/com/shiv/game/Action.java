package com.shiv.game;

/**
 * Created by shiv on 24/2/17.
 */
public class Action implements Game {

    private int totalHrs;

    @Override
    public String gameType() {
        return new String("Action");
    }

    @Override
    public int gamePlay() {
        return totalHrs;
    }

    public Action(int totalHrs) {
        this.totalHrs = totalHrs;
    }

    class GameSettings implements GameSettingsDefaults {

        private boolean fullScreen;
        private int brightness;
        private int dificulty;

        public GameSettings() {
            this.fullScreen = GameSettingsDefaults.FULLSCREEN;
            this.brightness = GameSettingsDefaults.BRIGHTNESS;
            this.dificulty = GameSettingsDefaults.DIFFICULTY;
        }

        public GameSettings(boolean fullScreen, int brightness, int dificulty) {
            this.fullScreen = fullScreen;
            this.brightness = brightness;
            this.dificulty = dificulty;
        }
    }

    

}
