
package com.thevoxelbox.voxelgadget.modifier;

import org.bukkit.block.Block;

/**
 * @author CalDaBeast
 */
abstract class AbstractStampMode {

	public abstract void setBlock(Block block, ComboBlock newBlock, ComboBlock blueprintBlock);
	public abstract boolean countAsBlockFromBlueprint(Block block, ComboBlock newBlock);
}
