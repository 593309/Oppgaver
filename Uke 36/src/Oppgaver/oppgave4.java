package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class oppgave4 {
	

	public static void main(String[] args) {
	
	String Inntekt = showInputDialog("Skriv inn din inntekt: ");
	double A = parseInt(Inntekt);
	if (A<164101)
		showMessageDialog(null, "Null ekstra skatt");
	else if (A>=164101 && A<=230950)
		showMessageDialog(null, A*1.0093-A + " Ekstra skatt ");
	else if (A>=230951 && A<=580650)
		showMessageDialog(null,A*1.0241-A + " Ekstra skatt");
	else if (A>=580651 && A<=934050)
		showMessageDialog(null,A*1.1152-A + " Ekstra skatt");
	else if (A>=934051)
		showMessageDialog(null,A*1.1452-A + " Ekstra skatt");
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
