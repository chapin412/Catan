package application;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import application.Player;

public class PlayerPanel {
	
	SpringLayout[] splayout_p = {new SpringLayout(),
								 new SpringLayout(),
								 new SpringLayout(),
								 new SpringLayout()};
	
	JPanel[] panel = {new JPanel(),
					  new JPanel(),
					  new JPanel(),
					  new JPanel()};
	
	Player[] player = {new Player(),
					   new Player(),
					   new Player(),
					   new Player()};
	
	void setPalayerPanel(int num) {
		for(int i=0; i<num; i++) {
			panel[i].setPreferredSize(new Dimension(300,200));
			panel[i].setBackground(Color.WHITE);
			panel[i].setLayout(splayout_p[i]);
			panel[i].setOpaque(true);
		}
	}
}

