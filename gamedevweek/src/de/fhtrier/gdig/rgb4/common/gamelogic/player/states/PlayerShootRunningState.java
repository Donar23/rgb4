package de.fhtrier.gdig.rgb4.common.gamelogic.player.states;

import org.newdawn.slick.SlickException;

import de.fhtrier.gdig.engine.entities.Entity;
import de.fhtrier.gdig.engine.management.Factory;
import de.fhtrier.gdig.rgb4.common.gamelogic.player.Player;
import de.fhtrier.gdig.rgb4.common.gamelogic.player.states.identifiers.PlayerActions;
import de.fhtrier.gdig.rgb4.identifiers.Assets;
import de.fhtrier.gdig.rgb4.identifiers.Constants;
import de.fhtrier.gdig.rgb4.identifiers.EntityOrder;

public class PlayerShootRunningState extends PlayerAssetState {

	public PlayerShootRunningState(Player player, Factory factory)
			throws SlickException {
		super(player, Assets.PlayerShootRunningAnimId,
				Assets.PlayerShootRunningImagePath, EntityOrder.Player, factory);
	}

	@Override
	public void enter() {
	}

	@Override
	public void leave() {
	}

	@Override
	public void update() {
	
		// check if vel < threshold --> stop running
		if (Math.abs(getPlayer().getVel()[Entity.X]) < Constants.GamePlayConstants.playerIdleTriggerSpeed) {
			getPlayer().applyAction(PlayerActions.StopRunning);
		}
	}
}
