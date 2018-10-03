

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
	import javax.swing.JFrame;
import javax.swing.JPanel;
	

		public class CutenessTV implements ActionListener{
			public static void main(String[] args) {
				CutenessTV fc = new CutenessTV();
				fc.showButton();
			}
			void showDucks() {
			     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
			}

			void showFrog() {
			     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
			}

			void showFluffyUnicorns() {
			     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
			}

			void playVideo(String videoID) {
			     try {
			          URI uri = new URI(videoID);
			          java.awt.Desktop.getDesktop().browse(uri);
			     } catch (Exception e) {
			          e.printStackTrace();
			     }
			}
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			
			JButton button1 = new JButton();
			JButton button2 = new JButton();
			JButton button3 = new JButton();
			public void showButton() {
			
				frame.setVisible(true);
				frame.setSize(500,500);
				panel.add(button1);
				frame.add(panel);
				button1.setSize(300,300);
				button1.setText("Ducks");
				button1.addActionListener(this);
				button2.setSize(300,300);
				button2.setText("Frog");
				panel.add(button2);
				button2.addActionListener(this);
				button3.setSize(300,300);
				button3.setText("Unicorn");
				panel.add(button3);
				
				button3.addActionListener(this);
			     
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==button1) {
					showDucks();
				}
				if(e.getSource()==button2) {
					showFrog();
				}
				if(e.getSource()==button3) {
					showFluffyUnicorns();
				}
			
}
		}
