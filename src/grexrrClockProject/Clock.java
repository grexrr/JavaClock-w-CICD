package grexrrClockProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class Clock {

	public static void main(String[] args) {
		if (args.length > 0 && args[0].equals("gui")) {
			startGUI();
		} else {
			startConsole();
		}
		 
	}
	
	public static void startConsole() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		 while(true) {
			 LocalDateTime now = LocalDateTime.now();
			 System.out.println(dtf.format(now));
			 try {
				 Thread.sleep(1000);
			 } catch(InterruptedException ex) {
				 Thread.currentThread().interrupt();
			 }
		 }
	}
	
	public static void startGUI() {
		JFrame frame = new JFrame("ClockUI");
		JLabel timeLabel = new JLabel("Time", SwingConstants.CENTER);
		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(timeLabel);
		frame.setVisible(true);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
	    new Timer(1000, e -> timeLabel.setText(dtf.format(LocalDateTime.now()))).start();
	}
}
