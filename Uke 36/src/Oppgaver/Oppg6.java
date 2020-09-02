package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg6 {
	
	public static void main(String args[]) {
		String A = showInputDialog("tallet du skal ta fakultet av: ");
		int heltall = parseInt(A); 
		int a=heltall; 
		int x=1; 
		while (a>=1) {
			x *= a; 
			a--;
		}
		showMessageDialog(null, heltall + "! = " + x);
		}
	
}