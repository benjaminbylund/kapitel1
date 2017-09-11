import javax.swing.*;
import java.awt.Toolkit;
public class ShowMessageDialog{
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Benjamin"
			+ "\nDu kör Windows 10");
		JOptionPane.showMessageDialog(null,"070123456");
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null,"Benjamin" + "\nOlofpalmegata" + "\n0701234567");
	}
}