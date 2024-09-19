package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		
		int lønn;
		double s1 = (292850 - 208051) * 0.017;
		double s2 = (670001 - 292851) * 0.04;
		double s3 = (937901 - 670001) * 0.136;
		double s4 = (1350001 - 937901) * 0.166;
		
		lønn = parseInt(showInputDialog("Hvor stor inntekt har du?"));
		
		double trinn1 = (lønn - 208051)*0.017;
		double trinn2 = (lønn - 292851)*0.04;
		double trinn3 = (lønn - 670001)*0.136;
		double trinn4 = (lønn - 937901)*0.166;
		double trinn5 = (lønn - 1350001)*0.176; 
		
		 
		if(lønn >= 1350001) {double skatt5 = trinn5 + s4 + s3 + s2 + s1; showMessageDialog(null, "Du må betale " + skatt5 + "kr skatt");}
		else if(lønn >= 937901) {double skatt4 = trinn4 + s3 + s2 + s1;showMessageDialog(null, "Du må betale " + skatt4 + "kr skatt");}
		else if(lønn >= 670001) {double skatt3 = trinn3 + s2 + s1; showMessageDialog(null, "Du må betale " + skatt3 + "kr skatt");}
		else if(lønn >= 292851) {double skatt2 = trinn2 + s1; showMessageDialog(null, "Du må betale " + skatt2 + "kr skatt");}
		else if(lønn >= 208051) {double skatt1 = trinn1; showMessageDialog(null, "Du må betale " + skatt1 + "kr skatt");}
		else if(lønn < 208051) {showMessageDialog(null, "Du må ikke betale trinnskatt");}
		
		
	}
}
