package com.burright.soup.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.burright.soup.Soup;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Soup";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Soup(), config);
	}
}
