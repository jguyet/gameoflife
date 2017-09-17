package org.gameofthelife.graphics.objects;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.gameofthelife.client.Main;
import org.gameofthelife.client.network.messages.SetSettingsMessage;

public class MenuBar extends JMenuBar{

	/**
	 * VERSION
	 */
	private static final long serialVersionUID = 1L;
	
	JMenu		button_help			= new JMenu("Help");
	JMenuItem	pause				= new JMenuItem("Pause/Play", KeyEvent.VK_SPACE);
	JMenu		button_resetMap		= new JMenu("Reset");
	JMenu		infosGeneration		= new JMenu("Generation:");
	JMenu		generationN			= new JMenu("0");
	JMenu		count				= new JMenu("Particls:");
	JMenu		particlCount		= new JMenu("0");
	
	public MenuBar() {
		super();
		
		button_help.setMnemonic(KeyEvent.VK_H);
		button_help.add(pause);
		this.add(button_help);
		/**
		 * Mouse Listener
		 */
		button_resetMap.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				//send refresh
				Main.sockClient.sendMessage(new SetSettingsMessage(Main.mapX, Main.mapY, Main.refreshTime, Main.population_max_life));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		this.add(button_resetMap);
		this.add(infosGeneration);
		this.add(generationN);
		this.add(count);
		this.add(particlCount);
	}
	
	public void setgenerationCount(int gcount) {
		generationN.setText(gcount + "");
	}
	
	public void setparticlsCount(int count) {
		particlCount.setText(count + "");
	}
}
