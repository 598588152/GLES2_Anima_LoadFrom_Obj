package com.xiaxl.gl_load_obj.gl.spirit;

import android.util.Log;

import com.xiaxl.gl_load_obj.gl.scene.LeGLBaseScene;
import com.xiaxl.gl_load_obj.gl.utils.MatrixState;

/**
 * 
 * @author xiaxveliang
 *
 */
public class LeGLObjSprite extends LeGLBaseSpirit {
	private static final String TAG = LeGLObjSprite.class.getSimpleName();

	public LeGLObjSprite(LeGLBaseScene scene, float[] vertices, float[] normals, float texCoors[]) {
		super(scene,vertices,normals,texCoors);
	}

	@Override
	public void drawSelf(int texId, long drawTime) {
		MatrixState.pushMatrix();

		// 缩放
		MatrixState.scale(this.getSpriteScale(),
				this.getSpriteScale(), this.getSpriteScale());
		// 旋转
		MatrixState.rotate(this.getSpriteAngleX(), 1, 0, 0);
		// 旋转
		MatrixState.rotate(this.getSpriteAngleY(), 0, 1, 0);
		//
		super.drawSelf(texId, drawTime);

		MatrixState.popMatrix();

	}

}