//**************************************************************************************************
// StopWatch.java
//
// Date: 	July 24th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 5
//
// A class that creates a GUI for a stop watch, with start/stop/reset and keyboard shortcuts.
//**************************************************************************************************
package Question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopWatch {
	// Timer
	final static int TENTH_SECOND = 100;
	Timer timer;
	Long ticks = 0L;
	
	// GUI Elements
	JFrame frame;
	JPanel panel_time;
	JButton btn_start_stop;
	JLabel label_time;
	
	// GUI Colors
	Color startColor = new Color(0, 128, 0);
	Color stopColor = new Color(128, 0, 0);
	
	public StopWatch() {
		timer = new Timer(TENTH_SECOND, new TimerListener());
		
		frame = new JFrame("Stopwatch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1, 2));
		frame.addKeyListener(new MnemonicListener());
		// Have to allow the computer to focus on the frame to make sure
		// we can use key bindings.
		frame.setFocusable(true);
		
		// The time panel
		panel_time = new JPanel();
		panel_time.setPreferredSize(new Dimension(125, 100));
		panel_time.setBackground(Color.white);
		label_time = new JLabel("0s");
		label_time.setFont(new Font("Time", Font.BOLD, 30));
		label_time.setForeground(Color.DARK_GRAY);
		label_time.setPreferredSize(new Dimension(125, 100));
		label_time.setVerticalAlignment(SwingConstants.CENTER);
		label_time.setHorizontalAlignment(SwingConstants.CENTER);
		panel_time.add(label_time);
		
		// The Action or Button Panel
		JPanel panel_actions = new JPanel();
		panel_actions.setLayout(new BoxLayout(panel_actions, BoxLayout.Y_AXIS));
		panel_actions.setBorder(BorderFactory.createTitledBorder("Controls"));
		panel_actions.setPreferredSize(new Dimension(125, 100));
		btn_start_stop = new JButton("Start");
		btn_start_stop.setMaximumSize(new Dimension(125, 70));
		btn_start_stop.setToolTipText("Press \"S\" to start or stop the timer.");
		btn_start_stop.addActionListener(new ButtonsListener());
		JButton btn_reset = new JButton("Reset");
		btn_reset.setMaximumSize(new Dimension(125, 30));
		btn_reset.setToolTipText("Press \"R\" to reset the timer.");
		btn_reset.addActionListener(new ButtonsListener());
		panel_actions.add(btn_start_stop);
		panel_actions.add(btn_reset);
		
		// Adding all elements to the frame
		frame.add(panel_time);
		frame.add(panel_actions);
		frame.setMinimumSize(new Dimension(250, 100));
		frame.pack();
		frame.setVisible(true);
	}
	
	private void toogleTime() {
		if (timer.isRunning()) {
			stopTimer();
			btn_start_stop.setText("Start");
		} else {
			startTimer();
			btn_start_stop.setText("Stop");
		}
	}
	
	private void startTimer() {
		timer.start();
		panel_time.setBackground(startColor);
		label_time.setForeground(Color.white);
		ReFocus();
	}
	
	private void stopTimer() {
		timer.stop();
		panel_time.setBackground(stopColor);
		label_time.setForeground(Color.white);
		ReFocus();
	}
	
	private void resetTimer() {
		ticks = 0L;
		timer.restart();
		timer.stop();
		btn_start_stop.setText("Start");
		panel_time.setBackground(Color.white);
		label_time.setForeground(Color.DARK_GRAY);
		updateTimeDisplay();
		ReFocus();
	}
	
	private void updateTimeDisplay() {
		label_time.setText(CalculateTime());
	}
	
	private String CalculateTime() {
		int seconds = (int)(ticks / 10);
		int tenths = (int)(ticks % 10);
		
		return seconds + "." + tenths + "s";
	}
	
	// Found would loss focus on the frame when buttons are pressed
	// added this to ensure that key bindings work after button presses
	private void ReFocus() {
		frame.requestFocus();
	}
	
	private class ButtonsListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			switch (event.getActionCommand()) {
				case "Start":
					toogleTime();
					break;
				case "Stop":
					toogleTime();
					break;
				case "Reset":
					resetTimer();
					break;
				default:
					JOptionPane.showMessageDialog(new JFrame("Error"), "Seems something went wrong...");
			}
		}
	}
	
	private class MnemonicListener implements KeyListener {
		public void keyPressed(KeyEvent event) {
			System.out.println(event.getKeyCode());
			switch (event.getKeyCode()) {
				case KeyEvent.VK_SPACE:
					toogleTime();
					break;
				case KeyEvent.VK_S:
					toogleTime();
					break;
				case KeyEvent.VK_ESCAPE:
					resetTimer();
					break;
				case KeyEvent.VK_R:
					resetTimer();
					break;
			}
		}
		// Had to add with the newest Java SDK
		public void keyTyped(KeyEvent event) {
			// silence
		}
		public void keyReleased(KeyEvent event) {
			// silence
		}
	}
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ticks++;
			updateTimeDisplay();
		}
	}
}
