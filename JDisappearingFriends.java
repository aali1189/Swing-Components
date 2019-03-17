import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JDisappearingFriends extends JFrame implements ActionListener  {
	JButton btn = new JButton("Click ");
	JLabel lab1 = new JLabel("Amro");
	JLabel lab2 = new JLabel("Ali");
	JLabel lab3 = new JLabel("Abaas");
	JLabel lab4 = new JLabel("Madani");
	JLabel lab5 = new JLabel("Ahmed");
	int count = 1;
	JDisappearingFriends(){
        setTitle("JFrame Disable Button");
		btn.setBounds(100, 120, 100, 30);
		lab1.setBounds(10, 20, 100, 30);
		lab2.setBounds(10, 40, 100, 30);
		lab3.setBounds(10, 60, 100, 30);
		lab4.setBounds(10, 80, 100, 30);
		lab5.setBounds(10, 100, 100, 30);
		//lab.setBounds(100, 120, 100, 30)
		btn.addActionListener(this);
		add(btn);
		add(lab1);
		add(lab2);
		add(lab3);
		add(lab4);
		add(lab5);
		lab1.setVisible(true);
		lab2.setVisible(false);
		lab3.setVisible(false);
		lab4.setVisible(false);
		lab5.setVisible(false);
		setLayout(null);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JDisappearingFriends();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		count++;
		switch(count) {
		case 2:
			lab1.setVisible(false);
			lab2.setVisible(true);
			break;
		case 3:
			lab2.setVisible(false);
			lab3.setVisible(true);
			break;
		case 4:
			lab3.setVisible(false);
			lab4.setVisible(true);
			break;
		case 5:
			lab4.setVisible(false);
			lab5.setVisible(true);
			break;
			
			default:
				break;
			
		}
	}

}
