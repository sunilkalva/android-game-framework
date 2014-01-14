package com.ukiitan.androidgames.framework;

/**
 * Manage Game and access low-level modules
 * @author ukiitan
 *
 */
public interface Game {
	
	/**
	 * Get Input Module
	 * @return
	 */
    public Input getInput();

    /**
     * Get FileIO Module
     * @return
     */
    public FileIO getFileIO();

    /**
     * Get Graphics Module
     * @return
     */
    public Graphics getGraphics();

    /**
     * Get Audio Module
     * @return
     */
    public Audio getAudio();

    /**
     * Set Current Screen
     * @param screen
     */
    public void setScreen(Screen screen);

    /**
     * Get Current Screen
     * @return
     */
    public Screen getCurrentScreen();

    /**
     * Get the screen the game start on
     * @return
     */
    public Screen getStartScreen();
}