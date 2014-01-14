package com.ukiitan.androidgames.framework;

/**
 * Manage Music (long file - streamed)
 * @author ukiitan
 *
 */
public interface Music {
	/**
	 * Play the music
	 */
    public void play();

    /**
     * Stop the music
     */
    public void stop();

    /**
     * Put the music on pause
     */
    public void pause();

    /**
     * Define is the music has to loop
     * @param looping
     */
    public void setLooping(boolean looping);

    /**
     * Set the volume of the music
     * @param volume
     */
    public void setVolume(float volume);

    /**
     * Return if the music is currently playing
     * @return
     */
    public boolean isPlaying();

    /**
     * Return if the music is stopped
     * @return
     */
    public boolean isStopped();

    /**
     * Return if the music is lopping
     * @return
     */
    public boolean isLooping();

    /**
     * Close music file and clean memory
     */
    public void dispose();
}
