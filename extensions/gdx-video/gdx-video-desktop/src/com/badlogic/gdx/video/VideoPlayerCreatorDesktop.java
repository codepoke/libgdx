package com.badlogic.gdx.video;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Desktop implementation of the VideoPlayerCreator
 *
 * @author Rob Bogie <rob.bogie@codepoke.net>
 *
 */
public class VideoPlayerCreatorDesktop
		extends VideoPlayerCreator {

	@Override
	public VideoPlayer create() {
		return new VideoPlayerDesktop();
	}

	@Override
	public VideoPlayer create(Viewport viewport) {
		return new VideoPlayerDesktop(viewport);
	}

	@Override
	public VideoPlayer create(Camera cam, Mesh mesh) {
		return new VideoPlayerDesktop(cam, mesh);
	}
}
