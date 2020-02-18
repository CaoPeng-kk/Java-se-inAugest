package augest.week2.gui.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiDemo {

	public static void main(String[] args) {
		Frame a = new Frame();
		a.setSize(500, 400);
		a.setLocation(400, 200);
		a.setLayout(new FlowLayout());
//		a.setLayout(null);
		Button but = new Button("°´Å¥");
		a.add(but);
		a.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		a.setVisible(true);
		
	}

}





