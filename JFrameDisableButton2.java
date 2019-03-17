import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener  {
	JButton btn = new JButton("Click ");
	JLabel lab = new JLabel();
	int count = 1;
	JFrameDisableButton2(){
        setTitle("JFrame Disable Button");
		btn.setBounds(100, 120, 100, 30);
		lab.setBounds(100, 120, 100, 30);
		btn.addActionListener(this);
		add(btn);
		add(lab);
		lab.setVisible(false);
		setLayout(null);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JFrameDisableButton2();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(count == 8) {
			lab.setText("That's enough!");
			lab.setVisible(true);
			btn.setVisible(false);
		}else {
		count++;	
		}
		
	}

}
