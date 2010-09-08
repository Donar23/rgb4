package de.fhtrier.gdig.engine.entities.gfx;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.particles.ParticleSystem;

import de.fhtrier.gdig.engine.graphics.Shader;
import de.fhtrier.gdig.engine.management.AssetMgr;

public class ParticleEntity extends AssetEntity {

	public ParticleEntity (int id, int assetId, AssetMgr assets) {
		super(id, assetId, assets);
	}

	@Override
	public void renderImpl(Graphics graphicContext, Image frameBuffer) {
		if (isVisible()) {
			ParticleSystem system = Assets().getParticleSystem(getAssetId());
			// TODO do update somewhere else
			system.update(10);
			system.render();
		}
		super.renderImpl(graphicContext, frameBuffer);
	}
	
	@Override
	protected void preRender(Graphics graphicContext) {
		super.preRender(graphicContext);

		Shader.pushShader(null);
	}
	
	@Override
	protected void postRender(Graphics graphicContext) {

		Shader.popShader();

		super.postRender(graphicContext);
	}
}
