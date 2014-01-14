package com.ukiitan.androidgames.framework;

/**
 * Can create Musics or Sounds
 * @author ukiitan
 *
 */
public interface Audio {
	/**
	 * Return Music instance
	 * @param filename
	 * @return
	 */
    public Music newMusic(String filename);

    /**
     * Return Sound instance
     * @param filename
     * @return
     */
    public Sound newSound(String filename);
}
