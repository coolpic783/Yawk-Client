package net.yawk.client.gui.hub;

import java.io.IOException;

import net.yawk.client.Client;
import net.yawk.client.gui.components.PluginDisplay;
import net.yawk.client.gui.components.SearchableTextField;
import net.yawk.client.gui.components.TextField;
import net.yawk.client.gui.components.buttons.PluginDownloadButton;
import net.yawk.client.gui.components.buttons.PrivatePluginDownloadButton;
import net.yawk.client.gui.components.buttons.TextButton;
import net.yawk.client.gui.components.scrolling.ModScrollPane;
import net.yawk.client.gui.components.scrolling.PluginScrollPane;
import net.yawk.client.gui.components.scrolling.ScrollPane;
import net.yawk.client.gui.components.selectors.KeybindButton;
import net.yawk.client.gui.components.selectors.SelectorButton;
import net.yawk.client.gui.components.selectors.SelectorSystem;
import net.yawk.client.modmanager.Mod;

public class PrivatePluginSlate extends ComponentSlate{

	public PrivatePluginSlate(GuiHub hub, Client client) {
		super("Private Plugins", hub, client);
	}

	@Override
	public void init() {
		
		options.addComponent(new TextField(options, "Plugin Name"));
		options.addComponent(new TextField(options, "Plugin Password"));
		
		PluginDisplay pluginDisplay;
		options.addComponent(pluginDisplay = new PluginDisplay());
		
		options.addComponent(new PrivatePluginDownloadButton(options, pluginDisplay));
	}

	@Override
	public void keyTyped(char c, int key) throws IOException {
		options.keyPress(c, key);
	}

}