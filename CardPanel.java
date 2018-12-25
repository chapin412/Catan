package application;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;


public class CardPanel {
	
	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();	
	JTabbedPane cardpanel = new JTabbedPane();//panel of card that player has
	JPanel resourcepanel = new JPanel();//resourcecardTab
	JPanel devpanel = new JPanel();//developcardTab
	
	JLabel[] resourcenum = {new JLabel("×"+0),
							new JLabel("×"+0),
							new JLabel("×"+0),
							new JLabel("×"+0),
							new JLabel("×"+0)};
	JLabel[] devnum = { new JLabel("×"+0),
						new JLabel("×"+0),
						new JLabel("×"+0),
						new JLabel("×"+0),
						new JLabel("×"+0)};
		
	//playerの所持カード生成メソッド	
	public void setCardPanel() {
	
		//panel of resourcecard
		this.resourcepanel.setBackground(Color.DARK_GRAY);
		SpringLayout splayout_r = new SpringLayout();
		resourcepanel.setLayout(splayout_r);
		
		//set resourcecard
		ImageIcon[] resourcecard = {	new ImageIcon("../MyCatan/Resources/Images/card/tree.png"),
										new ImageIcon("../MyCatan/Resources/Images/card/brick.png"),
										new ImageIcon("../MyCatan/Resources/Images/card/wheat.png"),
										new ImageIcon("../MyCatan/Resources/Images/card/sheep.png"),
										new ImageIcon("../MyCatan/Resources/Images/card/iron.png")	};
			
		JLabel[] resourcelabel = {	new JLabel(resourcecard[0]),
							 		new JLabel(resourcecard[1]),
							 		new JLabel(resourcecard[2]),
							 		new JLabel(resourcecard[3]),
							 		new JLabel(resourcecard[4])	};
		
		//panel of developcard
		devpanel.setBackground(Color.DARK_GRAY);
		SpringLayout splayout_d = new SpringLayout();
		devpanel.setLayout(splayout_d);
		
		//set devcard
		ImageIcon[] devcard = {	new ImageIcon("../MyCatan/Resources/Images/card/tree.png"),
								new ImageIcon("../MyCatan/Resources/Images/card/brick.png"),
								new ImageIcon("../MyCatan/Resources/Images/card/wheat.png"),
								new ImageIcon("../MyCatan/Resources/Images/card/sheep.png"),
								new ImageIcon("../MyCatan/Resources/Images/card/iron.png")	};
			
		JLabel[] devlabel = {new JLabel(devcard[0]),
							 new JLabel(devcard[1]),
							 new JLabel(devcard[2]),
							 new JLabel(devcard[3]),
							 new JLabel(devcard[4])};
			
		for (int i=0; i<5; i++) {
			resourcelabel[i].setIcon(resourcecard[i]);
			splayout_r.putConstraint(SpringLayout.NORTH, resourcelabel[i], 50, SpringLayout.NORTH, resourcepanel);
			splayout_r.putConstraint(SpringLayout.WEST, resourcelabel[i], 60+140*i, SpringLayout.WEST, resourcepanel);
			resourcepanel.add(resourcelabel[i]);
			
			devlabel[i].setIcon(devcard[i]);
			splayout_d.putConstraint(SpringLayout.NORTH, devlabel[i], 50, SpringLayout.NORTH, devpanel);
			splayout_d.putConstraint(SpringLayout.WEST, devlabel[i], 60+140*i, SpringLayout.WEST, devpanel);
			devpanel.add(devlabel[i]);
			
			resourcenum[i].setFont(new Font(Font.SERIF,Font.ITALIC,35));
			devnum[i].setFont(new Font(Font.SERIF,Font.ITALIC,35));
			resourcenum[i].setForeground(Color.YELLOW);
			devnum[i].setForeground(Color.YELLOW);
			splayout_r.putConstraint(SpringLayout.NORTH, resourcenum[i], 240, SpringLayout.NORTH, resourcepanel);
			splayout_r.putConstraint(SpringLayout.WEST, resourcenum[i], 90+140*i, SpringLayout.WEST, resourcepanel);
			splayout_d.putConstraint(SpringLayout.NORTH, devnum[i], 240, SpringLayout.NORTH, devpanel);
			splayout_d.putConstraint(SpringLayout.WEST, devnum[i], 90+140*i, SpringLayout.WEST, devpanel);
			resourcepanel.add(resourcenum[i]);
			devpanel.add(devnum[i]);
			
			}
		
		//Tabの設定
		cardpanel.addTab("      資 源      ", resourcepanel);
		cardpanel.addTab("      発 展      ", devpanel);
		cardpanel.setBackgroundAt(0, new Color(100,155,100));
		cardpanel.setBackgroundAt(1, new Color(205,205,100));
		
		//TabbedPanel
		cardpanel.setBackground(new Color(100,200,255));
		cardpanel.setPreferredSize(new Dimension(screen.width*800/1920, screen.height*375/1080));
		cardpanel.setOpaque(true);
	}
	
	//reflesh number of cards
	public void RepaintCardNum(boolean res, int[] card) {
			if(res == true) {
				for(int i=0; i<5; i++) {
					resourcenum[i].setText("×"+ card[i]);
				}
				resourcepanel.repaint();
			}
			else {
				for(int i=0; i<5; i++) {
					devnum[i].setText("×"+ card[i]);
				}
				devpanel.repaint();
			}
	}
}
