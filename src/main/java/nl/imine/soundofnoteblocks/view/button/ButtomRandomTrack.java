package nl.imine.soundofnoteblocks.view.button;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import nl.imine.api.gui.Container;
import nl.imine.api.util.ColorUtil;
import nl.imine.api.util.ItemUtil;
import nl.imine.soundofnoteblocks.controller.TrackManager;
import nl.imine.soundofnoteblocks.model.MusicPlayer;

public class ButtomRandomTrack extends ButtonMusicPlayer {

	public ButtomRandomTrack(MusicPlayer mp, int slot) {
		super(ItemUtil.getBuilder(Material.RECORD_11).setName(ColorUtil.replaceColors("&zRandom"))
				.addLore("", ColorUtil.replaceColors("&bDid you know?"),
					ColorUtil.replaceColors("&3Shift dropping a jukebox, becomes a Getto Blaster"),
					ColorUtil.replaceColors("&9Switching it to your offhand, becomes a Walkman"),
					ColorUtil.replaceColors("&3Radio mode automaticly plays the next song"))
				.build(), mp, slot);
	}

	@Override
	public void doAction(Player player, Container container, ClickType clickType) {
		getMusicPlayer().playRandomTrack(TrackManager.getTrackArray());
		player.closeInventory();
	}

}
