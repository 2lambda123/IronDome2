package TzukEitan.view.swing.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class MainPanel extends JPanel {
	
	private JSplitPane warSplit,gfxSplt;
	private HamasPanel humus;
	private GrfxPanel grfx;
	private IDFPanel idfPanel;
//	private TribePanel tribe1, tribe2,ilend;

	public MainPanel() {
		setLayout(new BorderLayout());

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension panelSize = new Dimension();
		panelSize.setSize(screenSize.width * 0.5, screenSize.height * 0.5);
		setSize(panelSize);

		warSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		gfxSplt = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

		humus = new HamasPanel();
		idfPanel = new IDFPanel();
		grfx = new GrfxPanel();

		gfxSplt.setTopComponent(warSplit);
		gfxSplt.setBottomComponent(grfx);
		warSplit.setLeftComponent(humus);
		warSplit.setRightComponent(idfPanel);

		gfxSplt.setResizeWeight(0.5);
		warSplit.setResizeWeight(0.5); // distributes the extra space when resizing.
											 // without it the proportions will not be saved during resize

		add(gfxSplt, BorderLayout.CENTER);
	}

	
}