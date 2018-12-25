package application;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class FieldPanel {
	
	SpringLayout splayout_f = new SpringLayout();
	JPanel fieldpanel = new JPanel(splayout_f);
	
	void setFieldPanel() {
		
		ImageIcon[] tileimg = {	new ImageIcon(("../MyCatan/Resources/Images/tile/seatile.png")),
								new ImageIcon(("../MyCatan/Resources/Images/tile/bricktile.png")),
								new ImageIcon(("../MyCatan/Resources/Images/tile/treetile.png")),
								new ImageIcon(("../MyCatan/Resources/Images/tile/irontile.png")),
								new ImageIcon(("../MyCatan/Resources/Images/tile/wheattile.png")),
								new ImageIcon(("../MyCatan/Resources/Images/tile/sheeptile.png")),
								new ImageIcon(("../MyCatan/Resources/Images/tile/deserttile.png"))};
		
		JLabel[][] tilelabel = {{new JLabel(),new JLabel(),new JLabel()},
							{new JLabel(),new JLabel(),new JLabel(),new JLabel()},
						{new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel()},
							{new JLabel(),new JLabel(),new JLabel(),new JLabel()},
								{new JLabel(),new JLabel(),new JLabel()}};
		
		for(int i=0; i<5; i+=4) {
				for(int j=0; j<3; j++) {
					tilelabel[i][j].setIcon(tileimg[2]); 
					splayout_f.putConstraint(SpringLayout.NORTH, tilelabel[i][j], i*90, SpringLayout.NORTH, fieldpanel);
					splayout_f.putConstraint(SpringLayout.WEST, tilelabel[i][j], 120+j*120, SpringLayout.WEST, fieldpanel);
					fieldpanel.add(tilelabel[i][j]);
				}
			}
		for(int i=1; i<5; i+=2) {
			for(int j=0; j<4; j++) {
				tilelabel[i][j].setIcon(tileimg[5]); 
				splayout_f.putConstraint(SpringLayout.NORTH, tilelabel[i][j], 90+(i-1)*90, SpringLayout.NORTH, fieldpanel);
				splayout_f.putConstraint(SpringLayout.WEST, tilelabel[i][j], 60+j*120, SpringLayout.WEST, fieldpanel);
				fieldpanel.add(tilelabel[i][j]);
			}
		}
		for(int j=0; j<5; j++) {
			tilelabel[2][j].setIcon(tileimg[3]); 
			splayout_f.putConstraint(SpringLayout.NORTH, tilelabel[2][j], 180, SpringLayout.NORTH, fieldpanel);
			splayout_f.putConstraint(SpringLayout.WEST, tilelabel[2][j], j*120, SpringLayout.WEST, fieldpanel);
			fieldpanel.add(tilelabel[2][j]);
		}
		
		fieldpanel.setPreferredSize(new Dimension(600,480));
		fieldpanel.setBackground(Color.GREEN);
		fieldpanel.setOpaque(false);
		
		
		
	}

}
