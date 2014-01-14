package com.ukiitan.androidgames.framework;

/**
 * Manage framebuffer (draw pixels, rectangles, images...)
 * @author ukiitan
 *
 */
public interface Graphics {
    
	/**
	 * Format of images
	 * @author ukiitan
	 *
	 */
	public static enum PixmapFormat {
        ARGB8888, 
        ARGB4444, 
        RGB565
    }

	/**
	 * Load an image
	 * @param fileName
	 * @param format
	 * @return
	 */
    public Pixmap newPixmap(String fileName, PixmapFormat format);

    /**
     * Clears the complete framebuffer with a given color
     * @param color
     */
    public void clear(int color);

    /**
     * Set the color of a specific pixel
     * @param x
     * @param y
     * @param color
     */
    public void drawPixel(int x, int y, int color);

    /**
     * Draw a line between two positions
     * @param x
     * @param y
     * @param x2
     * @param y2
     * @param color
     */
    public void drawLine(int x, int y, int x2, int y2, int color);

    /**
     * Draw a rectangle of specific width and height where top-left position is in (x,y)
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color
     */
    public void drawRect(int x, int y, int width, int height, int color);

    /**
     * Draw part of an image where top-left position is in (x,y)
     * (srcX, srcY) top-left position in the image 
     * (srcWidth, srcHeight) size of the image we want to draw from its top-left position
     * @param pixmap
     * @param x
     * @param y
     * @param srcX
     * @param srcY
     * @param srcWidth
     * @param srcHeight
     */
    public void drawPixmap(Pixmap pixmap, int x, int y, int srcX, int srcY,
            int srcWidth, int srcHeight);

    /**
     * Draw fullsize image where top-left position is in (x,y)
     * @param pixmap
     * @param x
     * @param y
     */
    public void drawPixmap(Pixmap pixmap, int x, int y);

    /**
     * Framebuffer width in pixels
     * @return
     */
    public int getWidth();

    /**
     * Framebuffer height in pixels
     * @return
     */
    public int getHeight();
}
