import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
	     
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will blink soon.");
		}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "A minute will pass in 60 seconds or less.");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will eat sometime this week.");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will step on a pebble in your lifetime.");
		}
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will breathe in oxygen.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are going to read a fortune cookie today.");
			
		}
			
		}
	}
