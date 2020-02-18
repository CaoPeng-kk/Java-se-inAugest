package augest.week2.gui.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MouseAndKeyDemo {
	
	private Frame f;
	private TextField tx;
	private Button bu;
	
	public MouseAndKeyDemo() {
		init();
		
		
	}
	
	private void init() {
		f = new Frame("演示");
		f.setBounds(6000, 200, 500, 400);
		f.setLayout(new FlowLayout());
		tx = new TextField(35);
		bu = new Button("点击");
		f.add(tx);
		f.add(bu);
		myEvent();
		f.setVisible(true);
		
	}

	private void myEvent() {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		bu.addMouseListener(new MouseAdapter() {
			private int count = 1;
			@Override
			public void mouseClicked(MouseEvent e) {
				tx.setText("点击"+(count++)+"次");
				
			}
			
		});
	}

	public static void main(String[] args) {
		MouseAndKeyDemo mak = new MouseAndKeyDemo();
	}

}





