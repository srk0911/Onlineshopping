package desktopapplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Otto {
	Otto() {
		JFrame f = new JFrame();

		JLabel l1 = new JLabel("BALMAIN FASHION");
		l1.setBounds(280, 50, 200, 30);
		l1.setForeground(Color.PINK);

		JButton b3 = new JButton();
		b3.setBounds(50, 120, 10, 15);

		JLabel l2 = new JLabel("Styles Brand & more");
		l2.setBounds(70, 120, 150, 15);

		JButton b4 = new JButton();
		b4.setBounds(50, 150, 10, 15);

		JLabel l3 = new JLabel("Men");
		l3.setBounds(70, 150, 70, 15);

		JButton b5 = new JButton();
		b5.setBounds(50, 180, 10, 15);

		JLabel l4 = new JLabel("Women");
		l4.setBounds(70, 180, 100, 15);

		JButton b6 = new JButton();
		b6.setBounds(50, 210, 10, 15);

		JLabel l5 = new JLabel("Kids");
		l5.setBounds(70, 210, 70, 15);

		JButton b1 = new JButton("login");
		b1.setBounds(400, 250, 70, 30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f2 = new JFrame();
				JLabel l1 = new JLabel("LOGIN :");
				l1.setBounds(80, 30, 70, 30);

				JLabel l2 = new JLabel("EMAIL ID:");
				l2.setBounds(50, 80, 70, 30);

				JTextField tf1 = new JTextField();
				tf1.setBounds(130, 80, 150, 30);
				JLabel l3 = new JLabel("Password :");
				l3.setBounds(50, 110, 70, 30);

				JTextField tf2 = new JTextField();
				tf2.setBounds(130, 110, 150, 30);

				JButton b1 = new JButton("ENTER");
				b1.setBounds(400, 250, 100, 30);

				b1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame f3 = new JFrame();

						JLabel l1 = new JLabel("Items");
						l1.setBounds(60, 40, 60, 20);
						JLabel l2 = new JLabel("Quantity");
						l2.setBounds(250, 40, 60, 20);
						JCheckBox r1 = new JCheckBox("Pants  Rs.1500");
						r1.setBounds(50, 60, 140, 30);
						JCheckBox r2 = new JCheckBox("Shirts  Rs.1000");
						r2.setBounds(50, 100, 140, 30);
						JCheckBox r3 = new JCheckBox("TShirts  Rs.800");
						r3.setBounds(50, 140, 140, 30);
						JCheckBox r4 = new JCheckBox("Shoes  Rs.1500");
						r4.setBounds(50, 180, 140, 30);
						JLabel l3 = new JLabel("TOTAL");
						l3.setBounds(50, 220, 140, 30);

						JLabel l4 = new JLabel();
						l4.setBounds(150, 220, 170, 30);

						Integer a[] = { 1, 2, 3, 5, 6 };
						JComboBox cb = new JComboBox(a);
						cb.setBounds(250, 60, 60, 20);

						JComboBox c1 = new JComboBox(a);
						c1.setBounds(250, 100, 60, 20);

						JComboBox c2 = new JComboBox(a);
						c2.setBounds(250, 140, 60, 20);

						JComboBox c3 = new JComboBox(a);
						c3.setBounds(250, 180, 60, 20);

						JButton b2 = new JButton("Calculate");
						b2.setBounds(200, 260, 140, 30);

						b2.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								int a1 = (int) cb.getSelectedItem();
								int a2 = (int) c1.getSelectedItem();
								int a3 = (int) c2.getSelectedItem();
								int a4 = (int) c3.getSelectedItem();

								int a = 1500 * a1;// r
								int b = 1000 * a2;// r1
								int c = 800 * a3;// r2
								int d = 1500 * a4;// r3

								if (r1.isSelected() && r2.isSelected() && r3.isSelected() && r4.isSelected()) {
									int f = a + b + c + d;
									l4.setText("Total Rs : " + f);
								} else if (r1.isSelected() && r2.isSelected() && r3.isSelected()) {
									int j = a + b + c;
									l4.setText("Total Rs : " + j);
								} else if (r2.isSelected() && r3.isSelected() && r4.isSelected()) {
									int h = b + c + d;
									l4.setText("Total Rs : " + h);
								} else if (r1.isSelected() && r2.isSelected() && r4.isSelected()) {
									int q = a + b + d;
									l4.setText("Total Rs : " + q);
								} else if (r1.isSelected() && r3.isSelected() && r4.isSelected()) {
									int w = a + c + d;
									l4.setText("Total Rs : " + w);
								} else if (r2.isSelected() && r3.isSelected()) {
									int t = b + c;
									l4.setText("Total Rs : " + t);
								} else if (r1.isSelected() && r2.isSelected()) {
									int s = a + b;
									l4.setText("Total Rs : " + s);
								} else if (r1.isSelected() && r3.isSelected()) {
									int y = a + c;
									l4.setText("Total Rs : " + y);
								} else if (r1.isSelected() && r4.isSelected()) {
									int x = a + d;
									l4.setText("Total Rs : " + x);
								} else if (r1.isSelected() && r4.isSelected()) {
									int x = c + d;
									l4.setText("Total Rs : " + x);
								} else if (r2.isSelected() && r1.isSelected()) {
									int x = c + b;
									l4.setText("Total Rs : " + x);
								} else if (r4.isSelected() && r2.isSelected()) {
									int x = c + a;
									l4.setText("Total Rs : " + x);
								} else if (r1.isSelected()) {
									l4.setText("Total Rs : " + a);
								} else if (r2.isSelected()) {
									l4.setText("Total Rs : " + b);
								} else if (r3.isSelected()) {
									l4.setText("Total Rs : " + c);
								} else if (r4.isSelected()) {
									l4.setText("Rs : " + d);
								} else {
									l4.setText("Please Select Something");
								}

							}
						});

						f3.add(l1);
						f3.add(l2);
						f3.add(r1);
						f3.add(r2);
						f3.add(r3);
						f3.add(r4);
						f3.add(l4);
						f3.add(cb);
						f3.add(c1);
						f3.add(c2);
						f3.add(c3);
						f3.add(b2);
						f3.setSize(700, 500);
						f3.setLayout(null);
						f3.setVisible(true);

					}

				});

				f2.add(b1);
				f2.add(l1);
				f2.add(l2);
				f2.add(l3);
				f2.add(tf1);
				f2.add(tf2);
				f2.setSize(700, 500);
				f2.setLayout(null);
				f2.setVisible(true);
				// JOptionPane.showInputDialog(f, "login successfully");
			}
		});

		JButton b2 = new JButton("Sign-up");
		b2.setBounds(480, 250, 70, 30);

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f3 = new JFrame();

				JLabel l1 = new JLabel("LOGIN");
				l1.setBounds(80, 30, 70, 30);

				JLabel l2 = new JLabel("Name   :");
				l2.setBounds(50, 80, 70, 30);

				JTextField tf1 = new JTextField();
				tf1.setBounds(130, 80, 150, 30);

				JLabel l3 = new JLabel("Dob    :");
				l3.setBounds(50, 110, 70, 30);

				JTextField tf2 = new JTextField();
				tf2.setBounds(130, 110, 150, 30);

				JLabel l4 = new JLabel("Mobile :");
				l4.setBounds(50, 140, 70, 30);

				JTextField tf3 = new JTextField();
				tf3.setBounds(130, 140, 150, 30);

				JLabel l5 = new JLabel("Age    :");
				l5.setBounds(50, 170, 70, 30);

				JTextField tf4 = new JTextField();
				tf4.setBounds(130, 170, 150, 30);

				JLabel l6 = new JLabel("Gendar   :");
				l6.setBounds(50, 200, 70, 30);

				JTextField tf5 = new JTextField();
				tf5.setBounds(130, 200, 150, 30);

				JButton b1 = new JButton("ENTER");
				b1.setBounds(400, 250, 100, 30);

				b1.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						JFrame f3 = new JFrame();

						JLabel l1 = new JLabel("Items");
						l1.setBounds(60, 40, 60, 20);
						JLabel l2 = new JLabel("Quantity");
						l2.setBounds(250, 40, 60, 20);
						JCheckBox r1 = new JCheckBox("saree  Rs.5000");
						r1.setBounds(50, 60, 140, 30);
						JCheckBox r2 = new JCheckBox("Chudithar  Rs.2000");
						r2.setBounds(50, 100, 140, 30);
						JCheckBox r3 = new JCheckBox("TShirts  Rs.1200");
						r3.setBounds(50, 140, 140, 30);
						JCheckBox r4 = new JCheckBox("Shoes  Rs.1500");
						r4.setBounds(50, 180, 140, 30);
						JLabel l3 = new JLabel("TOTAL");
						l3.setBounds(50, 220, 140, 30);

						JLabel l4 = new JLabel();
						l4.setBounds(150, 220, 170, 30);

						Integer a[] = { 1, 2, 3, 5, 6 };
						JComboBox cb = new JComboBox(a);
						cb.setBounds(250, 60, 60, 20);

						JComboBox c1 = new JComboBox(a);
						c1.setBounds(250, 100, 60, 20);

						JComboBox c2 = new JComboBox(a);
						c2.setBounds(250, 140, 60, 20);

						JComboBox c3 = new JComboBox(a);
						c3.setBounds(250, 180, 60, 20);

						JButton b2 = new JButton("Calculate");
						b2.setBounds(200, 260, 140, 30);

						b2.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								int a1 = (int) cb.getSelectedItem();
								int a2 = (int) c1.getSelectedItem();
								int a3 = (int) c2.getSelectedItem();
								int a4 = (int) c3.getSelectedItem();

								int a = 5000 * a1;// r
								int b = 2500 * a2;// r1
								int c = 1200 * a3;// r2
								int d = 1500 * a4;// r3

								if (r1.isSelected() && r2.isSelected() && r3.isSelected() && r4.isSelected()) {
									int f = a + b + c + d;
									l4.setText("Total Rs : " + f);
								} else if (r1.isSelected() && r2.isSelected() && r3.isSelected()) {
									int j = a + b + c;
									l4.setText("Total Rs : " + j);
								} else if (r2.isSelected() && r3.isSelected() && r4.isSelected()) {
									int h = b + c + d;
									l4.setText("Total Rs : " + h);
								} else if (r1.isSelected() && r2.isSelected() && r4.isSelected()) {
									int q = a + b + d;
									l4.setText("Total Rs : " + q);
								} else if (r1.isSelected() && r3.isSelected() && r4.isSelected()) {
									int w = a + c + d;
									l4.setText("Total Rs : " + w);
								} else if (r2.isSelected() && r3.isSelected()) {
									int t = b + c;
									l4.setText("Total Rs : " + t);
								} else if (r1.isSelected() && r2.isSelected()) {
									int s = a + b;
									l4.setText("Total Rs : " + s);
								} else if (r1.isSelected() && r3.isSelected()) {
									int y = a + c;
									l4.setText("Total Rs : " + y);
								} else if (r1.isSelected() && r4.isSelected()) {
									int x = a + d;
									l4.setText("Total Rs : " + x);
								} else if (r1.isSelected() && r4.isSelected()) {
									int x = c + d;
									l4.setText("Total Rs : " + x);
								} else if (r2.isSelected() && r1.isSelected()) {
									int x = c + b;
									l4.setText("Total Rs : " + x);
								} else if (r4.isSelected() && r2.isSelected()) {
									int x = c + a;
									l4.setText("Total Rs : " + x);
								} else if (r1.isSelected()) {
									l4.setText("Total Rs : " + a);
								} else if (r2.isSelected()) {
									l4.setText("Total Rs : " + b);
								} else if (r3.isSelected()) {
									l4.setText("Total Rs : " + c);
								} else if (r4.isSelected()) {
									l4.setText("Rs : " + d);
								} else {
									l4.setText("Please Select Something");
								}

							}
						});

						f3.add(l1);
						f3.add(l2);
						f3.add(r1);
						f3.add(r2);
						f3.add(r3);
						f3.add(r4);
						f3.add(l4);
						f3.add(cb);
						f3.add(c1);
						f3.add(c2);
						f3.add(c3);
						f3.add(b2);
						f3.setSize(700, 500);
						f3.setLayout(null);
						f3.setVisible(true);

					}
				});

				f3.add(tf1);
				f3.add(tf2);
				f3.add(tf3);
				f3.add(tf4);
				f3.add(tf5);
				f3.add(l1);
				f3.add(l2);
				f3.add(l3);
				f3.add(l4);
				f3.add(l5);
				f3.add(l6);
				f3.add(b1);
				f3.setSize(700, 500);
				f3.setLayout(null);
				f3.setVisible(true);

			}
		});
		f.add(b6);
		f.add(l5);
		f.add(b5);
		f.add(l4);
		f.add(b3);
		f.add(b4);
		f.add(l3);

		f.add(l2);
		f.add(b3);
		// f.add(c);
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.setSize(700, 500);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new Otto();

	}
}
