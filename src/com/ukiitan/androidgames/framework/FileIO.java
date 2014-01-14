package com.ukiitan.androidgames.framework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Manage Files Input and Output streams
 * @author ukiitan
 *
 */
public interface FileIO {
	/**
	 * Read file from the application
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
    public InputStream readAsset(String fileName) throws IOException;

	/**
	 * Read file from SD Card
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
    public InputStream readFile(String fileName) throws IOException;

    /**
     * Write file on SD Card
     * @param fileName
     * @return
     * @throws IOException
     */
    public OutputStream writeFile(String fileName) throws IOException;
}
