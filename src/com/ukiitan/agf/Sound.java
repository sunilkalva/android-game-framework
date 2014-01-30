package com.ukiitan.agf;

/**
 * Manage a sound (short file fully loaded - easily to play it several times)
 * @author ukiitan
 *
 */
public interface Sound {
   
	/**
	 * Play the sound with a specific volume
	 * @param volume
	 */
	public void play(float volume);

    /**
     * Close sound file and clean memory
     */
    public void dispose();

}
