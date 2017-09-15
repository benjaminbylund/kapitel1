import javax.swing.*;
import java.awt.Toolkit;
public class ShowMessageDialog{
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null,"Benjamin"
		//	+ "\nDu kör Windows 10");
		//JOptionPane.showMessageDialog(null,"070123456");
		//Toolkit.getDefaultToolkit().beep();
		//JOptionPane.showMessageDialog(null,"Benjamin" + "\nOlofpalmegata" + "\n0701234567"); 
		 JOptionPane.showMessageDialog(null, "Information", "Information",
         	JOptionPane.QUESTION_MESSAGE);
         JOptionPane.showMessageDialog(null, "Varning", "Varning",
         	JOptionPane.WARNING_MESSAGE);
         JOptionPane.showMessageDialog(null, "Fel", "Fel",
         	JOptionPane.ERROR_MESSAGE);
	}
}