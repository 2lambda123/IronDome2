/*
 * Made by:
 * Guy Eshel: eshelguy@gmail.com
 * &
 * Ben Amir: amir.ben@gmail.com
 */

package TzukEitan.view;

import java.io.IOException;

import javax.swing.SwingUtilities;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import TzukEitan.dal.WarDB;
import TzukEitan.view.swing.TzukEitanFrame;
import TzukEitan.war.War;
import TzukEitan.war.WarControl;

public class TzukEitan {

	public static void main(String[] args) {
		
		WarXMLReader warXML;
//
//		IView view = new ConsoleView();
        IView view = new TzukEitanFrame();
		
		War warModel = new War();
//
//		WarDB warDB = new WarDB(warModel);
		WarControl warControl = new WarControl(warModel, view);
//
//		try {
//			warXML = new WarXMLReader("warStart.xml", warControl);
//			warXML.start();
//			warXML.join();
//
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//		} catch (SAXException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
		warModel.start();
//		view.start();
		
	}

}