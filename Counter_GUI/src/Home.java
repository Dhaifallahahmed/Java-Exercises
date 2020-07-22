import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home implements ActionListener{

	int counter =0;
	JLabel Label;
	public Home() {
	
		JFrame frame=new JFrame();
		JPanel panel= new JPanel();
		JButton button=new JButton("CLICK");
		 Label=new JLabel("Number of clicks");
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(Label);
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TEST");
		frame.setVisible(true);
		
		button.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new Home();
		String nString="Dhaif";
		JFrame frame=new JFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		counter++;
		Label.setText("Number of clicks "+counter);
	}

}
