package net.craftedbymikko.brickable;

import net.craftedbymikko.brickable.block.ModBlocks;
import net.craftedbymikko.brickable.creativemodetab.ModCreativeModeTabs;
import net.craftedbymikko.brickable.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Brickable implements ModInitializer {
	public static final String MOD_ID = "brickable";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModCreativeModeTabs.registerModCreativeModeTabs();


		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
