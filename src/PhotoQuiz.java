/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image  on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
        String picture = ("http://www.barebooks.com/wp-content/uploads/2013/10/GM05.gif");
		// 2. create a variable of type "Component" that will hold your image
        Component picture2;
		// 3. use the "createImage()" method below to initialize your Component
        picture2 = createImage(picture);
		// 4. add the image to the quiz window
        JPanel panel = new JPanel();
        quizWindow.add(picture2);
        
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String answer = JOptionPane.showInputDialog("What type of shape is this?");
		// 7. print "CORRECT" if the user gave the right answer
        if (answer.equalsIgnoreCase("square")) {
			System.out.println("correct!");
		} 
		// 8. print "INCORRECT" if the answer is wrong
        else{
 			System.out.println("incorrect.");
 		} 
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(picture2);
		// 10. find another image and create it (might take more than one line of code)
        String triangle = ("https://vignette.wikia.nocookie.net/uncyclopedia/images/8/88/Triangle%28shape%29.jpg/revision/latest?cb=20121214140518");
        picture2 = createImage(triangle);
		// 11. add the second image to the quiz window
        quizWindow.add(picture2);
		// 12. pack the quiz window
        quizWindow.pack();
		// 13. ask another question
        String answer2 = JOptionPane.showInputDialog("What is this shape?");
		// 14+ check answer, say if correct or incorrect, etc.
        if(answer2.equalsIgnoreCase("triangle")) {
        	System.out.println("correct!");
        }
        else {
        	System.out.println("incorrect.");
        }
        quizWindow.remove(picture2);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





