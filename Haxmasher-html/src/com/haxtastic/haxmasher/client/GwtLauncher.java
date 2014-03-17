package com.haxtastic.haxmasher.client;

import com.haxtastic.haxmasher.Haxmasher;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class GwtLauncher extends GwtApplication {
	@Override
	public GwtApplicationConfiguration getConfig () {
		GwtApplicationConfiguration cfg = new GwtApplicationConfiguration(960, 600);
		return cfg;
	}

	@Override
	public ApplicationListener getApplicationListener () {
		return new Haxmasher();
	}
}