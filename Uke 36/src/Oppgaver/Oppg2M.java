package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg2M {


public static void main(String args[]) {
        String A = showInputDialog("Nedre grense");
        String B = showInputDialog("�vre grense");
        int nedre = parseInt(A);
        int �vre = parseInt(B);
        String tall = ("");
        for (int i = nedre; i <= �vre; i++) 
            if (i % 2 != 0) 
              tall += i + ", ";
        showMessageDialog(null, tall);
        
    }

}