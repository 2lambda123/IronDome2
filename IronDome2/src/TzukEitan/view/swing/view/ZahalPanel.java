package TzukEitan.view.swing.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import TzukEitan.view.swing.action.AddLaunchDistructorAction;
import TzukEitan.view.swing.action.AddLauncherAction;


public class ZahalPanel extends JPanel {

	private JButton btnAddSurvivor;
	private JPanel zhalInnerPanel;

	
	public ZahalPanel() {
		
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createTitledBorder(""));

		btnAddSurvivor = new JButton(new AddLaunchDistructorAction(this));
		add(btnAddSurvivor, BorderLayout.NORTH);
		
		zhalInnerPanel = new JPanel();
		zhalInnerPanel.setLayout(new GridLayout(0, 2, 10, 10));
		
		JScrollPane scroller = new JScrollPane(zhalInnerPanel);
		scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scroller, BorderLayout.CENTER);
	}

	
		
}





//private JPanel launcherPanel;
//
//public HamasPanel(){
//	setLayout(new BorderLayout());
//	launcherPanel = new JPanel();
//	add(new JLabel("Hamas"), BorderLayout.NORTH);
////	launcherPanel.setBorder(BorderFactory.createTitledBorder("Hamas"));
//	launcherPanel.setLayout(new GridLayout(0, 2, 10, 10));
//	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//	Dimension frameSize = new Dimension();
//	frameSize.setSize(screenSize.width * 0.15, screenSize.height * 0.2);
//	launcherPanel.setPreferredSize(frameSize);
//	
//	JScrollPane scroller = new JScrollPane(launcherPanel);
//	scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//	add(scroller, BorderLayout.CENTER);
//	
//}
//
//public void addLauncher(LauncherLable lable){
//	launcherPanel.add(lable);
//	validate();
//	repaint();
//}
//
//public void removeLauncher(LauncherLable lable){
//	launcherPanel.remove(lable);
//	validate();
//	repaint();
//}