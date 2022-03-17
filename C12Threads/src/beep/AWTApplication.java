package beep;

import java.applet.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

public class AWTApplication extends Applet implements WindowListener {

   public static void main(java.lang.String[] args) {
	  AWTApplication applet = new AWTApplication();
      Frame w = new Frame("Applet");
      w.addWindowListener(applet);
      w.add("Center", applet);
      w.setSize(400, 200);
      w.setVisible(true);
      applet.init();
      applet.start();
   }

   public void paint(Graphics g) {
      super.paint(g);
      g.drawString("Hello, AWT!!!", 10, 10);	// Upper left corner
   }

   @Override
   public void windowClosing(WindowEvent e) {
	   System.out.println("AWTApplication: exit...");
	   
      System.exit(0);	// Exit the application when the window is closed
   }

   // Required methods
   @Override
   public void windowActivated(WindowEvent e) { }
   @Override
   public void windowClosed(WindowEvent e) { }
   @Override
   public void windowDeactivated(WindowEvent e) { }
   @Override
   public void windowDeiconified(WindowEvent e) { }
   @Override
   public void windowIconified(WindowEvent e) { }
   @Override
   public void windowOpened(WindowEvent e) { }

}