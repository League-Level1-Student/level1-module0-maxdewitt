import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.applet.AudioClip;

	public class SoundEffect implements ActionListener{
		public static void main(String[] args) {
			SoundEffect fc = new SoundEffect();
			fc.showButton();
		}

private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
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
			playSound("cymbal.wav");
		}
}
