//**************************************************************************************************
// TextPanel.java
//
// Date: 	July 24th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 5
//
// Creates a GUI to analyze text by word count and average length.
//**************************************************************************************************
package Question1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TextPanel {
	private JLabel label_words;
	private JLabel label_average;
	private JTextArea text_segment;
	
	public TextPanel() {
		JFrame frame = new JFrame("Text Analyzer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_textarea = new JPanel();
		text_segment = new JTextArea(10, 30);
		text_segment.setLineWrap(true);
		text_segment.setBackground(new Color(235, 235, 235));
		JScrollPane scroll_textarea = new JScrollPane(text_segment);
		scroll_textarea.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll_textarea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_textarea.add(scroll_textarea);
		
		JPanel panel_stats = new JPanel();
		panel_stats.setLayout(new BoxLayout(panel_stats, BoxLayout.Y_AXIS));
		panel_stats.setBorder(BorderFactory.createTitledBorder("Statistics"));
		label_words = new JLabel("Add text and press analyze.");
		label_average = new JLabel("");
		panel_stats.add(label_words);
		panel_stats.add(label_average);
		
		JPanel panel_button = new JPanel();
		JButton btn_analyze = new JButton("Analyze");
		btn_analyze.addActionListener(new AnalyzeListener());
		panel_button.add(btn_analyze);
		
		JPanel panel_parent = new JPanel();
		panel_parent.setLayout(new BoxLayout(panel_parent, BoxLayout.Y_AXIS));
		
		panel_parent.add(panel_textarea);
		panel_parent.add(panel_stats);
		panel_parent.add(panel_button);
		frame.add(panel_parent);
		frame.pack();
		frame.setVisible(true);
	}
	
	private class AnalyzeListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			int words = 0;
			int chars = 0;
			
			try {
				Scanner scan = new Scanner(text_segment.getText());
				
				while(scan.hasNext()) {
					String s = scan.next();
					chars = chars + s.length();
					words ++;
				}
				
				scan.close();
				
				double average = (double)chars / (double)words;
				
				DecimalFormat format = new DecimalFormat();
				format.setMaximumFractionDigits(2);
				
				label_words.setText("Number of Words: " + words);
				label_average.setText("\nAverage Word Length: " + format.format(average));
			} catch(Exception e) {
				label_words.setText("An error has occured.");
			}
			
		}
	}
	
	
}
