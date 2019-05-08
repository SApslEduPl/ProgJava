package Klient;

import java.awt.Dimension;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class Okno {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel jpanel = new JPanel();
		JButton addBook = new JButton("Dodaj ksiazke");
		JButton reBook = new JButton("Usun ksiazke");
		JButton addAuthor = new JButton("Dodaj autora");
		JButton reAuthor = new JButton("Usun autora");
		JButton showBooks = new JButton("Pokaz ksiazki");
		JButton showAuthors = new JButton("Pokaz autorow");
		JTable table = new JTable();
		frame.setSize(new Dimension(800,600));
		jpanel.setLayout(null);
		table.setBounds(50, 50, 500, 450);
		addBook.setBounds(600,50,150,30);
		reBook.setBounds(600,100,150,30);
		addAuthor.setBounds(600,150,150,30);
		reAuthor.setBounds(600,200,150,30);
		showBooks.setBounds(600,250,150,30);
		showAuthors.setBounds(600,300,150,30); 
		jpanel.add(table);
		jpanel.add(addBook);
		jpanel.add(reBook);
		jpanel.add(addAuthor);
		jpanel.add(reAuthor);
		jpanel.add(showBooks);
		jpanel.add(showAuthors);
		frame.add(jpanel);
		addBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

