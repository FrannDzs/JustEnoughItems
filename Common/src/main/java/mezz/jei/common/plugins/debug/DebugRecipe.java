package mezz.jei.common.plugins.debug;

import net.minecraft.client.gui.components.Button;

import mezz.jei.common.gui.HoverChecker;
import net.minecraft.network.chat.Component;

public class DebugRecipe {
	private final Button button;
	private final HoverChecker buttonHoverChecker;

	public DebugRecipe() {
		this.button = new Button(0, 0, 40, 20, Component.literal("test"), b -> {
		});
		this.buttonHoverChecker = new HoverChecker();
		this.buttonHoverChecker.updateBounds(this.button);
	}

	public Button getButton() {
		return button;
	}

	public boolean checkHover(double mouseX, double mouseY) {
		return buttonHoverChecker.checkHover(mouseX, mouseY);
	}
}
