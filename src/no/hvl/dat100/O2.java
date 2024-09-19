package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {

		int s = 1;
		int points;
		for (s = 1; s <= 3; s++) {

			do {
				points = parseInt(showInputDialog("Poengsum"));
				if (points > 100 || points < 0) {
					showMessageDialog(null, "Ugyldig poengsum");
				}
			} while (points > 100 || points < 0);
			{

			}

			if (points > 100) {
				System.out.println("FOR HØY POENGSUM");
			} else if (points >= 90) {
				showMessageDialog(null, "A");
			} 
			else if (points >= 80) {
				showMessageDialog(null, "B");
			} 
			else if (points >= 60) {
				showMessageDialog(null, "C");
			} 
			else if (points >= 50) {
				showMessageDialog(null, "D");
			} 
			else if (points >= 40) {
				showMessageDialog(null, "E");
			} 
			else if (points >= 0) {
				showMessageDialog(null, "F");
			} 
			else if (points < 0) {
				System.out.println("FOR LAV POENGSUM");
			}

		}

	}
}
