package swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class MyWindow1 extends JFrame {
	String [] data= {"Encapsulation", "Inheritance", "Polymorphism", "Information Hiding"};
	public MyWindow1() {
		this.setBounds(1200, 800, 500, 500);
		this.setTitle("SWING");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JList<String>list=new JList(data);
		JComboBox<String>combo=new JComboBox(data);
		
		JPanel panel=new JPanel();
		
		panel.add(list);
		panel.add(combo);
		
		
		add(panel);
		setVisible(true);
	}
}
