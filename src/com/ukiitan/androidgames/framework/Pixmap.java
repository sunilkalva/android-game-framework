package com.ukiitan.androidgames.framework;

import com.ukiitan.androidgames.framework.Graphics.PixmapFormat;

/**
 * Manage Images
 * @author ukiitan
 */
public interface Pixmap {
	
	/**
	 * Get image width in pixel
	 * @return
	 */
    public int getWidth();

    /**
     * Get image height in pixel
     * @return
     */
    public int getHeight();

    /**
     * Get format of the image
     * @return
     */
    public PixmapFormat getFormat();

    /**
     * Delete Pixmap object and clean memory
     */
    public void dispose();
}
