package com.ukiitan.androidgames.framework;

/**
 * Manage a screen
 * @author ukiitan
 *
 */
public abstract class Screen {
    
	/**
	 * Screen contains Game to access low-level modules easily
	 */
	protected final Game game;

    /**
     * Screen constructor
     * @param game
     */
    public Screen(Game game) {
        this.game = game;
    }

    /**
     * Update screen state (ex: update variable after received inputEvent)
     * @param deltaTime
     */
    public abstract void update(float deltaTime);

    /**
     * Render the screen after updates
     * @param deltaTime
     */
    public abstract void render(float deltaTime);

    /**
     * Put screen on pause
     */
    public abstract void pause();

    /**
     * Resume screen
     */
    public abstract void resume();

    /**
     * Delete screen and clean memory
     */
    public abstract void dispose();
}
