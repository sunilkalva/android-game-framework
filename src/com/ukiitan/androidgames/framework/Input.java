package com.ukiitan.androidgames.framework;

import java.util.List;

/**
 * Manage Keyboard, Screen touch and Accelerometer
 * @author ukiitan
 */
public interface Input {
	
	/**
	 * Event relative to the keyboard
	 */
    public static class KeyEvent {
    	/**
    	 * Types
    	 */
        public static final int KEY_DOWN = 0;
        public static final int KEY_UP = 1;

        public int type;
        public int keyCode;
        public char keyChar;

        public String toString() {
            StringBuilder builder = new StringBuilder();
            if (type == KEY_DOWN) {
            	builder.append("key down, ");
            }
            else {
            	builder.append("key up, ");
            }
            builder.append(keyCode);
            builder.append(",");
            builder.append(keyChar);
            return builder.toString();
        }
    }

	/**
	 * Event relative to screen touch
	 */
    public static class TouchEvent {
    	/**
    	 * Types
    	 */
        public static final int TOUCH_DOWN = 0;
        public static final int TOUCH_UP = 1;
        public static final int TOUCH_DRAGGED = 2;

        public int type;
        
        /**
         * Positions x and y
         */
        public int x, y;
        
        /**
         * PointerId relative to a finger
         */
        public int pointerId;

        public String toString() {
            StringBuilder builder = new StringBuilder();
            if (type == TOUCH_DOWN) {
            	builder.append("touch down, ");
            }
            else if (type == TOUCH_DRAGGED) {
            	builder.append("touch dragged, ");
            }
            else {
            	builder.append("touch up, ");
            }
            builder.append(pointerId);
            builder.append(",");
            builder.append(x);
            builder.append(",");
            builder.append(y);
            return builder.toString();
        }
    }

    /**
     * Compare key codes and return if keyCode is pressed or not
     * @param keyCode
     */
    public boolean isKeyPressed(int keyCode);

    /**
     * Check if a pointer is down
     * @param pointerId
     */
    public boolean isTouchDown(int pointerId);

    /**
     * Return position X of a pointer
     * @param pointerId
     */
    public int getTouchX(int pointerId);

    /**
     * Return position Y of a pointer
     * @param pointerId
     */
    public int getTouchY(int pointerId);

    /**
     * Return acceleration value of accelerometer axis X
     */
    public float getAccelX();

    /**
     * Return acceleration value of accelerometer axis Y
     */
    public float getAccelY();

    /**
     * Return acceleration value of accelerometer axis Z
     */
    public float getAccelZ();

    /**
     * Contains KeyEvents
     */
    public List<KeyEvent> getKeyEvents();

    /**
     * Contains TouchEvents
     */
    public List<TouchEvent> getTouchEvents();
}
