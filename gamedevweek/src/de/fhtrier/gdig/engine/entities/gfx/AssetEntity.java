package de.fhtrier.gdig.engine.entities.gfx;

import de.fhtrier.gdig.demos.jumpnrun.identifiers.EntityType;
import de.fhtrier.gdig.engine.entities.Entity;
import de.fhtrier.gdig.engine.management.AssetMgr;

public class AssetEntity extends Entity {

	private int assetId;
	private AssetMgr assets;

	public AssetEntity(int id, int assetId, AssetMgr assets) {
		super(id, EntityType.ASSET);
		this.assetId = assetId;
		this.assets = assets;
		this.setVisible(false);
	}

	public AssetMgr Assets() {
		return this.assets;
	}

	public int getAssetId() {
		return assetId;
	}
}
