package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {
	
	public static void main(String[] args) {
		
		for (int Studenter = 1; Studenter <= 10; Studenter++) {
		
			
		String poeng = showInputDialog("Poengsum student nummer " + Studenter);
		int A = parseInt (poeng);
		
		if (A<0 || A>100)
			showMessageDialog(null, "feil!");
		if (A<=100 && A>=90)
			showMessageDialog(null, "A");
		else if (A<=89 && A>=80)
			showMessageDialog(null, "B");
		else if (A<=79 && A>=60)
			showMessageDialog(null, "C");
		else if (A<=59 && A>=50)
			showMessageDialog(null, "D");
		else if (A<=49 && A>=40)
			showMessageDialog(null, "E");
		else if (A<=39 && A>=0)
			showMessageDialog(null, "F");	
		{
			
			if (A<0 || A>100) {
				String J = showInputDialog("Du skrev feil" + Studenter);
			int B = parseInt(J);
				
			if (B<=100 && B>=90)
				showMessageDialog(null, "A");
			else if (B<=89 && B>=80)
				showMessageDialog(null, "B");
			else if (B<=79 && B>=60)
				showMessageDialog(null, "C");
			else if (B<=59 && B>=50)
				showMessageDialog(null, "D");
			else if (B<=49 && B>=40)
				showMessageDialog(null, "E");
			else if (B<=39 && B>=0)
				showMessageDialog(null, "F");	
		}
		}
		}
	}
}
	
	