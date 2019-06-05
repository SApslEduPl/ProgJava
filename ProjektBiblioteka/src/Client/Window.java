package Client;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Window {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String[] colNameBooks = Server.Data.Naglowek();
		String[][] dataBooks = Server.Data.Wypis();
		String[] colNameAuthors = Server.Authors.Naglowek();
		String[][] dataAuthors = Server.Authors.Wypis();
		DefaultTableModel modelB = new DefaultTableModel(dataBooks, colNameBooks);
		DefaultTableModel modelA = new DefaultTableModel(dataAuthors, colNameAuthors);
		JFrame frame = new JFrame();
		JPanel jpanel = new JPanel();
		JButton addBook = new JButton("Dodaj ksiazke");
		JButton reBook = new JButton("Usun ksiazke");
		JButton addAuthor = new JButton("Dodaj autora");
		JButton reAuthor = new JButton("Usun autora");
		JButton showBooks = new JButton("Pokaz ksiazki");
		JButton showAuthors = new JButton("Pokaz autorow");
		JButton reShow = new JButton("Odswiez dane");
		JTable tableBooks = new JTable(modelB);
		JTable tableAuthors = new JTable(modelA);
		JScrollPane panelTableBooks = new JScrollPane(tableBooks);
		JScrollPane panelTableAuthors = new JScrollPane(tableAuthors);
		frame.setSize(new Dimension(800,600));
		jpanel.setLayout(null);
		addBook.setBounds(650,50,120,30);
		reBook.setBounds(650,100,120,30);
		addAuthor.setBounds(650,150,120,30);
		reAuthor.setBounds(650,200,120,30);
		showBooks.setBounds(650,250,120,30);
		showAuthors.setBounds(650,300,120,30);
		reShow.setBounds(650,350,120,30); 
		panelTableBooks.setBounds(20, 50, 625, 450);
		panelTableAuthors.setBounds(20, 50, 625, 450);
		jpanel.add(addBook);
		jpanel.add(reBook);
		jpanel.add(addAuthor);
		jpanel.add(reAuthor);
		jpanel.add(showBooks);
		jpanel.add(showAuthors);
		jpanel.add(reShow);
		jpanel.add(panelTableBooks);
		frame.add(jpanel);
		addBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				JTextField tytul = new JTextField();
				JTextField dzial = new JTextField();
				JTextField iloscStron = new JTextField();
				JTextField rokWydania = new JTextField();
				JTextField isbn = new JTextField();
				Object[] message = {
				    "Tytul:", tytul,
				    "Dzial:", dzial,
				    "Ilosc Stron:", iloscStron,
				    "Rok Wydania:", rokWydania,
				    "ISBN:", isbn
				};
				JOptionPane.showConfirmDialog(null, message);
				String[] addBookTable = {tytul.getText(), dzial.getText(), iloscStron.getText(), rokWydania.getText(), isbn.getText()};
				try {
					Server.Data.Dodawanie(addBookTable);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		reBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String reB = (String)JOptionPane.showInputDialog(
	                    frame,
	                    "Podaj id ksiazki:\n",
	                    "Usuwanie Ksiazki",
	                    JOptionPane.PLAIN_MESSAGE);
				try {
					Server.Data.Usuwanie(reB);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		addAuthor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField imie = new JTextField();
				JTextField nazwisko = new JTextField();
				JTextField epoka = new JTextField();
				Object[] message = {
					    "Imie:", imie,
					    "Nazwisko:", nazwisko,
					    "Epoka:", epoka
					};
				JOptionPane.showConfirmDialog(null, message);
				String[] addAuthorTable = {imie.getText(), nazwisko.getText(), epoka.getText()};
				try {
					Server.Authors.Dodawanie(addAuthorTable);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		reAuthor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String reA = (String)JOptionPane.showInputDialog(
	                    frame,
	                    "Podaj id autora:\n",
	                    "Usuwanie Autora",
	                    JOptionPane.PLAIN_MESSAGE);
				try {
					Server.Authors.Usuwanie(reA);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		showBooks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpanel.remove(panelTableAuthors);
				jpanel.add(panelTableBooks);
				frame.add(jpanel);
			}
		});
		showAuthors.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpanel.remove(panelTableBooks);
				jpanel.add(panelTableAuthors);
				frame.add(jpanel);
			}
		});
		reShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}