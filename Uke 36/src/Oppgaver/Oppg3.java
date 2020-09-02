package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg3 {
	public static void main(String args[]) {
		String A = showInputDialog("X tallet: ");
		String B = showInputDialog("N tallet: ");
		double a = Double.parseDouble(A);
		int b = parseInt(B);
		double c = Math.pow(a, b);
		// showMessageDialog(null, "Dette er Math.pow metoden \n" + c );

		double d = 1.0;
		if (b <= 0)
			showMessageDialog(null, "N er ikke et postivt tall");
		else if (b > 0) {
			showMessageDialog(null, "Dette er math.Powmetoden\n" + c);

			while (b != 0) {
				d *= a;
				--b;

			}
			showMessageDialog(null, "Dette er whileløkkemetoden \n" + d);
		}
	}
}