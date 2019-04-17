package Dziadziczenie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;

import javax.swing.*;

public class Program {
	static float a=256;
	static int b=256;
	static Random rand = new Random();
	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame();
		frame.setSize(b, b);
		JPanel jpanel = new JPanel();
		JLabel jlabel = new JLabel("Welcome");
		JButton jbutton = new JButton("OK");
		jpanel.add(jlabel);
		jpanel.add(jbutton);
		jbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				a=(rand.nextFloat()*1000)+256;
				b=Math.round(a);
				frame.setSize(b, b);
				
			}
		});
		frame.add(jpanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
