import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameDisableButton extends JFrame implements ActionListener  {
	JButton btn = new JButton("Click ");
	JFrameDisableButton(){
        setTitle("JFrame Disable Button");
		btn.setBounds(150, 150, 100, 30);
		btn.addActionListener(this);
		add(btn);
		setLayout(null);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JFrameDisableButton();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		btn.setVisible(false);
	}

}
