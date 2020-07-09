package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String twix = JOptionPane.showInputDialog("What can travel around the world by staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (twix.equals("stamp")){
	JOptionPane.showMessageDialog(null, "correct!");
score=score+1;
}

		// 5. Otherwise, say "wrong" and tell them the answer
	else {
		JOptionPane.showMessageDialog(null, "no it's a stamp");
	}
		// 6. Add some more riddles
String answer = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");
		if (answer.equals("piano")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score=score+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "no it's a piano");
		}
// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,score);
	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}

