package application;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.SpringLayout;

import java.awt.*;

public class Main extends JFrame
{
	static public void main(String[] args)
	{
		Main main = new Main();
		main.setTitle("Catan");
		main.setLocationRelativeTo(null);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		main.setBounds(0,0,screen.width, screen.height);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setVisible(true);
	}

	Main(){
		
	JLayeredPane pane =  new JLayeredPane();
	SpringLayout splayout_base = new SpringLayout();
	CardPanel cpanel = new CardPanel();
	FieldPanel fpanel = new FieldPanel();
	PlayerPanel ppanel = new PlayerPanel();
	
	//contentPaneの取得・設定
	Container base = this.getContentPane();
	base.setBackground(new Color(100,200,255));
	base.setLayout(splayout_base);
	
	//panelの生成
	cpanel.setCardPanel();
	fpanel.setFieldPanel();
	ppanel.setPalayerPanel(4);
	
	
	//addカードタブパネル
	splayout_base.putConstraint(SpringLayout.SOUTH, cpanel.cardpanel, -1, SpringLayout.SOUTH, base);
	splayout_base.putConstraint(SpringLayout.EAST, cpanel.cardpanel, 1, SpringLayout.EAST, base);
	base.add(cpanel.cardpanel);
	
	pane.setLayer(cpanel.cardpanel, 100);
	
	//addフィールドパネル
	splayout_base.putConstraint(SpringLayout.NORTH, fpanel.fieldpanel, 65, SpringLayout.NORTH, base);
	splayout_base.putConstraint(SpringLayout.WEST, fpanel.fieldpanel, 650, SpringLayout.NORTH, base);
	base.add(fpanel.fieldpanel);
	pane.setLayer(fpanel.fieldpanel, 100);
	
	//addプレイヤーパネル
	for(int i=0; i<4; i++) {
		if(i%2 == 0) {
			splayout_base.putConstraint(SpringLayout.NORTH, ppanel.panel[i], 50, SpringLayout.NORTH, base);
			splayout_base.putConstraint(SpringLayout.WEST, ppanel.panel[i], 200 + i*600, SpringLayout.WEST, base);
		}
		else {
			splayout_base.putConstraint(SpringLayout.NORTH, ppanel.panel[i], 450, SpringLayout.NORTH, base);
			splayout_base.putConstraint(SpringLayout.WEST, ppanel.panel[i], 200 + (i-1)*600, SpringLayout.WEST, base);
			}
		base.add(ppanel.panel[i]);
		pane.setLayer(ppanel.panel[i], 100);
	}
	
	}
	
}