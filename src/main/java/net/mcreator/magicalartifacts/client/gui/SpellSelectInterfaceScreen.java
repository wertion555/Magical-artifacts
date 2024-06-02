package net.mcreator.magicalartifacts.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.magicalartifacts.world.inventory.SpellSelectInterfaceMenu;
import net.mcreator.magicalartifacts.network.SpellSelectInterfaceButtonMessage;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpellSelectInterfaceScreen extends AbstractContainerScreen<SpellSelectInterfaceMenu> {
	private final static HashMap<String, Object> guistate = SpellSelectInterfaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_bambardo;
	Button button_levitation;
	Button button_repulsion;

	public SpellSelectInterfaceScreen(SpellSelectInterfaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_bambardo = Button.builder(Component.translatable("gui.magical_artifacts.spell_select_interface.button_bambardo"), e -> {
			if (true) {
				MagicalArtifactsMod.PACKET_HANDLER.sendToServer(new SpellSelectInterfaceButtonMessage(0, x, y, z));
				SpellSelectInterfaceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -1, this.topPos + 37, 67, 20).build();
		guistate.put("button:button_bambardo", button_bambardo);
		this.addRenderableWidget(button_bambardo);
		button_levitation = Button.builder(Component.translatable("gui.magical_artifacts.spell_select_interface.button_levitation"), e -> {
			if (true) {
				MagicalArtifactsMod.PACKET_HANDLER.sendToServer(new SpellSelectInterfaceButtonMessage(1, x, y, z));
				SpellSelectInterfaceButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 86, this.topPos + 38, 77, 20).build();
		guistate.put("button:button_levitation", button_levitation);
		this.addRenderableWidget(button_levitation);
		button_repulsion = Button.builder(Component.translatable("gui.magical_artifacts.spell_select_interface.button_repulsion"), e -> {
			if (true) {
				MagicalArtifactsMod.PACKET_HANDLER.sendToServer(new SpellSelectInterfaceButtonMessage(2, x, y, z));
				SpellSelectInterfaceButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 70, 72, 20).build();
		guistate.put("button:button_repulsion", button_repulsion);
		this.addRenderableWidget(button_repulsion);
	}
}
