package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("fakultet"));
		int fakultet = 1;
		
		while (n <= 0){
		 n = parseInt(showInputDialog("skriv inn et positivt heltall"));
		}
			
		for (int i = 1; i<=n; i++){
			fakultet = fakultet*i;
		}
		showMessageDialog(null, n + "! = " + fakultet);
			
		}
}
		

	


